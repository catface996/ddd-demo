package com.catface.ddd.dubbo.api.demo;

import com.catface.ddd.dubbo.api.demo.request.DubboRequest;
import com.catface.ddd.dubbo.api.demo.response.DubboResponse;

/**
 * @author catface
 * @since 2022/9/15
 */
public interface DubboApi {

  /**
   * 测试样例
   *
   * @param request 请求参数,ID
   * @return 返回结果, result, true:成功;false:失败
   */
  DubboResponse test(DubboRequest request);

}
