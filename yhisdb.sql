/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.55 : Database - yhis
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yhis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yhis`;

/*Table structure for table `cat` */

DROP TABLE IF EXISTS `cat`;

CREATE TABLE `cat` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `name` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `cat` */

insert  into `cat`(`id`,`name`) values (1,'tom'),(3,'apple'),(4,'fasdf');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `case_number` int(30) DEFAULT NULL,
  `item` varchar(50) DEFAULT NULL,
  `price` int(20) DEFAULT NULL,
  `amount` int(20) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `item` */

insert  into `item`(`id`,`case_number`,`item`,`price`,`amount`,`time`,`note`) values (1,NULL,'神经阻滞治疗',100,1,'05-15 19:30',NULL);

/*Table structure for table `register` */

DROP TABLE IF EXISTS `register`;

CREATE TABLE `register` (
  `id` int(9) NOT NULL AUTO_INCREMENT COMMENT 'ID,主键,自增，暂定发票号',
  `case_number` varchar(64) NOT NULL COMMENT '病历号',
  `real_name` varchar(64) NOT NULL COMMENT '姓名',
  `gender` enum('男','女') DEFAULT NULL COMMENT '性别',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `age_type` int(1) DEFAULT NULL COMMENT '年龄类型，岁月天',
  `birth_date` date DEFAULT NULL COMMENT '出生日期',
  `home_address` varchar(64) DEFAULT NULL COMMENT '家庭住址',
  `idnumber` char(18) DEFAULT NULL COMMENT '身份证号',
  `settle_id` int(11) DEFAULT NULL COMMENT '结算类别ID',
  `visit_date` date DEFAULT NULL COMMENT '本次看诊日期',
  `noon` char(2) DEFAULT '' COMMENT '午别 上午下午',
  `dept_id` int(11) DEFAULT NULL COMMENT '挂号科室ID',
  `regist_leid` int(11) DEFAULT NULL COMMENT '挂号级别ID',
  `user_id` int(11) DEFAULT NULL COMMENT '挂号医生ID',
  `is_book` int(11) DEFAULT NULL COMMENT '病历本 1要 2不要',
  `money` float DEFAULT '100' COMMENT '收费金额',
  `money_type` int(1) DEFAULT '1' COMMENT '收费方式',
  `regist_time` datetime DEFAULT NULL COMMENT '挂号时间',
  `regist_id` int(11) DEFAULT NULL COMMENT '挂号员ID',
  `visit_state` varchar(9) DEFAULT NULL COMMENT '本次看诊状态1已挂号 2医生看诊 3看诊结束 4退号',
  `item` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `price` int(10) DEFAULT NULL COMMENT '单价',
  `amount` int(255) DEFAULT NULL COMMENT '数量',
  `time` varchar(40) DEFAULT NULL COMMENT '开立时间',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `register` */

insert  into `register`(`id`,`case_number`,`real_name`,`gender`,`age`,`age_type`,`birth_date`,`home_address`,`idnumber`,`settle_id`,`visit_date`,`noon`,`dept_id`,`regist_leid`,`user_id`,`is_book`,`money`,`money_type`,`regist_time`,`regist_id`,`visit_state`,`item`,`price`,`amount`,`time`,`note`) values (106,'9','王小明','男',13,1,'2001-12-11','北京市东城区不知道啥地方','130234567890',1,'2020-05-14','上午',1,1,1,0,100,1,NULL,NULL,'已接诊','感冒胶囊',12,1,'2020-05-17 15:51:58','一天3次'),(107,'8888','段晶晶','男',23,1,'2001-12-11','北京市东城区不知道啥地方','130234567890',1,'2020-05-14','上午',2,1,2,1,100,1,NULL,NULL,'已退费','感冒胶囊',13,1,'2020-05-17 16:59:06','一天3次'),(108,'12345','小明','男',13,1,'2001-12-11','北京市','130234567890',1,'2020-05-14','上午',1,1,1,0,100,1,NULL,NULL,'已退号',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '' COMMENT '登录名',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '密码',
  `real_name` varchar(64) NOT NULL DEFAULT '' COMMENT '真实姓名',
  `user_type` int(1) DEFAULT NULL COMMENT '用户类别：1医院管理员 2挂号收费员 3门诊医生 4医技医生 5药房操作员 6 财务管理员',
  `doc_title_id` int(9) DEFAULT NULL,
  `is_scheduling` char(1) DEFAULT NULL COMMENT '1是',
  `dept_id` int(9) DEFAULT NULL,
  `regist_le_id` int(9) DEFAULT NULL,
  `del_mark` int(1) DEFAULT NULL COMMENT '1正常 0已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`real_name`,`user_type`,`doc_title_id`,`is_scheduling`,`dept_id`,`regist_le_id`,`del_mark`) values (3,'admin','admin','段晶晶',1,5,'1',8,98,1),(5,'admin2','admin','段晶晶',1,5,'1',8,98,0),(6,'ghy','admin','王小明',2,5,'1',8,98,1),(7,'ghy1','admin','王小明',2,5,'1',8,98,0),(8,'doctor','admin','杜子腾',3,5,'1',8,98,0),(9,'doctor1','admin','李白',3,5,'1',8,98,1),(10,'doctor2','admin','杜甫',3,5,'1',8,98,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
