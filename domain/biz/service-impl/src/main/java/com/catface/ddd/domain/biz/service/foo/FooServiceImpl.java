package com.catface.ddd.domain.biz.service.foo;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.common.model.Foo;
import com.catface.ddd.publisher.foo.FooPublisher;
import com.catface.ddd.publisher.foo.message.FooMessage;
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

  private final FooPublisher fooPublisher;

  public FooServiceImpl(BarRepository barRepository, FooPublisher fooPublisher) {
    this.barRepository = barRepository;
    this.fooPublisher = fooPublisher;
  }

  /**
   * Foo跟Bar打招呼
   *
   * @param bar 待打招呼的bar对象
   * @return 要打招呼的Foo
   */
  @Override
  public Foo sayHello(Bar bar) {
    Bar barEntity = barRepository.findById(bar.getId());
    log.info("foo say hello to bar:{}",barEntity);
    FooMessage message = new FooMessage();
    fooPublisher.sendFooMessage(message);
    return new Foo(1L, "wa ya ya,I am big hammer wang");
  }

}
