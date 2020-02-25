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
 * 债权还款记录实体类
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_debtor_record")
public class DebtorRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 债权id
	 */
	@ApiModelProperty(name = "tClaimsId",value = "债权id")
	private String tClaimsId;
	/**
	 * 应还日期
	 */
	@ApiModelProperty(name = "tReceivableDate",value = "应还日期")
	private Date tReceivableDate;
	/**
	 * 应还金额
	 */
	@ApiModelProperty(name = "tReceiveableMoney",value = "应还金额")
	private BigDecimal tReceiveableMoney;
	/**
	 * 当前还款期
	 */
	@ApiModelProperty(name = "tCurrentTerm",value = "当前还款期")
	private Date tCurrentTerm;
	/**
	 * 记录日期
	 */
	@ApiModelProperty(name = "tRecordDate",value = "记录日期")
	private Date tRecordDate;
	/**
	 * 是否还款
	 */
	@ApiModelProperty(name = "tIsreturned",value = "是否还款")
	private String tIsreturned;

}
