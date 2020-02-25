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

import com.p2p.finance.entity.WeighruleEntity;
import com.p2p.finance.service.WeighruleService;




/**
 * 权重规则表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "权重规则表 管理")
@RestController
@RequestMapping("finance/weighrule")
public class WeighruleController {
    @Autowired
    private WeighruleService weighruleService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:weighrule:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = weighruleService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:weighrule:info')")
    public Resp<WeighruleEntity> info(@PathVariable("tId") Long tId){
		WeighruleEntity weighrule = weighruleService.getById(tId);

        return Resp.ok(weighrule);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:weighrule:save')")
    public Resp<Object> save(@RequestBody WeighruleEntity weighrule){
		weighruleService.save(weighrule);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:weighrule:update')")
    public Resp<Object> update(@RequestBody WeighruleEntity weighrule){
		weighruleService.updateById(weighrule);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:weighrule:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		weighruleService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
