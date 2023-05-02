package com.catface.ddd.dubbo.api.demo.response;

import lombok.Data;

/**
 * @author catface
 * @since 2022/9/15
 */
@Data
public class DubboResponse {

  private Boolean result;

  public DubboResponse() {
  }

  public DubboResponse(Boolean result) {
    this.result = result;
  }


}
