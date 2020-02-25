package com.p2p.finance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.p2p.finance.entity.ProductAccountEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 用户投资表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
public interface ProductAccountService extends IService<ProductAccountEntity> {

    PageVo queryPage(QueryCondition params);
}

