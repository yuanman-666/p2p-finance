package com.p2p.finance.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.p2p.finance.entity.BankcardEntity;
import com.p2p.finance.service.BankcardService;




/**
 * 银行卡表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "银行卡表 管理")
@RestController
@RequestMapping("finance/bankcard")
public class BankcardController {
    @Autowired
    private BankcardService bankcardService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:bankcard:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = bankcardService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:bankcard:info')")
    public Resp<BankcardEntity> info(@PathVariable("tId") Long tId){
		BankcardEntity bankcard = bankcardService.getById(tId);

        return Resp.ok(bankcard);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:bankcard:save')")
    public Resp<Object> save(@RequestBody BankcardEntity bankcard){
		bankcardService.save(bankcard);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:bankcard:update')")
    public Resp<Object> update(@RequestBody BankcardEntity bankcard){
		bankcardService.updateById(bankcard);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:bankcard:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		bankcardService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
