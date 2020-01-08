package com.incarcloud.methane.comm;

/**
 * 处理数据的类应当实现此接口
 */
public interface IReceiver {

    /**
     * 在此方法内部完成对数据的处理
     * @param vin 车架号
     * @return 正值代表成功,负值代表失败
     */
    int OnReceive(String vin);
}
