package com.catface.ddd.domain.biz.service.foo;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.common.model.Foo;

/**
 * @author catface
 * @since 2022/9/16
 */
public interface FooService {

  /**
   * Foo跟Bar打招呼
   *
   * @param bar 待打招呼的bar对象
   * @return 要打招呼的Foo
   */
  Foo sayHello(Bar bar);

}
