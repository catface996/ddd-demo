package com.catface.ddd.domain.biz.service.foo;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.common.model.Foo;
import com.catface.ddd.repository.bar.BarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/9/16
 */
@Slf4j
@Service
public class FooServiceImpl implements FooService {

  private final BarRepository barRepository;

  public FooServiceImpl(BarRepository barRepository) {
    this.barRepository = barRepository;
  }

  /**
   * Foo跟Bar打招呼
   *
   * @param bar 待打招呼的bar对象
   * @return 要打招呼的Foo
   */
  @Override
  public Foo sayHello(Bar bar) {
    Bar barFromRepository = barRepository.findById(bar.getId());
    log.info("foo跟bar打招呼,bar:{}",barFromRepository);
    return new Foo(1L, "王大锤,哇呀呀");
  }

}
