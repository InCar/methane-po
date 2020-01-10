package com.incarcloud.methane.mgr;

/**
 * 车辆业务,一个对象对应一车车辆
 */
class VehicleBiz {
    private int msgCount = 0; //消息计数值
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

        return msgCount;
    }

    public void increaseMsgCount() {
        //累加消息计数
        msgCount++;
    }
}
