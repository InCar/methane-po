package com.incarcloud.methane.comm;

import com.incarcloud.std.HelloServiceV1Grpc;
import com.incarcloud.std.HelloV;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

/**
 * 直接利用GRPC的收发器实现
 */
class TransceiverGRPC extends Transceiver {
    private Server _grpcSrv = null;

    // TODO: Add Get/Set
    private int _port = 9999;

    @Override
    public void Start() {
        // Create google RPC server
        _grpcSrv = ServerBuilder.forPort(_port)
                .addService(new HelloServiceV1Impl(this))
                .build();

        try{
            _grpcSrv.start();
        }catch (IOException ex) {
            // TODO:
        }
    }

    @Override
    public void Stop() {
        if(_grpcSrv != null)
            _grpcSrv.shutdown();
    }

    @Override
    public HelloV.HelloResponseV1 OnReceive(HelloV.HelloRequestV1 input) {
        return super.OnReceive(input);
    }
}

/**
 * GRPC服务
 */
class HelloServiceV1Impl extends HelloServiceV1Grpc.HelloServiceV1ImplBase{
    private final TransceiverGRPC _transceiver;

    public HelloServiceV1Impl(TransceiverGRPC transceiver){
        _transceiver = transceiver;
    }

    @Override
    public void hello(HelloV.HelloRequestV1 request, StreamObserver<HelloV.HelloResponseV1> responseObserver) {
        HelloV.HelloResponseV1 response = _transceiver.OnReceive(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
