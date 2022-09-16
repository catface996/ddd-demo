package com.catface.ddd.repository.bar;

import com.catface.ddd.common.model.Bar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/9/16
 */
@Slf4j
@Service
public class BarRepositoryImpl implements BarRepository {

  /**
   * 通过ID查找bar实体
   *
   * @param id bar实体的ID
   * @return bar实体
   */
  @Override
  public Bar findById(Long id) {
    return new Bar(id,"BarBar...");
  }
}
