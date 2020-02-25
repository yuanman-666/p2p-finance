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

import com.p2p.finance.entity.DebtInfoEntity;
import com.p2p.finance.service.DebtInfoService;




/**
 * 债权表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "债权表 管理")
@RestController
@RequestMapping("finance/debtinfo")
public class DebtInfoController {
    @Autowired
    private DebtInfoService debtInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:debtinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = debtInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{dId}")
    @PreAuthorize("hasAuthority('finance:debtinfo:info')")
    public Resp<DebtInfoEntity> info(@PathVariable("dId") Long dId){
		DebtInfoEntity debtInfo = debtInfoService.getById(dId);

        return Resp.ok(debtInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:debtinfo:save')")
    public Resp<Object> save(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.save(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:debtinfo:update')")
    public Resp<Object> update(@RequestBody DebtInfoEntity debtInfo){
		debtInfoService.updateById(debtInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:debtinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] dIds){
		debtInfoService.removeByIds(Arrays.asList(dIds));

        return Resp.ok(null);
    }

}
