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

import com.p2p.finance.entity.UserEntity;
import com.p2p.finance.service.UserService;




/**
 * 用户表
 *
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-24 20:30:56
 */
@Api(tags = "用户表 管理")
@RestController
@RequestMapping("finance/user")
public class UserController {
    @Autowired
    private UserService userService;

    //龙王张宇修改了


    //龙王张宇第二次修改

    //123


    //龙王张宇第三次修改


    //321



    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('finance:user:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = userService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{tId}")
    @PreAuthorize("hasAuthority('finance:user:info')")
    public Resp<UserEntity> info(@PathVariable("tId") Long tId){
		UserEntity user = userService.getById(tId);

        return Resp.ok(user);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('finance:user:save')")
    public Resp<Object> save(@RequestBody UserEntity user){


        userService.save(user);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('finance:user:update')")
    public Resp<Object> update(@RequestBody UserEntity user){
		userService.updateById(user);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('finance:user:delete')")
    public Resp<Object> delete(@RequestBody Long[] tIds){
		userService.removeByIds(Arrays.asList(tIds));

        return Resp.ok(null);
    }

}
