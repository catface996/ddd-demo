package com.catface.ddd.http.web.foo.convert;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.http.web.foo.request.SayHelloToBarRequest;

/**
 * @author catface
 * @since 2022/9/16
 */
public class FooWebConvert {

  public static Bar convert(SayHelloToBarRequest request) {
    Bar entity = new Bar();
    entity.setId(request.getBarId());
    return entity;
  }

}
