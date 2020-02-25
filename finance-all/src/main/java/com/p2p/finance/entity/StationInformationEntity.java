package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 站内信息
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:55
 */
@ApiModel
@Data
@TableName("t_station_information")
public class StationInformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(name = "sId",value = "主键")
	private Long sId;
	/**
	 * 消息状态
	 */
	@ApiModelProperty(name = "sMessageState",value = "消息状态")
	private String sMessageState;
	/**
	 * 消息内容
	 */
	@ApiModelProperty(name = "sMessageContent",value = "消息内容")
	private String sMessageContent;
	/**
	 * 发送时间
	 */
	@ApiModelProperty(name = "sSystemTime",value = "发送时间")
	private String sSystemTime;
	/**
	 * 消息类型
	 */
	@ApiModelProperty(name = "sInformationType",value = "消息类型")
	private String sInformationType;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "sReceiveUserId",value = "用户id")
	private String sReceiveUserId;

}
