package com.catface.ddd.rpc.foo.request;

import lombok.Data;

/**
 * @author catface
 * @since 2022/9/16
 */
@Data
public class CallTestRequest {

  private Long id;

  private String text;
}
