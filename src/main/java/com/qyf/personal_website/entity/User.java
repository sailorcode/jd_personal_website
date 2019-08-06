package com.qyf.personal_website.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * author:qyf
 * Date:2019/8/5
 * description:
 */
@Getter
@Setter
@ToString
@TableName("user")
public class User {
    @TableId
    private int id;
    private String userName;
    private String passWord;
    private Date createTime;
    private Date updateTime;
}
