package com.p2p.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p2p.finance.entity.DebtorRecordEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 债权还款记录实体类
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
public interface DebtorRecordService extends IService<DebtorRecordEntity> {

    PageVo queryPage(QueryCondition params);
}

