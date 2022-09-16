package com.catface.ddd.repository.foo;

import com.catface.ddd.common.model.Foo;

/**
 * @author catface
 * @since 2022/9/16
 */
public interface FooRepository {

  /**
   * 根据Foo Id查找Foo
   *
   * @param id foo的ID
   * @return 查找到的foo
   */
  Foo findById(Long id);
}
