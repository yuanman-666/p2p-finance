package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 银行表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_bank")
public class BankEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "主键")
	private Long tId;
	/**
	 * 银行编号
	 */
	@ApiModelProperty(name = "tNumber",value = "银行编号")
	private Integer tNumber;
	/**
	 * 银行名称
	 */
	@ApiModelProperty(name = "tName",value = "银行名称")
	private String tName;
	/**
	 * 说明
	 */
	@ApiModelProperty(name = "tDesc",value = "说明")
	private String tDesc;
	/**
	 * 是否停用该行（0停；1启用）
	 */
	@ApiModelProperty(name = "tStatus",value = "是否停用该行（0停；1启用）")
	private Integer tStatus;
	/**
	 * 城市编号
	 */
	@ApiModelProperty(name = "tCityCode",value = "城市编号")
	private Integer tCityCode;
	/**
	 * 城市级别
	 */
	@ApiModelProperty(name = "tLevel",value = "城市级别")
	private String tLevel;

}
