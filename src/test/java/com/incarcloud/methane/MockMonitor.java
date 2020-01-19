package com.incarcloud.methane;

import com.incarcloud.methane.comm.IReceiver;
import com.incarcloud.methane.monitor.IMonitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockMonitor implements IReceiver, IMonitor {
    // 车辆业务对象
    private Map<String, Integer> _mapVehicle = new ConcurrentHashMap<>();

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
        return _mapVehicle.get(vin);
    }

    @Override
    public Map<String, Integer> GetMsgCounts(List<String> listVins) {
        return _mapVehicle;
    }

    @Override
    public int OnReceive(String vin) {
        try {
            Integer integer = _mapVehicle.get(vin);
            //1、已存在该对象
            if (integer != null) {
                integer++;
                _mapVehicle.put(vin, integer);
                return integer;
            } else { //2、不存在创建一个对象
                _mapVehicle.put(vin, 1);
                return 1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}
