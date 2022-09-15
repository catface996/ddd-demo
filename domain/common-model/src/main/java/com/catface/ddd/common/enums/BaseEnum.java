package com.catface.ddd.common.enums;

/**
 * @author catface
 * @since 2022/9/15
 */
public interface BaseEnum {

  /**
   * 获取枚举值编码,可以用于转换成枚举值的字符串,一般是name
   *
   * @return 枚举值编码
   */
  String getCode();

  /**
   * 获取枚举值的描述信息
   *
   * @return 描述
   */
  String getDesc();

}
