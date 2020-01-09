package com.incarcloud.methane.comm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * 收发器工厂
 * 根据传入的配置来决定实例化具体的收发器
 */
@Component @Scope(SCOPE_PROTOTYPE)
public final class TransceiverFactory {

    /**
     * 创建收发器
     * @return
     */
    public Transceiver Create(){
        // TODO: 根据配置项创建具体的收发器
        // TransceiverKafka || TransceiverRocketMQ || TransceiverGRPC
        Transceiver ts = new TransceiverGRPC();
        return ts;
    }
}
