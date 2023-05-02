package com.catface.ddd.http.api.hello;

import com.catface.ddd.http.api.hello.request.SayHelloRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author catface
 * @since 2022/9/15
 */
@FeignClient(name = "helloApi", url = "${rpc.ddd.service}", fallbackFactory = HelloApiFallback.class)
public interface HelloApi {

  /**
   * 说,你好接口
   *
   * @param request 打招呼请求,姓名,性别
   * @return 问候语
   */
  @PostMapping(value = "/private/hello/sayHello")
  String sayHello(SayHelloRequest request);
}
