package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.DebtorRecordDao;
import com.p2p.finance.entity.DebtorRecordEntity;
import com.p2p.finance.service.DebtorRecordService;


@Service("debtorRecordService")
public class DebtorRecordServiceImpl extends ServiceImpl<DebtorRecordDao, DebtorRecordEntity> implements DebtorRecordService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<DebtorRecordEntity> page = this.page(
                new Query<DebtorRecordEntity>().getPage(params),
                new QueryWrapper<DebtorRecordEntity>()
        );

        return new PageVo(page);
    }

}