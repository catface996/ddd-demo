package com.catface.ddd.publisher.rocketmq.foo;

import com.catface.ddd.publisher.foo.FooPublisher;
import com.catface.ddd.publisher.foo.message.FooMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2023/5/2
 */
@Slf4j
@Service
public class FooPublisherImpl implements FooPublisher {
    /**
     * 发送foo消息
     *
     * @param message 消息体,id和name
     * @return 返回结果
     */
    @Override
    public String sendFooMessage(FooMessage message) {
        log.info("rocketmq send foo message success");
        return "rocketmq send success";
    }
}
