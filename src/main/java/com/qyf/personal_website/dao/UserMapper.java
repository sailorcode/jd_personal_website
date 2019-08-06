package com.qyf.personal_website.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qyf.personal_website.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * author:qyf
 * Date:2019/8/5
 * description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
