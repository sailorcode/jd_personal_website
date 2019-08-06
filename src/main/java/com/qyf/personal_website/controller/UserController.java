package com.qyf.personal_website.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qyf.personal_website.entity.User;
import com.qyf.personal_website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public User createUser(User user){
        checkDuplicate(user,false);
        user.setCreateTime(new Date());
        userService.save(user);
        return user;
    }


    @GetMapping("/{id}")
    public User listUsers(@PathVariable("id") int id){
        return userService.getById(id);
    }

    @GetMapping
    public IPage<User> listUsers(int page, int size){
        return userService.page(new Page<User>(page, size));
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        User old = userService.getById(user.getId());
        if(old == null){
            throw new RuntimeException("用户不存在");
        }
        checkDuplicate(user, true);
        user.setUpdateTime(new Date());
        userService.updateById(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.removeById(id);
    }

    private void checkDuplicate(User user, boolean update) {
        QueryWrapper<User> wrapper = Wrappers.query();
        wrapper.eq("user_name", user.getUserName());
        User oldUser = userService.getOne(wrapper);
        if(!(oldUser == null || (update && user.getId() == oldUser.getId()))){
            throw new RuntimeException("用户名已存在");
        }
    }

}
