package com.p2p.finance.dao;

import com.p2p.finance.entity.AccountEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户帐户表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Mapper
public interface AccountDao extends BaseMapper<AccountEntity> {
	
}
