package com.incarcloud.methane;

import com.incarcloud.methane.comm.Transceiver;
import com.incarcloud.methane.comm.TransceiverFactory;
import com.incarcloud.methane.mgr.VehicleMgr;
import com.incarcloud.methane.monitor.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 宿主
 */
@Component @Scope(SCOPE_PROTOTYPE)
public final class Host {

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
     * 启动
     */
    public void Start(){
        // 启动过程
        // TODO: 工厂类根据配置项创建对应的收发器
        // _transceiver = _tsFactory.Create();
        // TODO: 建立收发器和车辆管理之间的联系
        // _transceiver.SetReceiver(_vehicleMgr);
        // TODO: 让收发器开始工作
        // _transceiver.Start();

        // TODO: 建立监控服务和车辆管理之间的联系
        // _monitorService.SetMonitor(_vehicleMgr);
        // TODO: 让监控服务开台工作
        // _monitorService.Start();
    }

    /**
     * 停止
     */
    public void Stop(){
        // TODO: 停止
    }
}
