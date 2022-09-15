package com.catface.ddd.http.web.demo;

import com.catface.ddd.http.config.SwaggerTagConst;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/9/15
 */
@Api(tags = {SwaggerTagConst.DEMO})
@Slf4j
@RestController
public class DemoController {

  /**
   * 测试
   *
   * @return 测试内容
   */
  @ApiOperation(value = "测试接口")
  @PostMapping(value = "/public/demo/test")
  public String test() {
    return "test";
  }

}
