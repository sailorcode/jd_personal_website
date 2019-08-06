package com.qyf.personal_website.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qyf.personal_website.entity.User;
import com.qyf.personal_website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * author:qyf
 * Date:2019/8/5
 * description:
 */
@RestController("users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public String createUser(User user){
        user.setCreateTime(new Date());
        userService.save(user);
        return "success";
    }

    @GetMapping
    public IPage<User> listUsers(int page, int size){
        return userService.page(new Page<User>(page, size));
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return null;
    }

}
