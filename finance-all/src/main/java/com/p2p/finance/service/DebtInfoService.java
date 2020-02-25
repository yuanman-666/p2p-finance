package com.p2p.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p2p.finance.entity.DebtInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 债权表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
public interface DebtInfoService extends IService<DebtInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

