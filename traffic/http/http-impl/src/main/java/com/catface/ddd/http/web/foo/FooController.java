package com.catface.ddd.http.web.foo;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.common.model.Foo;
import com.catface.ddd.domain.biz.service.foo.FooService;
import com.catface.ddd.http.config.SwaggerTagConst;
import com.catface.ddd.http.web.foo.convert.FooWebConvert;
import com.catface.ddd.http.web.foo.request.SayHelloToBarRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/9/16
 */
@Api(tags = {SwaggerTagConst.FOO})
@Slf4j
@RestController
public class FooController {

  /**
   * TODO Question: 能否在这里声明引入FooServiceImpl
   */
  private final FooService fooService;

  public FooController(FooService fooService) {
    this.fooService = fooService;
  }

  @ApiOperation(value = "foo跟bar打招呼")
  @PostMapping(value = "/public/foo/sayHello")
  public String sayHello(@RequestBody @Valid SayHelloToBarRequest request) {
    log.info("receive sayHello request:{}",request);
    Bar barEntity = FooWebConvert.convert(request);
    Foo fooEntity = fooService.sayHello(barEntity);
    return fooEntity.getDesc();
  }

}
