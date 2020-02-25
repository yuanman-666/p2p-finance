package com.p2p.finance.dao;

import com.p2p.finance.entity.DebtorRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 债权还款记录实体类
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Mapper
public interface DebtorRecordDao extends BaseMapper<DebtorRecordEntity> {
	
}
