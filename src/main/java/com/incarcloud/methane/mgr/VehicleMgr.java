package com.incarcloud.methane.mgr;

import com.incarcloud.methane.comm.IReceiver;
import com.incarcloud.methane.monitor.IMonitor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 车辆管理器
 */
@Component @Scope(SCOPE_PROTOTYPE)
public final class VehicleMgr implements IReceiver, IMonitor {

    // 车辆业务对象
    private Map<String, VehicleBiz> _mapVehicle;

    /**
     * 此方法被收发器调用
     * @param vin 车架号
     * @return 成功返回正值,失败返回负值
     */
    @Override
    public int OnReceive(String vin) {
        // TODO: 交给_mapVehicle中的一个具体的对象去处理
        return -1;
    }

    @Override
    public int GetTotalVinCount() {
        // TODO:
        return 0;
    }

    @Override
    public List<String> GetAllVins() {
        // TODO:
        return null;
    }

    @Override
    public int GetMsgCount(String vin) {
        // TODO:
        return 0;
    }

    @Override
    public Map<String, Integer> GetMsgCounts(List<String> listVins) {
        // TODO:
        return null;
    }
}
