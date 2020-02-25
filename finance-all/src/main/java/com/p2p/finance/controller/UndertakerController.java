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

import com.p2p.finance.entity.UndertakerEntity;
import com.p2p.finance.service.UndertakerService;




/**
 * 手续费表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "手续费表 管理")
@RestController
@RequestMapping("finance/undertaker")
public class UndertakerController {
    @Autowired
    private UndertakerService undertakerService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:undertaker:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = undertakerService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:undertaker:info')")
    public Resp<UndertakerEntity> info(@PathVariable("tId") Long tId){
		UndertakerEntity undertaker = undertakerService.getById(tId);

        return Resp.ok(undertaker);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:undertaker:save')")
    public Resp<Object> save(@RequestBody UndertakerEntity undertaker){
		undertakerService.save(undertaker);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:undertaker:update')")
    public Resp<Object> update(@RequestBody UndertakerEntity undertaker){
		undertakerService.updateById(undertaker);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:undertaker:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		undertakerService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
