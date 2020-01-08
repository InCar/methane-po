package com.incarcloud.methane.monitor;

import com.incarcloud.std.CountServiceV1Grpc;
import com.incarcloud.std.HelloM;
import com.incarcloud.std.HelloV;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class MonitorService extends CountServiceV1Grpc.CountServiceV1ImplBase {
    private Server _grpcSrv = null;

    // 实际承载业务
    private IMonitor _monitor = null;

    // TODO: Get/Set
    private int _port = 8888;

    /**
     * 设置业务逻辑的实际实现
     * @param monitor
     */
    public void SetMonitor(IMonitor monitor){
        _monitor = monitor;
    }

    public void Start(){
        _grpcSrv = ServerBuilder.forPort(_port)
                .addService(this)
                .build();

        try{
            _grpcSrv.start();
        }catch (IOException ex) {
            // TODO:
        }
    }

    @Override
    public void count(HelloM.HelloCountArgV1 request, StreamObserver<HelloM.HelloCountV1> responseObserver) {
        Map<String,Integer> mapResult = _monitor.GetMsgCounts(null);
        List<HelloM.VinCount> list = new ArrayList<>(mapResult.size());
        mapResult.forEach((k, v)->{
            list.add(HelloM.VinCount.newBuilder().setVin(k).setCount(v).build());
        });
        HelloM.HelloCountV1 helloCountV1 = HelloM.HelloCountV1.newBuilder().addAllList(list).build();
        responseObserver.onNext(helloCountV1);
        responseObserver.onCompleted();
    }
}
