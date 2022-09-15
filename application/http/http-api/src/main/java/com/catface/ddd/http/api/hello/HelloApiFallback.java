package com.catface.ddd.http.api.hello;

import com.catface.ddd.http.api.hello.request.SayHelloRequest;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author catface
 * @since 2022/9/15
 */
@Slf4j
@Component
public class HelloApiFallback implements FallbackFactory<HelloApi> {


  @Override
  public HelloApi create(Throwable cause) {
    return new HelloApi() {
      @Override
      public String sayHello(SayHelloRequest request) {
        log.error("打招呼失败了,请求:{}", request, cause);
        return "haha";
      }
    };
  }
}
