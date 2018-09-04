CREATE TABLE `foot_match` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `field` varchar(32) DEFAULT NULL COMMENT '场次',
  `match_name` varchar(32) DEFAULT NULL COMMENT '比赛名称',
  `parties` varchar(64) DEFAULT NULL COMMENT '主队VS客队',
  `play_type` varchar(32) DEFAULT NULL COMMENT '玩法',
  `bet` varchar(32) DEFAULT NULL COMMENT '投注',
  `bet_adds` decimal(20,3) DEFAULT NULL COMMENT '投注赔率',
  `reason` varchar(1024) DEFAULT NULL COMMENT '投注',
  `result` varchar(16) DEFAULT NULL COMMENT '结果',
  `plan_id` bigint(20) DEFAULT NULL COMMENT '方案ID',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='单场比赛';

CREATE TABLE `foot_plan` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `info` varchar(32) DEFAULT NULL COMMENT '说明',
  `monery` decimal(20,3) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `show_start_time` timestamp NULL DEFAULT NULL,
  `show_end_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='单场比赛';

CREATE TABLE `pay_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `open_id` varchar(32) DEFAULT NULL,
  `plan_id` bigint(20) DEFAULT NULL,
  `monery` decimal(20,3) DEFAULT NULL,
  `third_no` varchar(126) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='单场比赛';

CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `open_id` varchar(128) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(128) DEFAULT NULL,
  `pwd` varchar(64) DEFAULT NULL,
  `status` decimal(20,3) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `wx_img` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `forum_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `info` text DEFAULT NULL,
  `hot` bigint(20) DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章';

CREATE TABLE `forum_message` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` varchar(128) DEFAULT NULL,
  `forum_info_id` varchar(128) DEFAULT NULL,
  `info` varchar(512) NULL,
  `hot` bigint(20) DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL COMMENT '生成时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回复';
