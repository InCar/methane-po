package com.incarcloud.methane.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 收发器工厂
 * 根据传入的配置来决定实例化具体的收发器
 */
@Component
@Scope(SCOPE_PROTOTYPE)
public final class TransceiverFactory {

    @Value(value = "${transceiver}")
    private int transceiver;

    /**
     * 创建收发器
     *
     * @return
     */
    public Transceiver Create() {
        //根据配置项创建具体的收发器 1：GRPC 2：kafka 3：RocketMQ
        // TransceiverKafka || TransceiverRocketMQ || TransceiverGRPC
        Transceiver ts = null;
        if (transceiver == 1) {
            ts = new TransceiverGRPC();
        } else if (transceiver == 2) {
            //ts = new TransceiverKafka;
        } else if (transceiver == 3) {
            //ts = new TransceiverRocketMQ;
        } else { //其他类型暂不支持
            throw new RuntimeException("Not Supported!");
        }
        return ts;
    }
}
