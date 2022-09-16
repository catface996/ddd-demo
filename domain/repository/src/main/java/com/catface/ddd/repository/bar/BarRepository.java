package com.catface.ddd.repository.bar;

import com.catface.ddd.common.model.Bar;

/**
 * @author catface
 * @since 2022/9/16
 */
public interface BarRepository {

  /**
   * 通过ID查找bar实体
   *
   * @param id bar实体的ID
   * @return bar实体
   */
  Bar findById(Long id);
}
