package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 待匹配资金表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_funding_not_matched")
public class FundingNotMatchedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "fId",value = "主键")
	private Long fId;
	/**
	 * 投资记录
	 */
	@ApiModelProperty(name = "fInvestRecordId",value = "投资记录")
	private String fInvestRecordId;
	/**
	 * 待匹配金额
	 */
	@ApiModelProperty(name = "fNotMatchedMoney",value = "待匹配金额")
	private String fNotMatchedMoney;
	/**
	 * 资金类型
	 */
	@ApiModelProperty(name = "fFoundingType",value = "资金类型")
	private String fFoundingType;
	/**
	 * 资金
	 */
	@ApiModelProperty(name = "fFoundingWeight",value = "资金")
	private String fFoundingWeight;
	/**
	 * 是否锁定
	 */
	@ApiModelProperty(name = "fIsLocked",value = "是否锁定")
	private String fIsLocked;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "fCreateDate",value = "创建时间")
	private String fCreateDate;

}
