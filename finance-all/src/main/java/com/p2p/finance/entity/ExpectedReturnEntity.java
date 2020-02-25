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
 * 预期收益表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_expected_return")
public class ExpectedReturnEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(name = "tUid",value = "用户ID")
	private String tUid;
	/**
	 *  产品ID
	 */
	@ApiModelProperty(name = "tPid",value = " 产品ID")
	private String tPid;
	/**
	 * 投资记录ID
	 */
	@ApiModelProperty(name = "tRid",value = "投资记录ID")
	private String tRid;
	/**
	 * 收益日期
	 */
	@ApiModelProperty(name = "tExpectedDate",value = "收益日期")
	private Date tExpectedDate;
	/**
	 * 收益金额
	 */
	@ApiModelProperty(name = "tExpectedMoney",value = "收益金额")
	private BigDecimal tExpectedMoney;
	/**
	 * 创建日期
	 */
	@ApiModelProperty(name = "tCreateDate",value = "创建日期")
	private Date tCreateDate;

}
