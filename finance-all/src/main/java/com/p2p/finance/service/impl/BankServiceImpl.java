package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.BankDao;
import com.p2p.finance.entity.BankEntity;
import com.p2p.finance.service.BankService;


@Service("bankService")
public class BankServiceImpl extends ServiceImpl<BankDao, BankEntity> implements BankService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BankEntity> page = this.page(
                new Query<BankEntity>().getPage(params),
                new QueryWrapper<BankEntity>()
        );

        return new PageVo(page);
    }

}