package com.incarcloud.methane;

import com.incarcloud.methane.comm.Transceiver;
import com.incarcloud.methane.comm.TransceiverFactory;
import com.incarcloud.std.HelloServiceV1Grpc;
import com.incarcloud.std.HelloV;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class TransceiverGRPCTest {

    private static final Logger s_logger = LoggerFactory.getLogger(TransceiverGRPCTest.class);

    @BeforeClass
    public static void startup() {

    }

    @AfterClass
    public static void tearDown() {
    }

    @Test
    public void transceiverGRPC() throws IOException {
        TransceiverFactory transceiverFactory = new TransceiverFactory();
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8888);
        transceiverFactory.setTransceiver("grpc");

        Transceiver target = transceiverFactory.Create();
        MockReceiver mockReceiver = new MockReceiver();
        target.SetReceiver(mockReceiver);
        target.Start();
        serverBuilder = target.ConfigureGRPC(serverBuilder);
        Server channel = serverBuilder.build();
        channel.start();

        ManagedChannel _channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8888)
                .usePlaintext()
                .build();
        HelloServiceV1Grpc.HelloServiceV1BlockingStub _blockingStub = HelloServiceV1Grpc.newBlockingStub(_channel);
        HelloV.HelloRequestV1 helloRequestV1 = HelloV.HelloRequestV1.newBuilder().setVin("test1").build();
        HelloV.HelloResponseV1 hello = _blockingStub.hello(helloRequestV1);
        int res = hello.getRes();
        s_logger.info("res:" + res);

        List<String> testList = mockReceiver.getTestList();
        for (String s : testList) {
            s_logger.info("received {} ", s);
        }
    }
}
