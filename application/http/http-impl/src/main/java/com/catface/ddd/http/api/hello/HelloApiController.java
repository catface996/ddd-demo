package com.catface.ddd.http.api.hello;

import com.catface.ddd.http.api.hello.request.SayHelloRequest;
import com.catface.ddd.http.config.SwaggerTagConst;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/9/15
 */
@Api(tags = {SwaggerTagConst.HELLO})
@Slf4j
@RestController
public class HelloApiController implements HelloApi {


  /**
   * 说,你好接口
   *
   * @param request 打招呼请求,姓名,性别
   * @return 问候语
   */
  @ApiOperation(value = "说,你好接口")
  @Override
  public String sayHello(SayHelloRequest request) {
    return "hello";
  }
}
