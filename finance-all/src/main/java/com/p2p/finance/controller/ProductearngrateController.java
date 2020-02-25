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

import com.p2p.finance.entity.ProductearngrateEntity;
import com.p2p.finance.service.ProductearngrateService;




/**
 * 理财产品表利率表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "理财产品表利率表 管理")
@RestController
@RequestMapping("finance/productearngrate")
public class ProductearngrateController {
    @Autowired
    private ProductearngrateService productearngrateService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:productearngrate:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productearngrateService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:productearngrate:info')")
    public Resp<ProductearngrateEntity> info(@PathVariable("tId") Long tId){
		ProductearngrateEntity productearngrate = productearngrateService.getById(tId);

        return Resp.ok(productearngrate);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:productearngrate:save')")
    public Resp<Object> save(@RequestBody ProductearngrateEntity productearngrate){
		productearngrateService.save(productearngrate);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:productearngrate:update')")
    public Resp<Object> update(@RequestBody ProductearngrateEntity productearngrate){
		productearngrateService.updateById(productearngrate);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:productearngrate:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		productearngrateService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
