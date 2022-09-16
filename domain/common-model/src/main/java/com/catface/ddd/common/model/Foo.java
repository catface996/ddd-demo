package com.catface.ddd.common.model;

import lombok.Data;

/**
 * @author catface
 * @since 2022/9/16
 */
@Data
public class Foo {

  /**
   * Foo实体的ID
   */
  private Long id;

  /**
   * Foo实体描述
   */
  private String desc;

  public Foo(Long id, String desc) {
    this.id = id;
    this.desc = desc;
  }

}
