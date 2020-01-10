package com.incarcloud.methane.mgr;

import com.incarcloud.methane.comm.IReceiver;
import com.incarcloud.methane.monitor.IMonitor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 车辆管理器
 */
@Component
@Scope(SCOPE_PROTOTYPE)
public final class VehicleMgr implements IReceiver, IMonitor {

    // 车辆业务对象
    private Map<String, VehicleBiz> _mapVehicle = new ConcurrentHashMap<>();

    /**
     * 此方法被收发器调用
     *
     * @param vin 车架号
     * @return 成功返回正值, 失败返回负值
     */
    @Override
    public int OnReceive(String vin) {
        // TODO: 交给_mapVehicle中的一个具体的对象去处理
        try {
            VehicleBiz vehicleBiz = _mapVehicle.get(vin);
            //1、已存在该对象
            if (vehicleBiz != null) {
                return 1;
            } else { //2、不存在创建一个对象
                vehicleBiz = new VehicleBiz();
                vehicleBiz.setVin(vin);
                _mapVehicle.put(vin, vehicleBiz);
                return 1;
            }
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public int GetTotalVinCount() {
        return _mapVehicle.size();
    }

    @Override
    public List<String> GetAllVins() {
        return new ArrayList<>(_mapVehicle.keySet());
    }

    @Override
    public int GetMsgCount(String vin) {
        VehicleBiz vehicleBiz = _mapVehicle.get(vin);
        if (vehicleBiz == null) {
            return 0;
        }
        return vehicleBiz.getTotalMsgCount();
    }

    @Override
    public Map<String, Integer> GetMsgCounts(List<String> listVins) {
        Map<String, Integer> msgCountMap = new HashMap<>();
        for (String vin : listVins) {
            VehicleBiz vehicleBiz = _mapVehicle.get(vin);
            if (vehicleBiz == null) {
                msgCountMap.put(vin, 0);
            } else {
                msgCountMap.put(vin, vehicleBiz.getTotalMsgCount());
            }
        }
        return msgCountMap;
    }
}
