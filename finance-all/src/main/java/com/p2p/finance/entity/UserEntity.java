package com.p2p.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@ApiModel
@Data
@TableName("t_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "tId",value = "id")
	private Long tId;
	/**
	 * 用户邮箱
	 */
	@ApiModelProperty(name = "tEmail",value = "用户邮箱")
	private String tEmail;
	/**
	 * 邮箱验证
	 */
	@ApiModelProperty(name = "tEmailStatus",value = "邮箱验证")
	private String tEmailStatus;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "tIdentity",value = "用户id")
	private String tIdentity;
	/**
	 * 邀请码
	 */
	@ApiModelProperty(name = "tInvtteid",value = "邀请码")
	private String tInvtteid;
	/**
	 * 登录ip
	 */
	@ApiModelProperty(name = "tIp",value = "登录ip")
	private String tIp;
	/**
	 * 登录时间
	 */
	@ApiModelProperty(name = "tLoginTime",value = "登录时间")
	private Date tLoginTime;
	/**
	 * 锁
	 */
	@ApiModelProperty(name = "tOnlock",value = "锁")
	private String tOnlock;
	/**
	 * 登录密码
	 */
	@ApiModelProperty(name = "tPassword",value = "登录密码")
	private String tPassword;
	/**
	 * 支付密码
	 */
	@ApiModelProperty(name = "tPayPassword",value = "支付密码")
	private String tPayPassword;
	/**
	 * 支付密码验证
	 */
	@ApiModelProperty(name = "tPayPwdStatus",value = "支付密码验证")
	private String tPayPwdStatus;
	/**
	 * 电话
	 */
	@ApiModelProperty(name = "tPhone",value = "电话")
	private String tPhone;
	/**
	 * 手机验证
	 */
	@ApiModelProperty(name = "tPhoneStatus",value = "手机验证")
	private String tPhoneStatus;
	/**
	 * 随机激活码
	 */
	@ApiModelProperty(name = "tRandomCode",value = "随机激活码")
	private String tRandomCode;
	/**
	 * 真实姓名
	 */
	@ApiModelProperty(name = "tRealname",value = "真实姓名")
	private String tRealname;
	/**
	 * 实名验证
	 */
	@ApiModelProperty(name = "tRealnameStatus",value = "实名验证")
	private String tRealnameStatus;
	/**
	 * 注册时间
	 */
	@ApiModelProperty(name = "tRegesterTime",value = "注册时间")
	private Date tRegesterTime;
	/**
	 * 备注
	 */
	@ApiModelProperty(name = "tRemark",value = "备注")
	private String tRemark;
	/**
	 * 好友数量统计
	 */
	@ApiModelProperty(name = "tSumfriend",value = "好友数量统计")
	private String tSumfriend;
	/**
	 * 安全等级
	 */
	@ApiModelProperty(name = "tUserSecure",value = "安全等级")
	private String tUserSecure;
	/**
	 * 用户类型0投资人1借款人
	 */
	@ApiModelProperty(name = "tUsertype",value = "用户类型0投资人1借款人")
	private Integer tUsertype;
	/**
	 * 用户登录名
	 */
	@ApiModelProperty(name = "tUsername",value = "用户登录名")
	private String tUsername;

}
