use personal_website;
CREATE TABLE `t_user`  (
  `id` int(4) AUTO_INCREMENT NOT NULL,
  `user_name` varchar(256) NOT NULL,
  `pass_word` varchar(64) NOT NULL,
  `phone_number` varchar(32) NULL,
  `email` varchar(64) NULL,
  `extra` varchar(2048) null,
  `create_time` datetime NULL COMMENT '创建时间',
  `update_time` datetime NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `t_blog`  (
  `id` int(4) AUTO_INCREMENT NOT NULL,
  `title` varchar(256) NOT NULL,
  `tag` varchar(256) NULL DEFAULT NULL,
  `content` text NULL,
  `create_time` datetime NULL COMMENT '创建时间',
  `update_time` datetime NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `t_comment`  (
  `id` int(8) AUTO_INCREMENT NOT NULL,
  `parent_id` int(8) NOT NULL default 0,
  `blog_id` int(4) NOT NULL,
  `content` varchar(2048) NULL DEFAULT NULL,
  `user_id` int(4) NOT NULL,
  `create_time` datetime NULL COMMENT '创建时间',
  `update_time` datetime NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;