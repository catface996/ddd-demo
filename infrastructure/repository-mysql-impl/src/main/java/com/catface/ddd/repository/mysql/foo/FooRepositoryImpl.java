package com.catface.ddd.repository.mysql.foo;

import com.catface.ddd.common.model.Foo;
import com.catface.ddd.repository.foo.FooRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/9/16
 */
@Slf4j
@Service
public class FooRepositoryImpl implements FooRepository {

  /**
   * 根据Foo Id查找Foo
   *
   * @param id foo的ID
   * @return 查找到的foo
   */
  @Override
  public Foo findById(Long id) {
    log.info("this is mysql foo repository implements");
    return new Foo(id,"FooFoo...");
  }
}
