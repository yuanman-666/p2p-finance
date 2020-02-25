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
 * 匹配结果表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_matched_result")
public class MatchedResultEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "iId",value = "主键")
	private Long iId;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "iUserId",value = "用户id")
	private String iUserId;
	/**
	 * 债权id
	 */
	@ApiModelProperty(name = "iClaimsId",value = "债权id")
	private String iClaimsId;
	/**
	 * 投资记录主键
	 */
	@ApiModelProperty(name = "iInvestNo",value = "投资记录主键")
	private String iInvestNo;
	/**
	 * 交易流水号
	 */
	@ApiModelProperty(name = "iTransferSerialNo",value = "交易流水号")
	private String iTransferSerialNo;
	/**
	 * 购买金额（匹配金额）
	 */
	@ApiModelProperty(name = "iBidMoney",value = "购买金额（匹配金额）")
	private BigDecimal iBidMoney;
	/**
	 * 购买日期（匹配日期）
	 */
	@ApiModelProperty(name = "iConfirmDate",value = "购买日期（匹配日期）")
	private Date iConfirmDate;
	/**
	 * 是否确认,11702:未确认,11701:已确认
	 */
	@ApiModelProperty(name = "iIsConfirmed",value = "是否确认,11702:未确认,11701:已确认")
	private String iIsConfirmed;
	/**
	 * 匹配上的日期
	 */
	@ApiModelProperty(name = "iMatchedDate",value = "匹配上的日期")
	private Date iMatchedDate;
	/**
	 * 资金类型
	 */
	@ApiModelProperty(name = "iInvestType",value = "资金类型")
	private String iInvestType;
	/**
	 * 债权类型
	 */
	@ApiModelProperty(name = "iDebtType",value = "债权类型")
	private String iDebtType;
	/**
	 * 是否清算过,11802:未清算,11801:已清算
	 */
	@ApiModelProperty(name = "iIsExecuted",value = "是否清算过,11802:未清算,11801:已清算")
	private String iIsExecuted;

}
