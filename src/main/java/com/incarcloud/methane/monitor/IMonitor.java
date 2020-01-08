package com.incarcloud.methane.monitor;

import java.util.List;
import java.util.Map;

/**
 * 监控业务需要实现该接口
 */
public interface IMonitor {
    /**
     * 查询车辆总数
     */
    int GetTotalVinCount();

    /**
     * 查询所有vin
     */
    List<String> GetAllVins();

    /**
     * 单车计数值查询
     */
    int GetMsgCount(String vin);

    /**
     * 批量查询
     */
    Map<String, Integer> GetMsgCounts(List<String> listVins);
}
