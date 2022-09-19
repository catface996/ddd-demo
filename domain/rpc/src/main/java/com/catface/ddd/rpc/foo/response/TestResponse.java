package com.catface.ddd.rpc.foo.response;

import lombok.Data;

/**
 * @author catface
 * @since 2022/9/16
 */
@Data
public class TestResponse {

  private Long id;

  private String result;

  public TestResponse() {

  }

  public TestResponse(Long id, String result) {
    this.id = id;
    this.result = result;
  }


}
