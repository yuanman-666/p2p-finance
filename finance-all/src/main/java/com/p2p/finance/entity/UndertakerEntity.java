package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 手续费表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_undertaker")
public class UndertakerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 手续费
	 */
	@ApiModelProperty(name = "tCost",value = "手续费")
	private BigDecimal tCost;
	/**
	 * 承担者: 1 表示用户承担，0 表示平台承担
	 */
	@ApiModelProperty(name = "tUndertaker",value = "承担者: 1 表示用户承担，0 表示平台承担")
	private Integer tUndertaker;
	/**
	 * 0 充值; 1提现
	 */
	@ApiModelProperty(name = "tType",value = "0 充值; 1提现")
	private Integer tType;

}
