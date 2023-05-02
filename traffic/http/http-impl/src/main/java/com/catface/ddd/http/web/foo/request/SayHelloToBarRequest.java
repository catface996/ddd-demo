package com.catface.ddd.http.web.foo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/9/16
 */
@ApiModel(description = "向bar打招呼的请求")
@Data
public class SayHelloToBarRequest {

  @ApiModelProperty(value = "被打招呼的bar的ID", required = true, example = "12121212")
  @NotNull(message = "bar的ID不能为空")
  private Long barId;

}
