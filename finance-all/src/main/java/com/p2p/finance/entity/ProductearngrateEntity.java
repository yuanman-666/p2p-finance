package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 理财产品表利率表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_productearngrate")
public class ProductearngrateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "编号")
	private Long tId;
	/**
	 * 利率值
	 */
	@ApiModelProperty(name = "tIncomerate",value = "利率值")
	private String tIncomerate;
	/**
	 * 月份
	 */
	@ApiModelProperty(name = "tMonth",value = "月份")
	private String tMonth;
	/**
	 * 产品编号
	 */
	@ApiModelProperty(name = "tPid",value = "产品编号")
	private String tPid;

}
