package com.incarcloud.methane;

import com.incarcloud.methane.monitor.MonitorService;
import com.incarcloud.std.CountServiceV1Grpc;
import com.incarcloud.std.HelloM;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class MonitorTest {

    private static final Logger s_logger = LoggerFactory.getLogger(TransceiverGRPCTest.class);

    @Test
    public void monitor() throws IOException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8888);
        MonitorService target = new MonitorService();

        MockMonitor mockMonitor = new MockMonitor();
        target.SetMonitor(mockMonitor);
        target.Start();
        serverBuilder = target.ConfigureGRPC(serverBuilder);
        Server channel = serverBuilder.build();
        channel.start();

        ManagedChannel _channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8888)
                .usePlaintext()
                .build();

        CountServiceV1Grpc.CountServiceV1BlockingStub _blockingStub = CountServiceV1Grpc.newBlockingStub(_channel);
        HelloM.HelloCountArgV1 argV1 = HelloM.HelloCountArgV1.newBuilder().build();
        HelloM.HelloCountV1 result = _blockingStub.count(argV1);

        List<HelloM.VinCount> listList = result.getListList();
        for (HelloM.VinCount vinCount : listList) {
            s_logger.info("received {} ", vinCount.getVin());
            s_logger.info("count {} ", vinCount.getCount());
        }
    }
}
