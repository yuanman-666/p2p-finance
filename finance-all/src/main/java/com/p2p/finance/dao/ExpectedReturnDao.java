package com.p2p.finance.dao;

import com.p2p.finance.entity.ExpectedReturnEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 预期收益表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Mapper
public interface ExpectedReturnDao extends BaseMapper<ExpectedReturnEntity> {
	
}
