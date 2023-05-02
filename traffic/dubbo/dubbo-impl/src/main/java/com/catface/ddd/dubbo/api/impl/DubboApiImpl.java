package com.catface.ddd.dubbo.api.impl;

import com.catface.ddd.dubbo.api.demo.DubboApi;
import com.catface.ddd.dubbo.api.demo.request.DubboRequest;
import com.catface.ddd.dubbo.api.demo.response.DubboResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/9/15
 */
@Slf4j
@DubboService
@Service
public class DubboApiImpl implements DubboApi {

  /**
   * 测试样例
   *
   * @param request 请求参数,ID
   * @return 返回结果, result, true:成功;false:失败
   */
  @Override
  public DubboResponse test(DubboRequest request) {
    return new DubboResponse(true);
  }
}
