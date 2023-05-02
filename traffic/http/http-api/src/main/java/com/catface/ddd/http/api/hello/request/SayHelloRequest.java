package com.catface.ddd.http.api.hello.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author catface
 * @since 2022/9/15
 */
@ApiModel(description = "说,你好接口")
@Data
public class SayHelloRequest {

  @ApiModelProperty(value = "姓名", required = true, example = "大头儿子")
  @NotBlank(message = "姓名不能为空")
  private String name;

  @ApiModelProperty(value = "性别")
  private Boolean gender;
}
