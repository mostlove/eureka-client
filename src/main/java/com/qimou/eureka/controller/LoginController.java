package com.qimou.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric Xie on 2018/1/22 0022.
 */
@RestController
public class LoginController {


    @RequestMapping(value = "/login")
    public String login(){
        return "登录成功";
    }

}
