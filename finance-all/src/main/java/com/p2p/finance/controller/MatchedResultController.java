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

import com.p2p.finance.entity.MatchedResultEntity;
import com.p2p.finance.service.MatchedResultService;




/**
 * 匹配结果表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "匹配结果表 管理")
@RestController
@RequestMapping("finance/matchedresult")
public class MatchedResultController {
    @Autowired
    private MatchedResultService matchedResultService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:matchedresult:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = matchedResultService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{iId}")
    @PreAuthorize("hasAuthority('finance:matchedresult:info')")
    public Resp<MatchedResultEntity> info(@PathVariable("iId") Long iId){
		MatchedResultEntity matchedResult = matchedResultService.getById(iId);

        return Resp.ok(matchedResult);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:matchedresult:save')")
    public Resp<Object> save(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.save(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:matchedresult:update')")
    public Resp<Object> update(@RequestBody MatchedResultEntity matchedResult){
		matchedResultService.updateById(matchedResult);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:matchedresult:delete')")
    public Resp<Object> delete(@RequestBody Long[] iIds){
		matchedResultService.removeByIds(Arrays.asList(iIds));

        return Resp.ok(null);
    }

}
