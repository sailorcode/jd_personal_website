package com.qyf.personal_website.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * author:qyf
 * Date:2019/8/6
 * description:
 */
@Getter
@Setter
@ToString
@TableName("t_comment")
public class Comment {
    @TableId
    private int id;
    private int parentId;
    private int blogId;
    private int userId;
    private String content;
    private Date createTime;
    private Date updateTime;
}
