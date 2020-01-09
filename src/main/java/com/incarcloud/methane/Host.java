package com.incarcloud.methane;

import com.incarcloud.methane.comm.Transceiver;
import com.incarcloud.methane.comm.TransceiverFactory;
import com.incarcloud.methane.mgr.VehicleMgr;
import com.incarcloud.methane.monitor.MonitorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 宿主
 */
@Component @Scope(SCOPE_PROTOTYPE)
public final class Host {
    // TODO: From configuration
    private int _port = 9999;
    // Google RPC Server
    private Server _grpcServer = null;

    // GRPC Server Builder
    private ServerBuilder<?> _grpcBuilder = null;

    @Autowired
    private TransceiverFactory _tsFactory;

    // 收发器
    private Transceiver _transceiver = null;

    // 车辆管理
    @Autowired
    private VehicleMgr _vehicleMgr;

    @Autowired
    private MonitorService _monitorService;

    /**
     * 配置
     */
    public void Config(){
        // google rpc
        _grpcBuilder = ServerBuilder.forPort(_port);

        // 配置收发器
        _transceiver = _tsFactory.Create();
        _transceiver.SetReceiver(_vehicleMgr);
        _transceiver.ConfigureGRPC(_grpcBuilder);

        // 配置监控服务
        _monitorService.SetMonitor(_vehicleMgr);
        _monitorService.ConfigureGRPC(_grpcBuilder);
    }

    /**
     * 启动
     */
    public void Start(){
        // 启动
        try {
            // 收发器开始工作
            _transceiver.Start();
            // 监控服务开始工作
            _monitorService.Start();

            // google RPC 服务开始工作
            _grpcServer = _grpcBuilder.build();
            _grpcServer.start();
        } catch (IOException e) {
            // TODO: log error
        }
    }

    /**
     * 停止
     */
    public void Stop(){
        // 停止
        _grpcServer.shutdown();
        _monitorService.Stop();
        _transceiver.Stop();
    }

    public void BlockAndWait(){
        try {
            _grpcServer.awaitTermination();
        } catch (InterruptedException e) {
            // TODO: log error
        }
    }
}
