package com.incarcloud.methane;

import com.incarcloud.methane.comm.Transceiver;
import com.incarcloud.methane.comm.TransceiverFactory;
import com.incarcloud.methane.monitor.MonitorService;
import com.incarcloud.std.CountServiceV1Grpc;
import com.incarcloud.std.HelloM;
import com.incarcloud.std.HelloServiceV1Grpc;
import com.incarcloud.std.HelloV;
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

public class VehicleMgrTest {
    private static final Logger s_logger = LoggerFactory.getLogger(TransceiverGRPCTest.class);

    @Test
    public void vehicleMgrTest() throws IOException {
        TransceiverFactory transceiverFactory = new TransceiverFactory();
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8888);
        transceiverFactory.setTransceiver("grpc");

        Transceiver transTarget = transceiverFactory.Create();
        MockMonitor mockMonitor = new MockMonitor();
        transTarget.SetReceiver(mockMonitor);
        transTarget.Start();
        serverBuilder = transTarget.ConfigureGRPC(serverBuilder);
        Server channel = serverBuilder.build();
        channel.start();

        ManagedChannel _channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8888)
                .usePlaintext()
                .build();
        HelloServiceV1Grpc.HelloServiceV1BlockingStub _blockingStub = HelloServiceV1Grpc.newBlockingStub(_channel);
        HelloV.HelloRequestV1 helloRequestV1 = HelloV.HelloRequestV1.newBuilder().setVin("test1").build();
        HelloV.HelloResponseV1 hello = _blockingStub.hello(helloRequestV1);
        _blockingStub.hello(helloRequestV1);
        _blockingStub.hello(helloRequestV1);

        int res = hello.getRes();
        Assert.assertTrue(res > 0);

        serverBuilder = ServerBuilder.forPort(9999);
        MonitorService monitorTarget = new MonitorService();
        monitorTarget.SetMonitor(mockMonitor);
        monitorTarget.Start();
        serverBuilder = monitorTarget.ConfigureGRPC(serverBuilder);
        Server monitorChannel = serverBuilder.build();
        monitorChannel.start();

        _channel = ManagedChannelBuilder.forAddress("127.0.0.1", 9999)
                .usePlaintext()
                .build();
        CountServiceV1Grpc.CountServiceV1BlockingStub _monitorBlockingStub = CountServiceV1Grpc.newBlockingStub(_channel);
        HelloM.HelloCountArgV1 argV1 = HelloM.HelloCountArgV1.newBuilder().build();
        HelloM.HelloCountV1 result = _monitorBlockingStub.count(argV1);

        List<HelloM.VinCount> listList = result.getListList();
        for (HelloM.VinCount vinCount : listList) {
            s_logger.info("received {} ", vinCount.getVin());
            s_logger.info("count {} ", vinCount.getCount());
        }

        /*Map<String, Integer> map = mockMonitor.GetMsgCounts(null);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            s_logger.info("monitor{}",entry.getKey());
            s_logger.info("monitor{}",entry.getValue());
        }
        int test1 = mockMonitor.GetMsgCount("test1");
        s_logger.info("number:" + test1);*/

    }
}
