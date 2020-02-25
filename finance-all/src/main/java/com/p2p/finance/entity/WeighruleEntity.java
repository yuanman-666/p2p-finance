package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 权重规则表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_weighrule")
public class WeighruleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 类别编号
	 */
	@ApiModelProperty(name = "tSerialno",value = "类别编号")
	private Integer tSerialno;
	/**
	 * 权重规则类型名称
	 */
	@ApiModelProperty(name = "tWeighruleName",value = "权重规则类型名称")
	private String tWeighruleName;
	/**
	 * 权重类别  资金类 140 债权类 140
	 */
	@ApiModelProperty(name = "tWeigthruleClass",value = "权重类别  资金类 140 债权类 140")
	private String tWeigthruleClass;
	/**
	 * 权重类型   
	 */
	@ApiModelProperty(name = "tWeigthType",value = "权重类型   ")
	private Integer tWeigthType;
	/**
	 * 权重值
	 */
	@ApiModelProperty(name = "tWeigthValue",value = "权重值")
	private Integer tWeigthValue;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "tOrder",value = "排序")
	private Integer tOrder;
	/**
	 * 权重类别名称
	 */
	@ApiModelProperty(name = "tWeigthruleClassname",value = "权重类别名称")
	private String tWeigthruleClassname;

}
