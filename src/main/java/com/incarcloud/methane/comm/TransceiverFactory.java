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
    private String transceiver;

    public void setTransceiver(String transceiver) {
        this.transceiver = transceiver;
    }

    /**
     * 创建收发器
     *
     * @return
     */
    public Transceiver Create() {
        //根据配置项创建具体的收发器 1：GRPC 2：kafka 3：RocketMQ
        // TransceiverKafka || TransceiverRocketMQ || TransceiverGRPC
        Transceiver ts = null;
        if (transceiver.equals("grpc")) {
            ts = new TransceiverGRPC();
        } else if (transceiver.equals("kafka")) {
            //ts = new TransceiverKafka;
            throw new RuntimeException("kafka Not Supported!");
        } else if (transceiver.equals("RocketMQ")) {
            //ts = new TransceiverRocketMQ;
            throw new RuntimeException("rocket Not Supported!");
        } else { //其他类型暂不支持
            throw new RuntimeException("Not Supported!");
        }
        return ts;
    }
}
