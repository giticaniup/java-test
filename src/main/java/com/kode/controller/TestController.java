package com.kode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhongcy on 2016/8/31.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/exception")
    public void test(){

    }
}
