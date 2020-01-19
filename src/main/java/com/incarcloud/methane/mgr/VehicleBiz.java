package com.incarcloud.methane.mgr;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 车辆业务,一个对象对应一车车辆
 */
class VehicleBiz {
    private AtomicInteger msgCount = new AtomicInteger(0); //消息计数值
    private String vin; //车架号

    // 车架号
    public String getVin() {
        return vin;
    }

    public void setVin(String value) {
        this.vin = value;
    }

    // 消息计数器
    public int getTotalMsgCount() {
        //获取当前的消息计数值

        return msgCount.get();
    }

    public void increaseMsgCount() {
        //累加消息计数
        msgCount.incrementAndGet();
    }
}
