package com.incarcloud.methane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    private final static Logger s_logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Autowired
    private Host _host;

    @Override
    public void run(String... args) {
        logStartupInfo();

        // 配置
        _host.Config();
        // 启动
        _host.Start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            _host.Stop();
            s_logger.info("Shutdown.");
        }));

        _host.BlockAndWait();
    }

    private void logStartupInfo(){
        s_logger.info("appver: {}", GitVer.getVersion());

        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        final Configuration config = ctx.getConfiguration();
        s_logger.info("Active log4j config file: {}", config.getName());
    }
}
