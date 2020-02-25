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
 * 用户帐户表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_account")
public class AccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 用户的id
	 */
	@ApiModelProperty(name = "tUserid",value = "用户的id")
	private String tUserid;
	/**
	 * 帐户总额
	 */
	@ApiModelProperty(name = "tTotal",value = "帐户总额")
	private BigDecimal tTotal;
	/**
	 * 帐户可余额
	 */
	@ApiModelProperty(name = "tBalance",value = "帐户可余额")
	private BigDecimal tBalance;
	/**
	 * 账户总计冻结总额
	 */
	@ApiModelProperty(name = "tFrozen",value = "账户总计冻结总额")
	private BigDecimal tFrozen;
	/**
	 * 总计待收本金
	 */
	@ApiModelProperty(name = "tInverstmentw",value = "总计待收本金")
	private BigDecimal tInverstmentw;
	/**
	 * 总计待收利息
	 */
	@ApiModelProperty(name = "tInterestTotal",value = "总计待收利息")
	private BigDecimal tInterestTotal;
	/**
	 * 月投总额
	 */
	@ApiModelProperty(name = "tAddCaptialTatal",value = "月投总额")
	private BigDecimal tAddCaptialTatal;
	/**
	 * 月取总额
	 */
	@ApiModelProperty(name = "tRecyclingInterest",value = "月取总额")
	private BigDecimal tRecyclingInterest;
	/**
	 * 月乘总额
	 */
	@ApiModelProperty(name = "tCapitalTotal",value = "月乘总额")
	private BigDecimal tCapitalTotal;
	/**
	 * 已投资总额
	 */
	@ApiModelProperty(name = "tInverstmenta",value = "已投资总额")
	private BigDecimal tInverstmenta;
	/**
	 * 已赚取利息
	 */
	@ApiModelProperty(name = "tInteresta",value = "已赚取利息")
	private BigDecimal tInteresta;
	/**
	 * 申请提现金额
	 */
	@ApiModelProperty(name = "tUapplyExtractMoney",value = "申请提现金额")
	private BigDecimal tUapplyExtractMoney;

}
