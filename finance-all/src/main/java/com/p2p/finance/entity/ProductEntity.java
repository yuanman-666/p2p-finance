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
 * 理财产品表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_product")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 产品id
	 */
	@TableId
	@ApiModelProperty(name = "tPid",value = "产品id")
	private Long tPid;
	/**
	 * 转让封闭期
	 */
	@ApiModelProperty(name = "tClosePreiod",value = "转让封闭期")
	private Date tClosePreiod;
	/**
	 * 提前赎回类型
	 */
	@ApiModelProperty(name = "tEarlyRedeptionType",value = "提前赎回类型")
	private String tEarlyRedeptionType;
	/**
	 * 收益利率类型（134：年利率 ，135：月利率）
	 */
	@ApiModelProperty(name = "tEartingType",value = "收益利率类型（134：年利率 ，135：月利率）")
	private String tEartingType;
	/**
	 * 数量规则
	 */
	@ApiModelProperty(name = "tInvestRule",value = "数量规则")
	private String tInvestRule;
	/**
	 * 是否可转让
	 */
	@ApiModelProperty(name = "tAllowTransfer",value = "是否可转让")
	private Integer tAllowTransfer;
	/**
	 * 是否复投
	 */
	@ApiModelProperty(name = "tIsRepeatInvest",value = "是否复投")
	private Integer tIsRepeatInvest;
	/**
	 * 产品最低期限
	 */
	@ApiModelProperty(name = "tLowerLimit",value = "产品最低期限")
	private String tLowerLimit;
	/**
	 * 产品起投金额
	 */
	@ApiModelProperty(name = "tLowerInvest",value = "产品起投金额")
	private BigDecimal tLowerInvest;
	/**
	 * 产品编号
	 */
	@ApiModelProperty(name = "tPronum",value = "产品编号")
	private String tPronum;
	/**
	 * 产品类型id
	 */
	@ApiModelProperty(name = "tProtypeId",value = "产品类型id")
	private String tProtypeId;
	/**
	 * 产品投资上限
	 */
	@ApiModelProperty(name = "tUpperInvest",value = "产品投资上限")
	private String tUpperInvest;
	/**
	 * 产品名称
	 */
	@ApiModelProperty(name = "tProductName",value = "产品名称")
	private String tProductName;
	/**
	 * 状态(0:表示正常；1：表示停用)
	 */
	@ApiModelProperty(name = "tStatus",value = "状态(0:表示正常；1：表示停用)")
	private Integer tStatus;
	/**
	 * 产品最大期限
	 */
	@ApiModelProperty(name = "tUpperLimit",value = "产品最大期限")
	private String tUpperLimit;
	/**
	 * 回款方式（109：表示一次性回款 ，110：每月提取，到期退出）
	 */
	@ApiModelProperty(name = "tReturnMoney",value = "回款方式（109：表示一次性回款 ，110：每月提取，到期退出）")
	private String tReturnMoney;

}
