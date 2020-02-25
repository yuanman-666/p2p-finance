package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 银行卡表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_bankcard")
public class BankcardEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 银行卡号
	 */
	@ApiModelProperty(name = "tNum",value = "银行卡号")
	private String tNum;
	/**
	 * 开户银行
	 */
	@ApiModelProperty(name = "tBank",value = "开户银行")
	private String tBank;
	/**
	 * 城市id
	 */
	@ApiModelProperty(name = "tCityId",value = "城市id")
	private String tCityId;
	/**
	 * 用户表主键
	 */
	@ApiModelProperty(name = "tUserId",value = "用户表主键")
	private String tUserId;
	/**
	 * 银行编号
	 */
	@ApiModelProperty(name = "tBankId",value = "银行编号")
	private String tBankId;
	/**
	 * 银行支行
	 */
	@ApiModelProperty(name = "tBankBranch",value = "银行支行")
	private String tBankBranch;
	/**
	 * 绑定手机号码
	 */
	@ApiModelProperty(name = "tPhoneNum",value = "绑定手机号码")
	private String tPhoneNum;

}
