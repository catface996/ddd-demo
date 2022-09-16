package com.catface.ddd.common.model;

import lombok.Data;

/**
 * @author catface
 * @since 2022/9/16
 */
@Data
public class Bar {

  /**
   * bar实体ID
   */
  private Long id;

  /**
   * bar实体描述
   */
  private String desc;

  public Bar() {

  }

  public Bar(Long id, String desc) {
    this.id = id;
    this.desc = desc;
  }
}
