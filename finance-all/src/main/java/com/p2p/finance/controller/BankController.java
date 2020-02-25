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

import com.p2p.finance.entity.BankEntity;
import com.p2p.finance.service.BankService;




/**
 * 银行表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "银行表 管理")
@RestController
@RequestMapping("finance/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:bank:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = bankService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:bank:info')")
    public Resp<BankEntity> info(@PathVariable("tId") Long tId){
		BankEntity bank = bankService.getById(tId);

        return Resp.ok(bank);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:bank:save')")
    public Resp<Object> save(@RequestBody BankEntity bank){
		bankService.save(bank);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:bank:update')")
    public Resp<Object> update(@RequestBody BankEntity bank){
		bankService.updateById(bank);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:bank:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		bankService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
