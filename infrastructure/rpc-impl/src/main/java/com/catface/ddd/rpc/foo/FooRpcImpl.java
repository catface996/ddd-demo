package com.catface.ddd.rpc.foo;

import com.catface.ddd.rpc.foo.request.CallTestRequest;
import com.catface.ddd.rpc.foo.response.TestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/9/19
 */
@Slf4j
@Service
public class FooRpcImpl implements FooRpc {

  /**
   * 调用测试
   *
   * @param request 测试文本
   * @return 响应结果
   */
  @Override
  public TestResponse callTest(CallTestRequest request) {
    return new TestResponse(11L,"response");
  }
}
