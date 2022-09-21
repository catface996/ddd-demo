package com.catface.ddd.repository.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 交易子单
 * </p>
 *
 * @author catface
 * @since 2022-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SubOrder对象", description="交易子单")
public class SubOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "会员ID")
    private String memberId;

    @ApiModelProperty(value = "主单ID")
    private Long mainOrderId;

    @ApiModelProperty(value = "交易子单配置ID")
    private Integer subConfigId;

    @ApiModelProperty(value = "交易子业务单上下文")
    private String subOrderContext;

    @ApiModelProperty(value = "tcc状态")
    private Integer tccStatus;

    @ApiModelProperty(value = "最大重试次数，来源编排规则")
    private Integer maxTryTimes;

    @ApiModelProperty(value = "重试次数")
    private Integer realTryTimes;

    @ApiModelProperty(value = "最大确认次数")
    private Integer maxConfirmTimes;

    @ApiModelProperty(value = "实际重试次数")
    private Integer realConfirmTimes;

    @ApiModelProperty(value = "最大取消次数")
    private Integer maxCancelTimes;

    @ApiModelProperty(value = "实际取消次数")
    private Integer realCancelTimes;

    @ApiModelProperty(value = "是否允许自动提交")
    private Boolean autoConfirm;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreated;

    @ApiModelProperty(value = "修改时间")
    private Date gmtModified;


}
