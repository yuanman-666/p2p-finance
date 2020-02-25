package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.AccountLogDao;
import com.p2p.finance.entity.AccountLogEntity;
import com.p2p.finance.service.AccountLogService;


@Service("accountLogService")
public class AccountLogServiceImpl extends ServiceImpl<AccountLogDao, AccountLogEntity> implements AccountLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AccountLogEntity> page = this.page(
                new Query<AccountLogEntity>().getPage(params),
                new QueryWrapper<AccountLogEntity>()
        );

        return new PageVo(page);
    }

}