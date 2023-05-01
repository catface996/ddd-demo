package com.catface.ddd.repository.mysql.foo;

import com.catface.ddd.common.model.Foo;
import com.catface.ddd.repository.foo.FooRepository;

/**
 * @author catface
 * @since 2022/9/16
 */
public class FooRepositoryImpl implements FooRepository {

  /**
   * 根据Foo Id查找Foo
   *
   * @param id foo的ID
   * @return 查找到的foo
   */
  @Override
  public Foo findById(Long id) {
    return new Foo(id,"FooFoo...");
  }
}
