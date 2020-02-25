package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 债权表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_debt_info")
public class DebtInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "dId",value = "主键")
	private Long dId;
	/**
	 * 债权编号
	 */
	@ApiModelProperty(name = "dDebtNo",value = "债权编号")
	private String dDebtNo;
	/**
	 * 合同编号
	 */
	@ApiModelProperty(name = "dContractNo",value = "合同编号")
	private String dContractNo;
	/**
	 * 债务人名称
	 */
	@ApiModelProperty(name = "dDebtorsName",value = "债务人名称")
	private String dDebtorsName;
	/**
	 * 债务人身份证号
	 */
	@ApiModelProperty(name = "dDebtorsId",value = "债务人身份证号")
	private String dDebtorsId;
	/**
	 * 借款用途
	 */
	@ApiModelProperty(name = "dLoanPurpose",value = "借款用途")
	private String dLoanPurpose;
	/**
	 * 借款类型
	 */
	@ApiModelProperty(name = "dLoanType",value = "借款类型")
	private String dLoanType;
	/**
	 * 原始借款开始日期
	 */
	@ApiModelProperty(name = "dLoanStartDate",value = "原始借款开始日期")
	private String dLoanStartDate;
	/**
	 * 原始借款期限
	 */
	@ApiModelProperty(name = "dLoanPeriod",value = "原始借款期限")
	private String dLoanPeriod;
	/**
	 * 原始借款到期日期
	 */
	@ApiModelProperty(name = "dLoanEndDate",value = "原始借款到期日期")
	private String dLoanEndDate;
	/**
	 * 还款方式
	 */
	@ApiModelProperty(name = "dRepaymentStyle",value = "还款方式")
	private String dRepaymentStyle;
	/**
	 * 还款日
	 */
	@ApiModelProperty(name = "dRepaymenDate",value = "还款日")
	private String dRepaymenDate;
	/**
	 * 还款金额
	 */
	@ApiModelProperty(name = "dRepaymenMoney",value = "还款金额")
	private String dRepaymenMoney;
	/**
	 * 债权金额
	 */
	@ApiModelProperty(name = "dDebtMoney",value = "债权金额")
	private String dDebtMoney;
	/**
	 * 债权年化利率
	 */
	@ApiModelProperty(name = "dDebtYearRate",value = "债权年化利率")
	private String dDebtYearRate;
	/**
	 * 债权月利率
	 */
	@ApiModelProperty(name = "dDebtMonthRate",value = "债权月利率")
	private String dDebtMonthRate;
	/**
	 * 债权转入金额
	 */
	@ApiModelProperty(name = "dDebtTransferredMoney",value = "债权转入金额")
	private String dDebtTransferredMoney;
	/**
	 * 债权转入日期
	 */
	@ApiModelProperty(name = "dDebtTransferredDate",value = "债权转入日期")
	private String dDebtTransferredDate;
	/**
	 * 债权转入期限
	 */
	@ApiModelProperty(name = "dDebtTransferredPeriod",value = "债权转入期限")
	private String dDebtTransferredPeriod;
	/**
	 * 债权转出日期
	 */
	@ApiModelProperty(name = "dDebtRansferOutDate",value = "债权转出日期")
	private String dDebtRansferOutDate;
	/**
	 * 债权人
	 */
	@ApiModelProperty(name = "dCreditor",value = "债权人")
	private String dCreditor;
	/**
	 * 债权状态
	 */
	@ApiModelProperty(name = "dDebtStatus",value = "债权状态")
	private String dDebtStatus;
	/**
	 * 借款人ID
	 */
	@ApiModelProperty(name = "dBorrowerId",value = "借款人ID")
	private String dBorrowerId;
	/**
	 * 可用期限
	 */
	@ApiModelProperty(name = "dAvailablePeriod",value = "可用期限")
	private String dAvailablePeriod;
	/**
	 * 可用金额
	 */
	@ApiModelProperty(name = "dAvailableMoney",value = "可用金额")
	private String dAvailableMoney;
	/**
	 * 已匹配金额
	 */
	@ApiModelProperty(name = "dMatchedMoney",value = "已匹配金额")
	private String dMatchedMoney;
	/**
	 *  部分匹配11401,  完全匹配11402,   未匹配11403, 正在匹配11404
	 */
	@ApiModelProperty(name = "dMatchedStatus",value = " 部分匹配11401,  完全匹配11402,   未匹配11403, 正在匹配11404")
	private Integer dMatchedStatus;
	/**
	 * 还款方式名称
	 */
	@ApiModelProperty(name = "dRepaymentStyleName",value = "还款方式名称")
	private String dRepaymentStyleName;
	/**
	 * 债权状态名字
	 */
	@ApiModelProperty(name = "dDebtStatusName",value = "债权状态名字")
	private String dDebtStatusName;
	/**
	 * 匹配状态名称
	 */
	@ApiModelProperty(name = "dMatchedStatusName",value = "匹配状态名称")
	private String dMatchedStatusName;
	/**
	 * 标的类型
	 */
	@ApiModelProperty(name = "dDebtType",value = "标的类型")
	private String dDebtType;
	/**
	 * 标的类型名称
	 */
	@ApiModelProperty(name = "dDebtTypeName",value = "标的类型名称")
	private String dDebtTypeName;

}
