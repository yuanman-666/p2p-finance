package com.p2p.finance.dao;

import com.p2p.finance.entity.FundingNotMatchedEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 待匹配资金表
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Mapper
public interface FundingNotMatchedDao extends BaseMapper<FundingNotMatchedEntity> {
	
}
