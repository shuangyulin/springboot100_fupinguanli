/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - springbootsudk0
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springbootsudk0` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springbootsudk0`;

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/springbootsudk0/upload/picture1.jpg');
insert  into `config`(`id`,`name`,`value`) values (2,'picture2','http://localhost:8080/springbootsudk0/upload/picture2.jpg');
insert  into `config`(`id`,`name`,`value`) values (3,'picture3','http://localhost:8080/springbootsudk0/upload/picture3.jpg');
insert  into `config`(`id`,`name`,`value`) values (6,'homepage',NULL);

/*Table structure for table `messages` */

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='留言板';

/*Data for the table `messages` */

insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (81,'2021-05-07 09:32:39',1,'用户名1','留言内容1','回复内容1');
insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (82,'2021-05-07 09:32:39',2,'用户名2','留言内容2','回复内容2');
insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (83,'2021-05-07 09:32:39',3,'用户名3','留言内容3','回复内容3');
insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (84,'2021-05-07 09:32:39',4,'用户名4','留言内容4','回复内容4');
insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (85,'2021-05-07 09:32:39',5,'用户名5','留言内容5','回复内容5');
insert  into `messages`(`id`,`addtime`,`userid`,`username`,`content`,`reply`) values (86,'2021-05-07 09:32:39',6,'用户名6','留言内容6','回复内容6');

/*Table structure for table `pinkunhu` */

DROP TABLE IF EXISTS `pinkunhu`;

CREATE TABLE `pinkunhu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `jiatingchengyuan` varchar(200) DEFAULT NULL COMMENT '家庭成员',
  `chengyuanrenshu` int(11) DEFAULT NULL COMMENT '成员人数',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `jiatingzhuangkuang` longtext COMMENT '家庭状况',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `renjunshouru` int(11) DEFAULT NULL COMMENT '人均收入',
  `xiangxijieshao` longtext COMMENT '详细介绍',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='贫困户';

/*Data for the table `pinkunhu` */

insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (21,'2021-05-07 09:32:39','编号1','家庭成员1',1,'家庭住址1','家庭状况1','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian1.jpg',1,'详细介绍1','账号1','姓名1','是','','2021-05-07 09:32:39',1);
insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (22,'2021-05-07 09:32:39','编号2','家庭成员2',2,'家庭住址2','家庭状况2','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian2.jpg',2,'详细介绍2','账号2','姓名2','是','','2021-05-07 09:32:39',2);
insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (23,'2021-05-07 09:32:39','编号3','家庭成员3',3,'家庭住址3','家庭状况3','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian3.jpg',3,'详细介绍3','账号3','姓名3','是','','2021-05-07 09:32:39',3);
insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (24,'2021-05-07 09:32:39','编号4','家庭成员4',4,'家庭住址4','家庭状况4','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian4.jpg',4,'详细介绍4','账号4','姓名4','是','','2021-05-07 09:32:39',4);
insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (25,'2021-05-07 09:32:39','编号5','家庭成员5',5,'家庭住址5','家庭状况5','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian5.jpg',5,'详细介绍5','账号5','姓名5','是','','2021-05-07 09:33:47',6);
insert  into `pinkunhu`(`id`,`addtime`,`bianhao`,`jiatingchengyuan`,`chengyuanrenshu`,`jiatingzhuzhi`,`jiatingzhuangkuang`,`fengmian`,`renjunshouru`,`xiangxijieshao`,`zhanghao`,`xingming`,`sfsh`,`shhf`,`clicktime`,`clicknum`) values (26,'2021-05-07 09:32:39','编号6','家庭成员6',6,'家庭住址6','家庭状况6','http://localhost:8080/springbootsudk0/upload/pinkunhu_fengmian6.jpg',6,'详细介绍6','账号6','姓名6','是','','2021-05-07 09:32:39',6);

/*Table structure for table `remenxinwen` */

DROP TABLE IF EXISTS `remenxinwen`;

CREATE TABLE `remenxinwen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `xinwenleixing` varchar(200) DEFAULT NULL COMMENT '新闻类型',
  `neirong` longtext COMMENT '内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='热门新闻';

/*Data for the table `remenxinwen` */

insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (31,'2021-05-07 09:32:39','标题1','新闻类型1','内容1','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian1.jpg','2021-05-07 09:32:39',1);
insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (32,'2021-05-07 09:32:39','标题2','新闻类型2','内容2','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian2.jpg','2021-05-07 09:32:39',2);
insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (33,'2021-05-07 09:32:39','标题3','新闻类型3','内容3','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian3.jpg','2021-05-07 09:32:39',3);
insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (34,'2021-05-07 09:32:39','标题4','新闻类型4','内容4','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian4.jpg','2021-05-07 09:32:39',4);
insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (35,'2021-05-07 09:32:39','标题5','新闻类型5','内容5','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian5.jpg','2021-05-07 09:32:39',5);
insert  into `remenxinwen`(`id`,`addtime`,`biaoti`,`xinwenleixing`,`neirong`,`fabushijian`,`fengmian`,`clicktime`,`clicknum`) values (36,'2021-05-07 09:32:39','标题6','新闻类型6','内容6','2021-05-07','http://localhost:8080/springbootsudk0/upload/remenxinwen_fengmian6.jpg','2021-05-07 09:32:39',6);

/*Table structure for table `storeup` */

DROP TABLE IF EXISTS `storeup`;

CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';

/*Data for the table `storeup` */

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-05-07 09:32:39');

/*Table structure for table `xinwenleixing` */

DROP TABLE IF EXISTS `xinwenleixing`;

CREATE TABLE `xinwenleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinwenleixing` varchar(200) DEFAULT NULL COMMENT '新闻类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='新闻类型';

/*Data for the table `xinwenleixing` */

insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (41,'2021-05-07 09:32:39','新闻类型1');
insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (42,'2021-05-07 09:32:39','新闻类型2');
insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (43,'2021-05-07 09:32:39','新闻类型3');
insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (44,'2021-05-07 09:32:39','新闻类型4');
insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (45,'2021-05-07 09:32:39','新闻类型5');
insert  into `xinwenleixing`(`id`,`addtime`,`xinwenleixing`) values (46,'2021-05-07 09:32:39','新闻类型6');

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `nianling` varchar(200) NOT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) NOT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (11,'2021-05-07 09:32:39','用户1','123456','姓名1','年龄1','男','13823888881','773890001@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian1.jpg');
insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (12,'2021-05-07 09:32:39','用户2','123456','姓名2','年龄2','男','13823888882','773890002@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian2.jpg');
insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (13,'2021-05-07 09:32:39','用户3','123456','姓名3','年龄3','男','13823888883','773890003@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian3.jpg');
insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (14,'2021-05-07 09:32:39','用户4','123456','姓名4','年龄4','男','13823888884','773890004@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian4.jpg');
insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (15,'2021-05-07 09:32:39','用户5','123456','姓名5','年龄5','男','13823888885','773890005@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian5.jpg');
insert  into `yonghu`(`id`,`addtime`,`zhanghao`,`mima`,`xingming`,`nianling`,`xingbie`,`shouji`,`youxiang`,`zhaopian`) values (16,'2021-05-07 09:32:39','用户6','123456','姓名6','年龄6','男','13823888886','773890006@qq.com','http://localhost:8080/springbootsudk0/upload/yonghu_zhaopian6.jpg');

/*Table structure for table `yonghuyingpin` */

DROP TABLE IF EXISTS `yonghuyingpin`;

CREATE TABLE `yonghuyingpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaopinbiaoti` varchar(200) DEFAULT NULL COMMENT '招聘标题',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `shifouyingpin` varchar(200) DEFAULT NULL COMMENT '是否应聘',
  `yingpinyuanyin` longtext COMMENT '应聘原因',
  `yingpinshijian` date DEFAULT NULL COMMENT '应聘时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='用户应聘';

/*Data for the table `yonghuyingpin` */

insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (61,'2021-05-07 09:32:39','招聘标题1','职位1','是','应聘原因1','2021-05-07','账号1','姓名1','手机1','是','');
insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (62,'2021-05-07 09:32:39','招聘标题2','职位2','是','应聘原因2','2021-05-07','账号2','姓名2','手机2','是','');
insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (63,'2021-05-07 09:32:39','招聘标题3','职位3','是','应聘原因3','2021-05-07','账号3','姓名3','手机3','是','');
insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (64,'2021-05-07 09:32:39','招聘标题4','职位4','是','应聘原因4','2021-05-07','账号4','姓名4','手机4','是','');
insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (65,'2021-05-07 09:32:39','招聘标题5','职位5','是','应聘原因5','2021-05-07','账号5','姓名5','手机5','是','');
insert  into `yonghuyingpin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`shifouyingpin`,`yingpinyuanyin`,`yingpinshijian`,`zhanghao`,`xingming`,`shouji`,`sfsh`,`shhf`) values (66,'2021-05-07 09:32:39','招聘标题6','职位6','是','应聘原因6','2021-05-07','账号6','姓名6','手机6','是','');

/*Table structure for table `zhiyuanzhezhaopin` */

DROP TABLE IF EXISTS `zhiyuanzhezhaopin`;

CREATE TABLE `zhiyuanzhezhaopin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaopinbiaoti` varchar(200) DEFAULT NULL COMMENT '招聘标题',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `zhaopinyaoqiu` longtext COMMENT '招聘要求',
  `gongzidaiyu` varchar(200) DEFAULT NULL COMMENT '工资待遇',
  `gongzuodidian` varchar(200) DEFAULT NULL COMMENT '工作地点',
  `gongzuoshijian` varchar(200) DEFAULT NULL COMMENT '工作时间',
  `zhaopinrenshu` int(11) DEFAULT NULL COMMENT '招聘人数',
  `zhaopinshijian` date DEFAULT NULL COMMENT '招聘时间',
  `jiezhishijian` date DEFAULT NULL COMMENT '截止时间',
  `fuzeren` varchar(200) DEFAULT NULL COMMENT '负责人',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='志愿者招聘';

/*Data for the table `zhiyuanzhezhaopin` */

insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (51,'2021-05-07 09:32:39','招聘标题1','职位1','招聘要求1','工资待遇1','工作地点1','工作时间1',1,'2021-05-07','2021-05-07','负责人1','联系方式1','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian1.jpg','2021-05-07','2021-05-07 09:32:39',1);
insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (52,'2021-05-07 09:32:39','招聘标题2','职位2','招聘要求2','工资待遇2','工作地点2','工作时间2',2,'2021-05-07','2021-05-07','负责人2','联系方式2','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian2.jpg','2021-05-07','2021-05-07 09:32:39',2);
insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (53,'2021-05-07 09:32:39','招聘标题3','职位3','招聘要求3','工资待遇3','工作地点3','工作时间3',3,'2021-05-07','2021-05-07','负责人3','联系方式3','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian3.jpg','2021-05-07','2021-05-07 09:33:45',4);
insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (54,'2021-05-07 09:32:39','招聘标题4','职位4','招聘要求4','工资待遇4','工作地点4','工作时间4',4,'2021-05-07','2021-05-07','负责人4','联系方式4','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian4.jpg','2021-05-07','2021-05-07 09:32:39',4);
insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (55,'2021-05-07 09:32:39','招聘标题5','职位5','招聘要求5','工资待遇5','工作地点5','工作时间5',5,'2021-05-07','2021-05-07','负责人5','联系方式5','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian5.jpg','2021-05-07','2021-05-07 09:32:39',5);
insert  into `zhiyuanzhezhaopin`(`id`,`addtime`,`zhaopinbiaoti`,`zhiwei`,`zhaopinyaoqiu`,`gongzidaiyu`,`gongzuodidian`,`gongzuoshijian`,`zhaopinrenshu`,`zhaopinshijian`,`jiezhishijian`,`fuzeren`,`lianxifangshi`,`tupian`,`faburiqi`,`clicktime`,`clicknum`) values (56,'2021-05-07 09:32:39','招聘标题6','职位6','招聘要求6','工资待遇6','工作地点6','工作时间6',6,'2021-05-07','2021-05-07','负责人6','联系方式6','http://localhost:8080/springbootsudk0/upload/zhiyuanzhezhaopin_tupian6.jpg','2021-05-07','2021-05-07 09:32:39',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
