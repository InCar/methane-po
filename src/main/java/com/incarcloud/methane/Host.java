package com.incarcloud.methane;

import com.incarcloud.methane.comm.Transceiver;
import com.incarcloud.methane.comm.TransceiverFactory;
import com.incarcloud.methane.mgr.VehicleMgr;
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
    }

    /**
     * 停止
     */
    public void Stop(){
        // TODO: 停止
    }
}
