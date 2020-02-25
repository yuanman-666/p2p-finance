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

import com.p2p.finance.entity.DebtorRecordEntity;
import com.p2p.finance.service.DebtorRecordService;




/**
 * 债权还款记录实体类
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "债权还款记录实体类 管理")
@RestController
@RequestMapping("finance/debtorrecord")
public class DebtorRecordController {
    @Autowired
    private DebtorRecordService debtorRecordService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:debtorrecord:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = debtorRecordService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:debtorrecord:info')")
    public Resp<DebtorRecordEntity> info(@PathVariable("tId") Long tId){
		DebtorRecordEntity debtorRecord = debtorRecordService.getById(tId);

        return Resp.ok(debtorRecord);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:debtorrecord:save')")
    public Resp<Object> save(@RequestBody DebtorRecordEntity debtorRecord){
		debtorRecordService.save(debtorRecord);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:debtorrecord:update')")
    public Resp<Object> update(@RequestBody DebtorRecordEntity debtorRecord){
		debtorRecordService.updateById(debtorRecord);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:debtorrecord:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		debtorRecordService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
