package com.catface.ddd.publisher.foo;

import com.catface.ddd.publisher.foo.message.FooMessage;

/**
 * @author catface
 * @since 2023/5/1
 */
public interface FooPublisher {

    /**
     * 发送foo消息
     *
     * @param message 消息体,id和name
     * @return 返回结果
     */
    String sendFooMessage(FooMessage message);
}
