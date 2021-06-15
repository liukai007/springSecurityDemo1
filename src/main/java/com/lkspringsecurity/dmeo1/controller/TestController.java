package com.lkspringsecurity.dmeo1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuKai
 * @version 1.0
 * @since 2021/6/15 14:02
 */
@Api(tags = "TEST", description = "Test相关接口")
@RestController
public class TestController {
    //增
    @ApiOperation(value = "TEST添加")
    @RequestMapping(method = RequestMethod.GET)
    public void doGet() {
        System.out.println("哈哈");
    }
}
