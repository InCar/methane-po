import com.google.protobuf.gradle.*
import org.gradle.kotlin.dsl.provider.gradleKotlinDslOf

group = "com.incarcloud.methane"
version = "1.0.0"

plugins {
    java
    id("org.springframework.boot") version "2.2.2.RELEASE"
    id("com.google.protobuf") version "0.8.11"
}

repositories {
    val maven = "maven"
    val aliyun = "maven.aliyun.com"
    if(project.properties[maven]?.equals(aliyun) == true)
        maven("https://maven.aliyun.com/repository/public")
    else
        mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.2.+"){
        exclude("org.springframework.boot", "spring-boot-starter-logging")
    }
    implementation("com.google.protobuf:protobuf-java:3.11.+")
    implementation("io.grpc:grpc-netty-shaded:1.26.+")
    implementation("io.grpc:grpc-protobuf:1.26.+")
    implementation("io.grpc:grpc-stub:1.26.+")

    implementation("org.slf4j:slf4j-api:1.7.+")
    implementation("org.apache.logging.log4j:log4j-core:2.13.+")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.13.+")

    // Use JUnit test framework
    testImplementation("junit:junit:4.13")
}

tasks.create("markGitVersion"){
    fun String.execute(): String {
        try {
            val parts = this.split("\\s".toRegex())
            val proc = ProcessBuilder(*parts.toTypedArray())
                    .directory(projectDir)
                    .redirectOutput(ProcessBuilder.Redirect.PIPE)
                    .redirectError(ProcessBuilder.Redirect.PIPE)
                    .start()

            proc.waitFor(8, TimeUnit.SECONDS)
            return proc.inputStream.bufferedReader().readText().trim()
        } catch(ex: java.io.IOException) {
            ex.printStackTrace()
            return ex.message?:"IOException"
        }
    }

    doFirst {
        val git = "git -C $projectDir "
        val branch = (git + "symbolic-ref --short HEAD").execute()
        val rev = (git + "rev-list --count HEAD").execute()
        val hash = (git + "rev-parse --short HEAD").execute()
        val hash160 = (git + "rev-parse HEAD").execute()
        val remote = (git + "remote").execute().split("\n").get(0)
        val url = (git + "remote get-url $remote").execute()
        val status = if((git + "status -s").execute().isBlank()) "@" else "+"
        println("\tMark Git Version: $branch.$rev$status$hash\n\t$remote : $url")

        val pkg = project.group.toString()
        val pkgSlash = pkg.replace(".", "/")
        var javaFileContent = File(projectDir, "src/main/java/$pkgSlash/GitVer.jav_").readText()
        javaFileContent = javaFileContent
                .replace("\$package\$", pkg)
                .replace("\$branch\$", branch)
                .replace("\$rev\$", rev)
                .replace("\$hash\$", hash)
                .replace("\$hash160\$", hash160)
                .replace("\$sourceLink\$", url)

        val file = File(projectDir, "src/main/java/$pkgSlash/GitVer.java")
        file.writeText(javaFileContent)
    }
}

tasks.withType<JavaCompile>(){
    options.encoding = "utf-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xdiags:verbose")

    dependsOn("markGitVersion")
}

tasks.named<JavaExec>("bootRun"){
    systemProperties(System.getProperties().mapKeys { it.key as String })
}

tasks.withType<Test>(){
    systemProperties(System.getProperties().mapKeys { it.key as String })

    testLogging{
        events("passed", "skipped", "failed")
        showStandardStreams = true
    }

    val testCaseOnly = "testCaseOnly"
    if(project.hasProperty(testCaseOnly)){
        filter{
            includeTestsMatching(project.properties[testCaseOnly]?.toString())
        }
    }
}

protobuf {
    generatedFilesBaseDir = "$projectDir/src"

    protoc {
        // The artifact spec for the Protobuf Compiler
        artifact = "com.google.protobuf:protoc:3.11.2"
    }

    plugins {
        // Optional: an artifact spec for a protoc plugin, with "grpc" as
        // the identifier, which can be referred to in the "plugins"
        // container of the "generateProtoTasks" closure.
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.26.0"

        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                // Apply the "grpc" plugin whose spec is defined above, without options.
                id("grpc"){
                    outputSubDir = "java"
                }
            }
        }
    }
}

tasks.named("clean"){
    doLast{
        delete("$projectDir/src/main/java/com/incarcloud/std")
    }
}

defaultTasks("assemble")
