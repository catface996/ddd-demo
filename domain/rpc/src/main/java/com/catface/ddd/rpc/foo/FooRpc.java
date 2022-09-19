package com.catface.ddd.rpc.foo;

import com.catface.ddd.rpc.foo.request.CallTestRequest;
import com.catface.ddd.rpc.foo.response.TestResponse;

/**
 * @author catface
 * @since 2022/9/16
 */
public interface FooRpc {


  /**
   * 调用测试
   *
   * @param request 测试文本
   * @return 响应结果
   */
  TestResponse callTest(CallTestRequest request);
}
