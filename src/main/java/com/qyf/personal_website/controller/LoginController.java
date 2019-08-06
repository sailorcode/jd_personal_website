package com.qyf.personal_website.controller;

import com.qyf.personal_website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:qyf
 * Date:2019/8/5
 * description:
 */
@RestController("login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String login(){
        return "success";
    }
}
