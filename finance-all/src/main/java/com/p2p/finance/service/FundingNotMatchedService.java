package com.p2p.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p2p.finance.entity.FundingNotMatchedEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 待匹配资金表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
public interface FundingNotMatchedService extends IService<FundingNotMatchedEntity> {

    PageVo queryPage(QueryCondition params);
}

