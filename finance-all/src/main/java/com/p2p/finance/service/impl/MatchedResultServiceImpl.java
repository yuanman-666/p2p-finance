package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.MatchedResultDao;
import com.p2p.finance.entity.MatchedResultEntity;
import com.p2p.finance.service.MatchedResultService;


@Service("matchedResultService")
public class MatchedResultServiceImpl extends ServiceImpl<MatchedResultDao, MatchedResultEntity> implements MatchedResultService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MatchedResultEntity> page = this.page(
                new Query<MatchedResultEntity>().getPage(params),
                new QueryWrapper<MatchedResultEntity>()
        );

        return new PageVo(page);
    }

}