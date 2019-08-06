package com.qyf.personal_website.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qyf.personal_website.dao.UserMapper;
import com.qyf.personal_website.entity.User;
import com.qyf.personal_website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:qyf
 * Date:2019/8/5
 * description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
