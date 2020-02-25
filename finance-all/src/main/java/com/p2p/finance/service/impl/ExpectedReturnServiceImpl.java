package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.ExpectedReturnDao;
import com.p2p.finance.entity.ExpectedReturnEntity;
import com.p2p.finance.service.ExpectedReturnService;


@Service("expectedReturnService")
public class ExpectedReturnServiceImpl extends ServiceImpl<ExpectedReturnDao, ExpectedReturnEntity> implements ExpectedReturnService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ExpectedReturnEntity> page = this.page(
                new Query<ExpectedReturnEntity>().getPage(params),
                new QueryWrapper<ExpectedReturnEntity>()
        );

        return new PageVo(page);
    }

}