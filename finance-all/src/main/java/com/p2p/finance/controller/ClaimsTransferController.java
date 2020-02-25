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

import com.p2p.finance.entity.ClaimsTransferEntity;
import com.p2p.finance.service.ClaimsTransferService;




/**
 * 债权转让表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "债权转让表 管理")
@RestController
@RequestMapping("finance/claimstransfer")
public class ClaimsTransferController {
    @Autowired
    private ClaimsTransferService claimsTransferService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:claimstransfer:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = claimsTransferService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{cId}")
    @PreAuthorize("hasAuthority('finance:claimstransfer:info')")
    public Resp<ClaimsTransferEntity> info(@PathVariable("cId") Long cId){
		ClaimsTransferEntity claimsTransfer = claimsTransferService.getById(cId);

        return Resp.ok(claimsTransfer);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:claimstransfer:save')")
    public Resp<Object> save(@RequestBody ClaimsTransferEntity claimsTransfer){
		claimsTransferService.save(claimsTransfer);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:claimstransfer:update')")
    public Resp<Object> update(@RequestBody ClaimsTransferEntity claimsTransfer){
		claimsTransferService.updateById(claimsTransfer);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:claimstransfer:delete')")
    public Resp<Object> delete(@RequestBody Long[] cIds){
		claimsTransferService.removeByIds(Arrays.asList(cIds));

        return Resp.ok(null);
    }

}
