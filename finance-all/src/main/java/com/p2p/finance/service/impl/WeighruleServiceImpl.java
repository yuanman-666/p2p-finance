package com.p2p.finance.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.p2p.finance.dao.WeighruleDao;
import com.p2p.finance.entity.WeighruleEntity;
import com.p2p.finance.service.WeighruleService;


@Service("weighruleService")
public class WeighruleServiceImpl extends ServiceImpl<WeighruleDao, WeighruleEntity> implements WeighruleService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WeighruleEntity> page = this.page(
                new Query<WeighruleEntity>().getPage(params),
                new QueryWrapper<WeighruleEntity>()
        );

        return new PageVo(page);
    }

}