package com.incarcloud.methane.comm;

import com.incarcloud.std.HelloV;

/**
 * 收发器.和网关通信
 */
public abstract class Transceiver {
    // 数据处理对象
    private IReceiver _receiver = null;

    /**
     * 由外部指定数据处理对象
     * @param receiver
     */
    public void SetReceiver(IReceiver receiver){
        _receiver = receiver;
    }

    /**
     * 开始收发数据
     */
    public void Start(){
        // TODO:
    }

    /**
     * 停止收发数据
     */
    public void Stop(){
        // TODO:
    }

    /**
     * 由派生类在收到网关的数据时调用
     * @param input
     * @return
     */
    protected HelloV.HelloResponseV1 OnReceive(HelloV.HelloRequestV1 input){
        // TODO: 从input中解出数据,交给_receiver进行处理,然后反馈处理结果
        // int result = _receiver.OnReceive(vin);
        return null;
    }
}
