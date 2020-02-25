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

import com.p2p.finance.entity.ProductAccountEntity;
import com.p2p.finance.service.ProductAccountService;




/**
 * 用户投资表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "用户投资表 管理")
@RestController
@RequestMapping("finance/productaccount")
public class ProductAccountController {
    @Autowired
    private ProductAccountService productAccountService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:productaccount:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productAccountService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{pId}")
    @PreAuthorize("hasAuthority('finance:productaccount:info')")
    public Resp<ProductAccountEntity> info(@PathVariable("pId") Long pId){
		ProductAccountEntity productAccount = productAccountService.getById(pId);

        return Resp.ok(productAccount);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:productaccount:save')")
    public Resp<Object> save(@RequestBody ProductAccountEntity productAccount){

        productAccountService.save(productAccount);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:productaccount:update')")
    public Resp<Object> update(@RequestBody ProductAccountEntity productAccount){
		productAccountService.updateById(productAccount);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:productaccount:delete')")
    public Resp<Object> delete(@RequestBody Long[] pIds){
		productAccountService.removeByIds(Arrays.asList(pIds));

        return Resp.ok(null);
    }

}
