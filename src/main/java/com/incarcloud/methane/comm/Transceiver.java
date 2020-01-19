package com.incarcloud.methane.comm;

import com.incarcloud.std.HelloV;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 收发器.和网关通信
 */
public abstract class Transceiver {
    private static final Logger s_logger = LoggerFactory.getLogger(Transceiver.class);
    // 数据处理对象
    private IReceiver _receiver = null;

    /**
     * 由外部指定数据处理对象
     *
     * @param receiver
     */
    public void SetReceiver(IReceiver receiver) {
        _receiver = receiver;
    }

    /**
     * 配置GRPC
     */
    public ServerBuilder<?> ConfigureGRPC(ServerBuilder<?> buider) {
        return buider;
    }

    /**
     * 开始收发数据
     */
    public void Start() {

    }

    /**
     * 停止收发数据
     */
    public void Stop() {

    }

    /**
     * 由派生类在收到网关的数据时调用
     *
     * @param input
     * @return
     */
    protected HelloV.HelloResponseV1 OnReceive(HelloV.HelloRequestV1 input) {
        // 从input中解出数据,交给_receiver进行处理,然后反馈处理结果
        s_logger.info("---onReceive-----" + input.getVin());
        int result = _receiver.OnReceive(input.getVin());
        return HelloV.HelloResponseV1.newBuilder().setRes(result).build();
    }
}
