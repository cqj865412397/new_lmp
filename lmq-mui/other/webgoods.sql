/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.18-log : Database - webgoods
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`webgoods` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `webgoods`;

/*Table structure for table `bit` */

DROP TABLE IF EXISTS `bit`;

CREATE TABLE `bit` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：store',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `bit` */

insert  into `bit`(`Id`,`Name`,`time`,`Sid`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'件',NULL,1,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `contactsname` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：Store',
  `Lid` int(11) DEFAULT NULL COMMENT '客户级别Customerlevel',
  `Phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `Province` varchar(50) DEFAULT NULL COMMENT '省',
  `City` varchar(50) DEFAULT NULL COMMENT '市',
  `District` varchar(50) DEFAULT NULL COMMENT '区',
  `Addres` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `Balance` double DEFAULT NULL COMMENT '余额',
  `freezemoney` double DEFAULT NULL COMMENT '冻结金额',
  `Remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `Code` varchar(50) DEFAULT NULL COMMENT '会员号，以门店前缀定义开始',
  `Core` double DEFAULT NULL COMMENT '冻结金额',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `acronymname` varchar(50) DEFAULT NULL,
  `englishname` varchar(50) DEFAULT NULL,
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `pid` int(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`Id`,`contactsname`,`Name`,`Sid`,`Lid`,`Phone`,`Province`,`City`,`District`,`Addres`,`Balance`,`freezemoney`,`Remark`,`Code`,`Core`,`time`,`status`,`acronymname`,`englishname`,`async`,`uid`,`pid`,`user5`) values 
(1,'你是','淘宝',1,NULL,NULL,NULL,NULL,NULL,NULL,-1998191022,NULL,NULL,NULL,NULL,NULL,0,'T','TaoBao',NULL,NULL,1,NULL),
(2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `customerlevel` */

DROP TABLE IF EXISTS `customerlevel`;

CREATE TABLE `customerlevel` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `Agio` int(11) DEFAULT NULL COMMENT '折扣',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号Store',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customerlevel` */

/*Table structure for table `customerrecharge` */

DROP TABLE IF EXISTS `customerrecharge`;

CREATE TABLE `customerrecharge` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `money` double DEFAULT NULL COMMENT '充值金额，可以为负数，负数则提取',
  `cid` int(11) DEFAULT NULL COMMENT '客户编号customer',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `customerrecharge` */

insert  into `customerrecharge`(`Id`,`Time`,`money`,`cid`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(9,'2018-12-01 14:54:07',25000,1,1,NULL,NULL,'2018-12-01','SKD1201812010003','5','',NULL),
(10,'2018-12-01 15:07:48',15045,1,0,NULL,NULL,'2018-12-01','SKD1201812010004','2','',NULL),
(11,'2018-12-01 15:08:10',2580058,1,1,NULL,NULL,'2018-12-01','SKD1201812010005','4','',NULL),
(12,'2018-12-01 15:11:12',258,1,0,NULL,NULL,'2018-12-01','SKD1201812010006','4','',NULL),
(13,'2018-12-02 15:33:23',250,1,0,NULL,NULL,'2018-12-02','SKD1201812020001','3','',NULL),
(14,'2018-12-02 15:49:48',255,1,0,NULL,NULL,'2018-12-02','SKD1201812020002','1','',NULL),
(16,'2018-12-02 16:03:06',250,1,0,NULL,NULL,'2018-12-02','SKD1201812020003','4','',NULL),
(17,'2018-12-02 16:03:50',250,1,1,NULL,NULL,'2018-12-02','SKD1201812020004','2','',NULL),
(18,'2018-12-03 14:36:01',250,1,1,NULL,NULL,'2018-12-03','SKD1201812030001','4','',NULL),
(19,'2018-12-05 08:20:38',250,1,0,NULL,NULL,'2018-12-05','SKD1201812050001','5','',NULL),
(20,'2018-12-05 08:20:50',245,1,0,NULL,NULL,'2018-12-05','SKD1201812050002','5','',NULL),
(21,'2018-12-05 08:21:51',258,1,0,NULL,NULL,'2018-12-05','SKD1201812050003','5','',NULL),
(22,'2018-12-05 08:22:09',2558,1,0,NULL,NULL,'2018-12-05','SKD1201812050004','5','',NULL),
(23,'2018-12-05 08:22:17',122255,1,0,NULL,NULL,'2018-12-05','SKD1201812050005','5','',NULL),
(24,'2018-12-05 08:23:03',250,1,0,NULL,NULL,'2018-12-05','SKD1201812050006','5','',NULL),
(25,'2018-12-05 08:23:47',252,1,0,NULL,NULL,'2018-12-05','SKD1201812050007','5','',NULL),
(26,'2018-12-05 08:23:59',2555,1,0,NULL,NULL,'2018-12-05','SKD1201812050008','5','',NULL),
(27,'2018-12-05 12:00:27',255555,1,1,NULL,NULL,'2018-12-05','SKD1201812050009','5','',NULL),
(28,'2018-12-08 22:13:05',2500000,1,1,NULL,NULL,'2018-12-08','SKD1201812080001','2','',NULL),
(29,'2018-12-08 22:13:21',200000000000,1,1,NULL,NULL,'2018-12-08','SKD1201812080002','2','',NULL);

/*Table structure for table `exampleprice` */

DROP TABLE IF EXISTS `exampleprice`;

CREATE TABLE `exampleprice` (
  `pprice` int(11) DEFAULT NULL COMMENT '批发价格',
  `dprice` varchar(50) DEFAULT NULL COMMENT '打包价格',
  `sprice` varchar(250) DEFAULT NULL COMMENT '原价格',
  `cprice` varchar(250) DEFAULT NULL COMMENT '出售价格',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `exampleprice` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL COMMENT '商品名称',
  `Tid` int(11) DEFAULT NULL COMMENT '商品类型编号goodstype表',
  `Bid` int(11) DEFAULT NULL COMMENT '商品单位表：bit表',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `Code` varchar(20) DEFAULT NULL COMMENT '商品编码',
  `Codeprev` varchar(20) DEFAULT NULL COMMENT '商品编码前缀',
  `Detail` text COMMENT '商品详细',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：store',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`Id`,`name`,`Tid`,`Bid`,`time`,`Code`,`Codeprev`,`Detail`,`Sid`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(3,'就是觉得',1,1,'2018-12-08 12:08:23','21554',NULL,'就是觉得',1,0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL),
(5,'贾森基德年年度',1,1,'2018-12-08 15:55:34','838383',NULL,'贾森基德年年度',1,0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `goodsinstance` */

DROP TABLE IF EXISTS `goodsinstance`;

CREATE TABLE `goodsinstance` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ids` varchar(20) DEFAULT NULL COMMENT '实例编号例如：1，2，3如果为默认实例则为-1',
  `Gid` int(11) DEFAULT NULL COMMENT '商品编号，goods表',
  `Ecode` varchar(50) DEFAULT NULL COMMENT '二维码地址',
  `Qcode` varchar(50) DEFAULT NULL COMMENT '条码地址',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `DefaultState` int(11) DEFAULT '0' COMMENT '0 非默认1默认一口价',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `goodsinstance` */

insert  into `goodsinstance`(`Id`,`ids`,`Gid`,`Ecode`,`Qcode`,`time`,`status`,`async`,`uid`,`DefaultState`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,NULL,3,NULL,NULL,'2018-12-08 12:08:23',0,NULL,'lirui',1,NULL,NULL,NULL,NULL,NULL),
(2,'1',5,NULL,NULL,'2018-12-08 15:55:34',0,NULL,'lirui',1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `goodsinstanceprice` */

DROP TABLE IF EXISTS `goodsinstanceprice`;

CREATE TABLE `goodsinstanceprice` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Ptype` varchar(50) DEFAULT NULL COMMENT '商品价格折扣名称',
  `price` int(255) DEFAULT NULL COMMENT '价格',
  `goodsinstanceid` varchar(20) DEFAULT NULL COMMENT '商品实例',
  `Sid` int(255) DEFAULT NULL COMMENT '门店编号：store',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `goodsinstanceprice` */

insert  into `goodsinstanceprice`(`Id`,`Ptype`,`price`,`goodsinstanceid`,`Sid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'1',800,'1',1,'2018-12-08 12:08:23',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL),
(2,'2',700,'1',1,'2018-12-08 12:08:23',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL),
(3,'1',581818,'2',1,'2018-12-08 15:55:34',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(4,'2',509090,'2',1,'2018-12-08 15:55:34',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `goodstype` */

DROP TABLE IF EXISTS `goodstype`;

CREATE TABLE `goodstype` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `Parentid` int(11) DEFAULT NULL COMMENT '自我关联',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `goodstype` */

insert  into `goodstype`(`Id`,`Name`,`Parentid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'衣服',0,'2018-12-08 12:07:55',0,NULL,'1',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `img` */

DROP TABLE IF EXISTS `img`;

CREATE TABLE `img` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '新名称',
  `Oldname` varchar(50) DEFAULT NULL COMMENT '上传前的名称',
  `url` varchar(50) DEFAULT NULL COMMENT '图片地址',
  `imgtype` int(11) DEFAULT '1' COMMENT '图片类型，1为',
  `Gid` int(11) DEFAULT NULL COMMENT '商品编号',
  `Goodsinstanceid` int(11) DEFAULT NULL COMMENT '商品实例编号如果图片类型为2的时候才会有，但是一样的要存储gid',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `img` */

insert  into `img`(`Id`,`Name`,`Oldname`,`url`,`imgtype`,`Gid`,`Goodsinstanceid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'20181208120823664.jpeg','file1','goods/20181208120823664.jpeg',1,3,-1,'2018-12-08 12:08:23',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL),
(2,'20181208155534904.jpeg','file1','goods/20181208155534904.jpeg',1,5,-1,'2018-12-08 15:55:34',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '中文名称',
  `enname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `catalog` int(11) DEFAULT NULL COMMENT '是否为目录0，目录，1，功能',
  `url` varchar(50) DEFAULT NULL COMMENT '模块地址',
  `funtype` int(11) DEFAULT NULL COMMENT '功能类型，0跳转页面，1，ajax',
  `type` int(11) DEFAULT NULL COMMENT '模块类型0为pc功能，1为app功能',
  `fun` varchar(50) DEFAULT NULL COMMENT '如果是ajax则需要触发js函数',
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Parentid` int(11) DEFAULT NULL COMMENT '自我关联',
  `Status` int(11) DEFAULT '0' COMMENT '状态0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module` */

/*Table structure for table `paytype` */

DROP TABLE IF EXISTS `paytype`;

CREATE TABLE `paytype` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL COMMENT '支付类型名称',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `paytype` */

insert  into `paytype`(`Id`,`Name`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'现金',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'银行存款',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(3,'POS收银账户',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(4,'微信',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(5,'支付宝',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `pricetype` */

DROP TABLE IF EXISTS `pricetype`;

CREATE TABLE `pricetype` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `userStyleId` int(11) DEFAULT NULL COMMENT '客户类别关联userStyle',
  `Name` varchar(20) DEFAULT NULL COMMENT '价格名称',
  `Agio` int(50) DEFAULT NULL COMMENT '折扣',
  `DefaultPrice` int(50) DEFAULT NULL COMMENT '是否为默认1默认，一般零售为默认',
  `Sid` int(50) DEFAULT NULL COMMENT '门店编号：store',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `pricetype` */

insert  into `pricetype`(`Id`,`userStyleId`,`Name`,`Agio`,`DefaultPrice`,`Sid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,1,'零售价格',8,1,1,'2018-12-08 12:06:24',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,1,'打包价',7,0,1,'2018-12-08 12:06:43',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `quote` */

DROP TABLE IF EXISTS `quote`;

CREATE TABLE `quote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  `monye` double DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `async` int(11) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `quote` */

/*Table structure for table `remittance` */

DROP TABLE IF EXISTS `remittance`;

CREATE TABLE `remittance` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT NULL COMMENT '汇款金额，可以为负数，负数则供应商返的金额',
  `Sid` varchar(20) DEFAULT NULL COMMENT '供应商编号supplier',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '单内时间',
  `user2` varchar(50) DEFAULT NULL COMMENT '单号',
  `user3` varchar(50) DEFAULT NULL COMMENT '支付类型',
  `user4` varchar(50) DEFAULT NULL COMMENT '备注',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `remittance` */

insert  into `remittance`(`Id`,`money`,`Sid`,`Time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,250,'1','2018-12-01 15:53:04',0,NULL,NULL,'2018-12-01','FKD1201812010001','5','',NULL),
(2,1000000,'1','2018-12-01 15:55:03',0,NULL,NULL,'2018-12-01','FKD1201812010001','2','',NULL),
(3,280,'1','2018-12-01 15:59:41',0,NULL,NULL,'2018-12-01','FKD1201812010001','5','',NULL),
(4,28,'1','2018-12-02 08:26:59',1,NULL,NULL,'2018-12-02','FKD1201812020001','2','',NULL),
(5,250,'1','2018-12-02 15:51:00',1,NULL,NULL,'2018-12-02','FKD1201812020002','4','',NULL),
(6,250,'1','2018-12-02 15:51:16',1,NULL,NULL,'2018-12-02','FKD1201812020003','3','太',NULL),
(8,250,'1','2018-12-02 15:57:12',1,NULL,NULL,'2018-12-02','FKD1201812020004','4','',NULL),
(10,250,'1','2018-12-02 16:04:35',1,NULL,NULL,'2018-12-02','FKD1201812020005','5','',NULL),
(11,2888,'1','2018-12-03 14:36:11',1,NULL,NULL,'2018-12-03','FKD1201812030001','4','',NULL),
(12,2555,'1','2018-12-05 08:22:47',1,NULL,NULL,'2018-12-05','FKD1201812050001','5','',NULL),
(13,50,'1','2018-12-05 08:27:35',1,NULL,NULL,'2018-12-05','FKD1201812050002','4','',NULL),
(14,25,'1','2018-12-05 08:28:29',1,NULL,NULL,'2018-12-05','FKD1201812050003','5','',NULL),
(15,25588,'1','2018-12-05 12:00:45',1,NULL,NULL,'2018-12-05','FKD1201812050004','4','',NULL),
(16,-200000,'1','2018-12-08 22:17:04',1,NULL,NULL,'2018-12-08','FKD1201812080001','3','',NULL),
(17,25555555,'1','2018-12-08 22:17:19',1,NULL,NULL,'2018-12-08','FKD1201812080002','4','',NULL);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `rolemodule` */

DROP TABLE IF EXISTS `rolemodule`;

CREATE TABLE `rolemodule` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL COMMENT '模块编号',
  `rid` int(11) DEFAULT '1' COMMENT '角色编号',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `rolemodule` */

/*Table structure for table `roleuser` */

DROP TABLE IF EXISTS `roleuser`;

CREATE TABLE `roleuser` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL COMMENT '用户编号',
  `rid` int(11) DEFAULT '1' COMMENT '角色编号',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `roleuser` */

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT NULL COMMENT '出售总价(没打折的价格，也就是商品原价的总和)',
  `count` int(11) DEFAULT NULL COMMENT '出售总数量',
  `Takeinmoney` varchar(255) DEFAULT NULL COMMENT '实际支付金额（零售价格综合，如果是客户，按照客户等级进行再次打折后的价格）',
  `cid` int(11) DEFAULT NULL COMMENT '出售客户：如果没选择客户则为-1(显示散客)',
  `Pid` int(11) DEFAULT NULL COMMENT '支付类型paytype',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：store',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '销售编号',
  `user2` varchar(50) DEFAULT NULL COMMENT '销售订单',
  `user3` varchar(50) DEFAULT NULL COMMENT '备注',
  `user4` varchar(50) DEFAULT NULL COMMENT '创建时间',
  `user5` varchar(50) DEFAULT NULL COMMENT '实际应收金额',
  `user6` varchar(50) DEFAULT NULL COMMENT '折扣率',
  `user7` varchar(50) DEFAULT NULL,
  `user8` varchar(50) DEFAULT NULL,
  `user9` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8;

/*Data for the table `sales` */

insert  into `sales`(`Id`,`money`,`count`,`Takeinmoney`,`cid`,`Pid`,`Sid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`,`user6`,`user7`,`user8`,`user9`) values 
(107,NULL,2,'0',1,3,1,'2018-11-29 08:00:00',1,NULL,'1','XSD1201811290001','XSDD1201811290001','','2018-11-29 13:40:56','23040',NULL,NULL,NULL,NULL),
(108,NULL,2,'2000000.00',1,NULL,1,'2018-11-29 08:00:00',0,NULL,'1','XSD1201811290002','XSDD1201811290002','','2018-11-29 13:44:48','2000000.00',NULL,NULL,NULL,NULL),
(109,NULL,2,'0',1,NULL,1,'2018-12-02 08:00:00',1,NULL,'1','XSD1201812020001','XSDD1201812020036','','2018-12-02 16:17:11','2000000.00',NULL,NULL,NULL,NULL),
(110,NULL,2,'2000000.00',1,NULL,1,'2018-12-02 08:00:00',1,NULL,'1','XSD1201812020002','XSDD1201812020035','','2018-12-02 16:20:27','2000000.00',NULL,NULL,NULL,NULL),
(111,NULL,2,'0',1,4,1,'2018-12-03 08:00:00',1,NULL,'1','XSD1201812030001','XSDD1201812030001','','2018-12-03 14:34:49','19200',NULL,NULL,NULL,NULL),
(112,NULL,2,'0',1,NULL,1,'2018-12-03 08:00:00',1,NULL,'1','XSD1201812030002','XSDD1201812030002','','2018-12-03 14:35:20','2000000.00',NULL,NULL,NULL,NULL),
(113,NULL,2,'2000000.00',1,NULL,1,NULL,0,NULL,'1','XSD1201812030003','XSDD1201812020033','',NULL,'2000000.00',NULL,NULL,NULL,NULL),
(114,NULL,2,'0',1,NULL,1,'2018-12-03 14:48:01',1,NULL,'1','XSD1201812030004','XSDD1201812020032','','2018-12-02','2000000.00',NULL,NULL,NULL,NULL),
(115,NULL,2,'2000000.00',1,NULL,1,'2018-12-03 14:52:12',0,NULL,'1','XSD1201812030005','XSDD1201812030002','','2018-12-03','2000000.00',NULL,NULL,NULL,NULL),
(116,NULL,2,'0',1,3,1,'2018-12-03 14:52:21',3,NULL,'1','XSD1201812030006','XSDD1201812030001','','2018-12-03','2000000.00',NULL,NULL,NULL,NULL),
(117,NULL,2,'0',1,5,1,'2018-12-05 12:00:01',1,NULL,'1','XSD1201812050001','XSDD1201812050001','123466','2018-12-05','81600',NULL,NULL,NULL,NULL),
(118,NULL,2,'1000000',1,NULL,1,'2018-12-05 16:05:19',0,NULL,'1','XSD1201812050002','XSDD1201812050002','','2018-12-05','1000000',NULL,NULL,NULL,NULL),
(119,NULL,2,'1164436',1,NULL,1,'2018-12-08 16:18:24',0,NULL,'1','XSD1201812080001','XSDD1201812080012','','2018-12-08','1164436',NULL,NULL,NULL,NULL),
(120,NULL,1,'800.00',1,NULL,1,'2018-12-08 16:27:35',0,NULL,'1','XSD1201812080002','XSDD1201812080014','','2018-12-08','800.00',NULL,NULL,NULL,NULL),
(121,NULL,1,'1163636',1,NULL,1,'2018-12-08 16:27:46',0,NULL,'1','XSD1201812080003','XSDD1201812080013','','2018-12-08','1163636',NULL,NULL,NULL,NULL),
(122,NULL,1,'1163636',1,NULL,1,'2018-12-08 16:30:41',0,NULL,'1','XSD1201812080004','XSDD1201812080016','','2018-12-08','1163636',NULL,NULL,NULL,NULL),
(123,NULL,2,'1164436.00',1,NULL,1,'2018-12-08 16:31:28',0,NULL,'1','XSD1201812080005','XSDD1201812080015','','2018-12-08','1164436.00',NULL,NULL,NULL,NULL),
(124,NULL,2,'581818',1,NULL,1,'2018-12-08 20:41:57',0,NULL,'1','XSD1201812080006','XSDD1201812080017','','2018-12-08','581818',NULL,NULL,NULL,NULL),
(130,NULL,2,'6989816',1,NULL,1,'2018-12-08 20:43:24',0,NULL,'1','XSD1201812080007','XSDD1201812080018','','2018-12-08','6989816',NULL,NULL,NULL,NULL),
(131,NULL,2,'582618.00',1,NULL,1,'2018-12-08 20:55:39',0,NULL,'1','XSD1201812080008','XSDD1201812080023','','2018-12-08','582618.00',NULL,NULL,NULL,NULL),
(132,NULL,2,'800',1,NULL,1,'2018-12-08 20:56:11',0,NULL,'1','XSD1201812080009','XSDD1201812080025','','2018-12-08','800',NULL,NULL,NULL,NULL),
(133,NULL,2,'582618.00',1,NULL,1,'2018-12-08 20:56:28',0,NULL,'1','XSD1201812080010','XSDD1201812080024','','2018-12-08','582618.00',NULL,NULL,NULL,NULL),
(134,NULL,2,'1747854',1,NULL,1,'2018-12-08 20:56:54',0,NULL,'1','XSD1201812080011','XSDD1201812080026','','2018-12-08','1747854',NULL,NULL,NULL,NULL),
(135,NULL,1,'0',1,3,1,'2018-12-08 20:58:22',3,NULL,'1','XSD1201812080012','XSDD1201812080027','25000','2018-12-08','1604',NULL,NULL,NULL,NULL),
(136,NULL,2,'6411998',1,4,1,NULL,2,NULL,NULL,'XSD1201812080013',NULL,NULL,NULL,'6411998',NULL,NULL,NULL,NULL),
(137,NULL,1,'800',1,4,1,NULL,2,NULL,NULL,'XSD1201812080014',NULL,NULL,NULL,'800',NULL,NULL,NULL,NULL),
(138,NULL,2,'6982616',1,NULL,1,'2018-12-08 23:21:44',2,NULL,NULL,'XSD1201812080014',NULL,NULL,'2018-12-08','6982616',NULL,NULL,NULL,NULL),
(139,NULL,2,'582618',1,NULL,1,'2018-12-08 23:25:18',2,NULL,NULL,'XSD1201812080015',NULL,NULL,'2018-12-08','582618',NULL,NULL,NULL,NULL),
(140,NULL,2,'0',1,NULL,1,'2018-12-08 23:29:39',2,NULL,NULL,'XSD1201812080016',NULL,NULL,'2018-12-08','582618',NULL,NULL,NULL,NULL),
(141,NULL,1,'800',1,NULL,1,'2018-12-08 23:34:03',2,NULL,NULL,'XSD1201812080017',NULL,NULL,'2018-12-08','800',NULL,NULL,NULL,NULL),
(142,NULL,1,'800',1,NULL,1,'2018-12-08 23:35:08',2,NULL,NULL,'XSD1201812080018',NULL,NULL,'2018-12-08','800',NULL,NULL,NULL,NULL),
(143,NULL,1,'581818',1,NULL,1,'2018-12-08 23:35:58',2,NULL,NULL,'XSD1201812080019',NULL,NULL,'2018-12-08','581818',NULL,NULL,NULL,NULL),
(144,NULL,2,'1745454',1,NULL,1,'2018-12-09 15:15:22',0,NULL,'1','XSD1201812090001','XSDD1201812090001','','2018-12-09','1745454',NULL,NULL,NULL,NULL),
(145,NULL,2,'1164436',1,NULL,1,'2018-12-09 15:24:57',2,NULL,NULL,'XSD1201812090002',NULL,NULL,'2018-12-09','1164436',NULL,NULL,NULL,NULL),
(146,NULL,1,'581818',1,NULL,1,'2018-12-09 15:25:27',2,NULL,NULL,'XSD1201812090003',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(147,NULL,1,'581818',1,NULL,1,'2018-12-09 15:26:02',2,NULL,NULL,'XSD1201812090004',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(148,NULL,1,'581818',1,NULL,1,'2018-12-09 15:27:00',2,NULL,NULL,'XSD1201812090005',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(149,NULL,1,'581818',1,NULL,1,'2018-12-09 15:28:09',2,NULL,NULL,'XSD1201812090006',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(150,NULL,1,'800',1,NULL,1,'2018-12-09 15:28:37',2,NULL,NULL,'XSD1201812090007',NULL,NULL,'2018-12-09','800',NULL,NULL,NULL,NULL),
(151,NULL,1,'581818',1,NULL,1,'2018-12-09 20:40:00',2,NULL,NULL,'XSD1201812090008',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(152,NULL,1,'581818',1,NULL,1,'2018-12-09 20:41:17',2,NULL,NULL,'XSD1201812090009',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(153,NULL,1,'581818',1,NULL,1,'2018-12-09 20:42:29',2,NULL,NULL,'XSD1201812090010',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(154,NULL,1,'581818',1,NULL,1,'2018-12-09 20:43:13',2,NULL,NULL,'XSD1201812090011',NULL,NULL,'2018-12-09','581818',NULL,NULL,NULL,NULL),
(155,NULL,1,'581818.00',1,5,1,'2018-12-09 20:43:40',0,NULL,'1','XSD1201812090012','XSDD1201812090002','','2018-12-09','581818.00',NULL,NULL,NULL,NULL);

/*Table structure for table `salesdetails` */

DROP TABLE IF EXISTS `salesdetails`;

CREATE TABLE `salesdetails` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Salesid` int(11) DEFAULT NULL COMMENT '出售主表编号',
  `money` double DEFAULT NULL COMMENT '出售的商品实例的总价(没打折的价格，也就是商品原价的总和)',
  `count` int(11) DEFAULT NULL COMMENT '出售商品实例的总数量',
  `Takeinmoney` double DEFAULT NULL COMMENT '实际支付金额（零售价格综合，如果是客户，按照客户等级进行再次打折后的价格）',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8;

/*Data for the table `salesdetails` */

insert  into `salesdetails`(`Id`,`Salesid`,`money`,`count`,`Takeinmoney`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(213,107,19200,8,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(214,107,9600,4,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(215,108,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(216,108,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(217,109,2400,1,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(218,109,2400,1,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(219,110,2400,1,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(220,110,2400,1,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(221,111,7200,3,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(222,111,12000,5,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(223,112,2400,1,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(224,112,2400,1,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(225,113,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(226,113,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(227,114,2400,1,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(228,114,2400,1,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(229,115,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(230,115,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(231,116,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(232,116,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(233,117,76800,32,2400,1,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(234,117,4800,2,2400,1,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(235,118,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(236,118,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(237,119,800,1,800,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(238,119,1163636,2,581818,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(239,120,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(240,121,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(241,122,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(242,123,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(243,123,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(244,124,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(245,124,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(256,130,8000,10,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(257,130,6981816,12,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(258,131,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(259,131,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(260,132,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(261,132,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(262,133,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(263,133,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(264,134,2400,3,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(265,134,1745454,3,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(266,135,1604,2,802,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(267,136,12000,15,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(268,136,6399998,11,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(269,137,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(270,138,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(271,138,6981816,12,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(272,139,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(273,139,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(274,140,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(275,140,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(276,141,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(277,142,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(278,143,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(279,144,1745454,3,581818,0,NULL,NULL,'2','贾森基德年年度记者金牛座',NULL,NULL,NULL),
(280,144,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(281,145,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度记者金牛座',NULL,NULL,NULL),
(282,145,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(283,146,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度记者金牛座',NULL,NULL,NULL),
(284,147,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(285,148,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度记者金牛座',NULL,NULL,NULL),
(286,149,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(287,150,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(288,151,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(289,152,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(290,153,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(291,154,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(292,155,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL);

/*Table structure for table `salesindent` */

DROP TABLE IF EXISTS `salesindent`;

CREATE TABLE `salesindent` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT NULL COMMENT '出售总价',
  `count` int(11) DEFAULT '0' COMMENT '出售总数量',
  `cid` varchar(50) DEFAULT NULL COMMENT '客户',
  `SalesIndentNub` varchar(50) DEFAULT NULL COMMENT '销售订单',
  `Sid` int(11) DEFAULT NULL COMMENT '门面编号',
  `pid` double DEFAULT NULL COMMENT '支付类型',
  `remark` varchar(250) DEFAULT NULL COMMENT '备注',
  `time` datetime DEFAULT NULL COMMENT '订单日期',
  `status` int(11) DEFAULT '0' COMMENT '是否删除 0可执行 2删除 1已完成',
  `deposi` double DEFAULT NULL COMMENT '定金',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=321 DEFAULT CHARSET=utf8;

/*Data for the table `salesindent` */

insert  into `salesindent`(`Id`,`money`,`count`,`cid`,`SalesIndentNub`,`Sid`,`pid`,`remark`,`time`,`status`,`deposi`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(230,NULL,2,'1','XSDD1201811290001',1,1,'','2018-11-29 08:00:00',1,25000000,'2018-11-29 13:39:28','2000000.00',NULL,NULL,NULL),
(231,NULL,2,'1','XSDD1201811290002',1,NULL,'','2018-11-29 08:00:00',2,NULL,'2018-11-29 13:44:44','2000000.00',NULL,NULL,NULL),
(232,NULL,2,'1','XSDD1201811290003',1,NULL,'','2018-11-29 08:00:00',0,NULL,'2018-11-29 13:45:34','2000000.00',NULL,NULL,NULL),
(233,NULL,2,'1','XSDD1201811290004',1,NULL,'','2018-11-29 08:00:00',1,NULL,'2018-11-29 13:45:37','2000000.00',NULL,NULL,NULL),
(234,NULL,2,'1','XSDD1201811290005',1,NULL,'','2018-11-29 08:00:00',1,NULL,'2018-11-29 13:45:40','2000000.00',NULL,NULL,NULL),
(235,NULL,2,'1','XSDD1201812010001',1,NULL,'','2018-12-01 08:00:00',2,NULL,'2018-12-01 15:39:32','2000000.00',NULL,NULL,NULL),
(236,NULL,2,'1','XSDD1201812010002',1,NULL,'','2018-12-01 08:00:00',2,NULL,'2018-12-01 15:39:39','2000000.00',NULL,NULL,NULL),
(237,NULL,2,'1','XSDD1201812020001',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:20:48','2000000.00',NULL,NULL,NULL),
(238,NULL,2,'1','XSDD1201812020002',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:20:59','2000000.00',NULL,NULL,NULL),
(239,NULL,2,'1','XSDD1201812020003',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:23:22','2000000.00',NULL,NULL,NULL),
(240,NULL,2,'1','XSDD1201812020004',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:25:34','2000000.00',NULL,NULL,NULL),
(241,NULL,2,'1','XSDD1201812020005',1,NULL,'','2018-12-02 08:00:00',1,NULL,'2018-12-02 15:26:04','2000000.00',NULL,NULL,NULL),
(242,NULL,2,'1','XSDD1201812020006',1,NULL,'','2018-12-02 08:00:00',1,NULL,'2018-12-02 15:27:17','2000000.00',NULL,NULL,NULL),
(243,NULL,2,'1','XSDD1201812020007',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:29:18','2000000.00',NULL,NULL,NULL),
(244,NULL,2,'1','XSDD1201812020008',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:29:30','2000000.00',NULL,NULL,NULL),
(245,NULL,2,'1','XSDD1201812020009',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:29:37','2000000.00',NULL,NULL,NULL),
(246,NULL,2,'1','XSDD1201812020010',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:30:45','2000000.00',NULL,NULL,NULL),
(247,NULL,2,'1','XSDD1201812020011',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:31:10','2000000.00',NULL,NULL,NULL),
(248,NULL,2,'1','XSDD1201812020012',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:38:27','2000000.00',NULL,NULL,NULL),
(249,NULL,2,'1','XSDD1201812020013',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:38:58','2000000.00',NULL,NULL,NULL),
(250,NULL,2,'1','XSDD1201812020014',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:39:04','2000000.00',NULL,NULL,NULL),
(251,NULL,2,'1','XSDD1201812020015',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:39:23','2000000.00',NULL,NULL,NULL),
(252,NULL,2,'1','XSDD1201812020016',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:39:31','2000000.00',NULL,NULL,NULL),
(253,NULL,2,'1','XSDD1201812020017',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:51:32','2000000.00',NULL,NULL,NULL),
(254,NULL,2,'1','XSDD1201812020018',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:51:42','2000000.00',NULL,NULL,NULL),
(255,NULL,2,'1','XSDD1201812020019',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:51:53','2000000.00',NULL,NULL,NULL),
(256,NULL,2,'1','XSDD1201812020020',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:52:38','2000000.00',NULL,NULL,NULL),
(257,NULL,2,'1','XSDD1201812020021',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:53:48','2000000.00',NULL,NULL,NULL),
(258,NULL,2,'1','XSDD1201812020022',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:55:07','2000000.00',NULL,NULL,NULL),
(259,NULL,2,'1','XSDD1201812020023',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:55:26','2000000.00',NULL,NULL,NULL),
(260,NULL,2,'1','XSDD1201812020024',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:56:05','2000000.00',NULL,NULL,NULL),
(261,NULL,2,'1','XSDD1201812020025',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:56:12','2000000.00',NULL,NULL,NULL),
(262,NULL,2,'1','XSDD1201812020026',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:57:16','2000000.00',NULL,NULL,NULL),
(263,NULL,2,'1','XSDD1201812020027',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 15:59:54','2000000.00',NULL,NULL,NULL),
(264,NULL,2,'1','XSDD1201812020028',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:01:07','2000000.00',NULL,NULL,NULL),
(265,NULL,2,'1','XSDD1201812020029',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:01:12','2000000.00',NULL,NULL,NULL),
(266,NULL,2,'1','XSDD1201812020030',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:01:18','2000000.00',NULL,NULL,NULL),
(267,NULL,2,'1','XSDD1201812020031',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:02:06','2000000.00',NULL,NULL,NULL),
(268,NULL,2,'1','XSDD1201812020032',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:02:14','2000000.00',NULL,NULL,NULL),
(269,NULL,2,'1','XSDD1201812020033',1,NULL,'','2018-12-02 08:00:00',2,NULL,'2018-12-02 16:02:18','2000000.00',NULL,NULL,NULL),
(270,NULL,2,'1','XSDD1201812020034',1,NULL,'','2018-12-02 08:00:00',1,NULL,'2018-12-02 16:02:24','2000000.00',NULL,NULL,NULL),
(271,NULL,2,'1','XSDD1201812020035',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:04:49','2000000.00',NULL,NULL,NULL),
(272,NULL,2,'1','XSDD1201812020036',1,NULL,'','2018-12-02 08:00:00',0,NULL,'2018-12-02 16:07:55','2000000.00',NULL,NULL,NULL),
(273,NULL,2,'1','XSDD1201812030001',1,3,'','2018-12-03 08:00:00',2,250000,'2018-12-03 14:34:13','2000000.00',NULL,NULL,NULL),
(274,NULL,2,'1','XSDD1201812030002',1,NULL,'','2018-12-03 08:00:00',2,NULL,'2018-12-03 14:35:13','2000000.00',NULL,NULL,NULL),
(275,NULL,2,'1','XSDD1201812030003',1,NULL,'','2018-12-03 08:00:00',0,25000,'2018-12-03 15:05:27','2000000.00',NULL,NULL,NULL),
(276,NULL,2,'1','XSDD1201812030004',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:06:26','2000000.00',NULL,NULL,NULL),
(277,NULL,2,'1','XSDD1201812030005',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:21','2000000.00',NULL,NULL,NULL),
(278,NULL,2,'1','XSDD1201812030006',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:25','2000000.00',NULL,NULL,NULL),
(279,NULL,2,'1','XSDD1201812030007',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:28','2000000.00',NULL,NULL,NULL),
(280,NULL,2,'1','XSDD1201812030008',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:48','2000000.00',NULL,NULL,NULL),
(281,NULL,2,'1','XSDD1201812030009',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:51','2000000.00',NULL,NULL,NULL),
(282,NULL,2,'1','XSDD1201812030010',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:53','2000000.00',NULL,NULL,NULL),
(283,NULL,2,'1','XSDD1201812030011',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:55','2000000.00',NULL,NULL,NULL),
(284,NULL,2,'1','XSDD1201812030012',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:07:58','2000000.00',NULL,NULL,NULL),
(285,NULL,2,'1','XSDD1201812030013',1,NULL,'','2018-12-03 08:00:00',0,NULL,'2018-12-03 15:08:00','2000000.00',NULL,NULL,NULL),
(286,NULL,2,'1','XSDD1201812050001',1,5,'123466','2018-12-05 08:00:00',1,2580,'2018-12-05 11:59:39','2000000.00',NULL,NULL,NULL),
(287,NULL,2,'1','XSDD1201812050002',1,NULL,'','2018-12-05 08:00:00',2,NULL,'2018-12-05 15:46:01','2000000.00',NULL,NULL,NULL),
(288,NULL,2,'1','XSDD1201812080001',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 14:08:55','2000000.00',NULL,NULL,NULL),
(289,NULL,1,'1','XSDD1201812080002',1,2,'uuuu','2018-12-08 08:00:00',0,25008,'2018-12-08 15:03:57','1600',NULL,NULL,NULL),
(290,NULL,1,'1','XSDD1201812080003',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:06:51','800.00',NULL,NULL,NULL),
(291,NULL,1,'1','XSDD1201812080004',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:07:37','800.00',NULL,NULL,NULL),
(292,NULL,1,'1','XSDD1201812080005',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:08:30','4000',NULL,NULL,NULL),
(293,NULL,1,'1','XSDD1201812080006',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:10:18','800.00',NULL,NULL,NULL),
(294,NULL,1,'1','XSDD1201812080007',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:10:40','11200',NULL,NULL,NULL),
(295,NULL,1,'1','XSDD1201812080008',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:46:45','800.00',NULL,NULL,NULL),
(296,NULL,1,'1','XSDD1201812080009',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:47:59','800.00',NULL,NULL,NULL),
(297,NULL,1,'1','XSDD1201812080010',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 15:56:58','581818.00',NULL,NULL,NULL),
(298,NULL,1,'1','XSDD1201812080011',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 16:00:32','581818.00',NULL,NULL,NULL),
(299,NULL,2,'1','XSDD1201812080012',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:08:59','1164436',NULL,NULL,NULL),
(300,NULL,1,'1','XSDD1201812080013',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:18:47','1163636',NULL,NULL,NULL),
(301,NULL,1,'1','XSDD1201812080014',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:27:27','800.00',NULL,NULL,NULL),
(302,NULL,2,'1','XSDD1201812080015',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:28:42','1164436.00',NULL,NULL,NULL),
(303,NULL,1,'1','XSDD1201812080016',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:29:09','581818.00',NULL,NULL,NULL),
(304,NULL,1,'1','XSDD1201812080017',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 16:31:49','581818.00',NULL,NULL,NULL),
(305,NULL,1,'1','XSDD1201812080018',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 20:26:26','800.00',NULL,NULL,NULL),
(306,NULL,2,'1','XSDD1201812080019',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 20:43:59','582618.00',NULL,NULL,NULL),
(307,NULL,1,'1','XSDD1201812080020',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 20:44:17','581818.00',NULL,NULL,NULL),
(308,NULL,2,'1','XSDD1201812080021',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 20:46:03','582618.00',NULL,NULL,NULL),
(309,NULL,2,'1','XSDD1201812080022',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 20:47:04','582618.00',NULL,NULL,NULL),
(310,NULL,2,'1','XSDD1201812080023',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 20:47:51','582618.00',NULL,NULL,NULL),
(311,NULL,2,'1','XSDD1201812080024',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 20:49:53','582618.00',NULL,NULL,NULL),
(313,NULL,1,'1','XSDD1201812080025',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 20:56:02','800.00',NULL,NULL,NULL),
(314,NULL,2,'1','XSDD1201812080026',1,NULL,'','2018-12-08 08:00:00',2,NULL,'2018-12-08 20:56:45','582618.00',NULL,NULL,NULL),
(315,NULL,2,'1','XSDD1201812080027',1,3,'25000','2018-12-08 08:00:00',2,25000,'2018-12-08 20:57:53','582618.00',NULL,NULL,NULL),
(316,NULL,1,'1','XSDD1201812080028',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 23:26:23','800.00',NULL,NULL,NULL),
(317,NULL,1,'1','XSDD1201812080029',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 23:34:41','800.00',NULL,NULL,NULL),
(318,NULL,1,'1','XSDD1201812080030',1,NULL,'','2018-12-08 08:00:00',0,NULL,'2018-12-08 23:35:17','800.00',NULL,NULL,NULL),
(319,NULL,1,'1','XSDD1201812090001',1,NULL,'','2018-12-09 08:00:00',2,NULL,'2018-12-09 11:49:58','581818.00',NULL,NULL,NULL),
(320,NULL,1,'1','XSDD1201812090002',1,5,'','2018-12-09 08:00:00',2,255555,'2018-12-09 20:43:30','581818.00',NULL,NULL,NULL);

/*Table structure for table `salesindentdetails` */

DROP TABLE IF EXISTS `salesindentdetails`;

CREATE TABLE `salesindentdetails` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Salesindentid` int(11) DEFAULT NULL COMMENT '销售订单主表编号',
  `money` double DEFAULT NULL COMMENT '出售的商品实例的总价(没打折的价格，也就是商品原价的总和)',
  `count` int(11) DEFAULT NULL COMMENT '出售商品实例的总数量',
  `Takeinmoney` double DEFAULT NULL COMMENT '实际支付金额（零售价格综合，如果是客户，按照客户等级进行再次打折后的价格）',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '商品编号',
  `user2` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=516 DEFAULT CHARSET=utf8;

/*Data for the table `salesindentdetails` */

insert  into `salesindentdetails`(`Id`,`Salesindentid`,`money`,`count`,`Takeinmoney`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(358,230,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(359,230,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(360,231,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(361,231,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(362,232,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(363,232,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(364,233,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(365,233,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(366,234,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(367,234,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(368,235,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(369,235,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(370,236,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(371,236,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(372,237,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(373,237,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(374,238,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(375,238,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(376,239,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(377,239,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(378,240,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(379,240,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(380,241,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(381,241,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(382,242,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(383,242,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(384,243,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(385,243,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(386,244,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(387,244,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(388,245,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(389,245,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(390,246,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(391,246,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(392,247,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(393,247,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(394,248,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(395,248,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(396,249,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(397,249,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(398,250,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(399,250,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(400,251,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(401,251,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(402,252,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(403,252,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(404,253,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(405,253,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(406,254,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(407,254,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(408,255,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(409,255,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(410,256,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(411,256,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(412,257,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(413,257,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(414,258,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(415,258,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(416,259,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(417,259,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(418,260,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(419,260,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(420,261,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(421,261,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(422,262,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(423,262,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(424,263,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(425,263,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(426,264,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(427,264,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(428,265,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(429,265,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(430,266,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(431,266,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(432,267,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(433,267,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(434,268,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(435,268,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(436,269,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(437,269,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(438,270,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(439,270,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(440,271,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(441,271,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(442,272,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(443,272,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(444,273,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(445,273,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(446,274,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(447,274,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(448,275,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(449,275,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(450,276,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(451,276,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(452,277,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(453,277,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(454,278,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(455,278,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(456,279,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(457,279,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(458,280,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(459,280,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(460,281,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(461,281,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(462,282,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(463,282,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(464,283,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(465,283,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(466,284,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(467,284,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(468,285,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(469,285,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(470,286,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(471,286,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(472,287,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(473,287,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(474,288,2400,1,2400,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(475,288,2400,1,2400,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(476,289,1600,2,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(477,290,800,1,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(478,291,800,1,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(479,292,4000,5,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(480,293,800,1,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(481,294,11200,14,800,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(482,295,800,1,800,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(483,296,800,1,800,0,NULL,NULL,'1',NULL,NULL,NULL,NULL),
(484,297,581818,1,581818,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(485,298,581818,1,581818,0,NULL,NULL,'2',NULL,NULL,NULL,NULL),
(486,299,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(487,299,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(488,300,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(489,301,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(490,302,1163636,2,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(491,302,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(492,303,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(493,304,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(494,305,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(495,306,581818,1,581818,0,NULL,NULL,'2','',NULL,NULL,NULL),
(496,306,800,1,800,0,NULL,NULL,'1','',NULL,NULL,NULL),
(497,307,581818,1,581818,0,NULL,NULL,'2','',NULL,NULL,NULL),
(498,308,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(499,308,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(500,309,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(501,309,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(502,310,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(503,310,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(504,311,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(505,311,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(506,313,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(507,314,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(508,314,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(509,315,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(510,315,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(511,316,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(512,317,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(513,318,800,1,800,0,NULL,NULL,'1','就是觉得',NULL,NULL,NULL),
(514,319,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL),
(515,320,581818,1,581818,0,NULL,NULL,'2','贾森基德年年度-记者金牛座',NULL,NULL,NULL);

/*Table structure for table `salesstockinfo` */

DROP TABLE IF EXISTS `salesstockinfo`;

CREATE TABLE `salesstockinfo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `salesid` int(11) DEFAULT NULL COMMENT '出售详表编号Salesdetail',
  `stockdetailid` int(11) DEFAULT NULL COMMENT '库存详细表编号stockdetail',
  `count` int(11) DEFAULT NULL COMMENT '出售数量',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=283 DEFAULT CHARSET=utf8;

/*Data for the table `salesstockinfo` */

insert  into `salesstockinfo`(`Id`,`salesid`,`stockdetailid`,`count`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(213,213,1,8,'2018-11-29 13:40:56',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(214,214,2,4,'2018-11-29 13:40:56',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(215,215,1,1,'2018-11-29 13:44:48',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(216,216,2,1,'2018-11-29 13:44:48',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(217,217,1,1,'2018-12-02 16:17:11',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(218,218,2,1,'2018-12-02 16:17:11',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(219,219,1,1,'2018-12-02 16:20:27',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(220,220,2,1,'2018-12-02 16:20:27',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(221,221,1,3,'2018-12-03 14:34:49',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(222,222,2,5,'2018-12-03 14:34:49',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(223,223,1,1,'2018-12-03 14:35:20',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(224,224,2,1,'2018-12-03 14:35:20',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(225,225,1,1,'2018-12-03 14:46:59',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(226,226,2,1,'2018-12-03 14:46:59',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(227,227,1,1,'2018-12-03 14:48:01',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(228,228,2,1,'2018-12-03 14:48:01',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(229,229,1,1,'2018-12-03 14:52:12',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(230,230,2,1,'2018-12-03 14:52:12',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(231,231,1,1,'2018-12-03 14:52:21',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(232,232,2,1,'2018-12-03 14:52:21',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(233,233,1,32,'2018-12-05 12:00:01',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(234,234,2,2,'2018-12-05 12:00:01',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(235,235,1,1,'2018-12-05 16:05:19',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(236,236,2,1,'2018-12-05 16:05:19',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(237,237,1,1,'2018-12-08 16:18:24',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(238,238,2,2,'2018-12-08 16:18:24',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(239,239,1,1,'2018-12-08 16:27:35',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(240,240,2,2,'2018-12-08 16:27:46',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(241,241,2,2,'2018-12-08 16:30:41',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(242,242,2,2,'2018-12-08 16:31:28',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(243,243,1,1,'2018-12-08 16:31:28',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(244,244,2,1,'2018-12-08 20:41:57',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(245,245,1,1,'2018-12-08 20:41:57',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(246,256,1,10,'2018-12-08 20:43:24',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(247,257,2,12,'2018-12-08 20:43:24',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(248,258,2,1,'2018-12-08 20:55:39',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(249,259,1,1,'2018-12-08 20:55:39',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(250,260,1,1,'2018-12-08 20:56:11',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(251,261,2,1,'2018-12-08 20:56:11',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(252,262,1,1,'2018-12-08 20:56:28',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(253,263,2,1,'2018-12-08 20:56:28',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(254,264,1,3,'2018-12-08 20:56:54',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(255,265,2,3,'2018-12-08 20:56:54',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(256,266,1,2,'2018-12-08 20:58:22',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(257,267,1,15,'2018-12-08 23:17:22',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(258,268,2,11,'2018-12-08 23:17:22',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(259,269,1,1,'2018-12-08 23:19:26',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(260,270,1,1,'2018-12-08 23:21:44',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(261,271,2,12,'2018-12-08 23:21:44',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(262,272,1,1,'2018-12-08 23:25:18',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(263,273,2,1,'2018-12-08 23:25:18',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(264,274,1,1,'2018-12-08 23:29:39',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(265,275,2,1,'2018-12-08 23:29:39',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(266,276,1,1,'2018-12-08 23:34:03',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(267,277,1,1,'2018-12-08 23:35:08',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(268,278,2,1,'2018-12-08 23:35:58',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(269,279,2,3,'2018-12-09 15:15:22',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(270,280,1,1,'2018-12-09 15:15:22',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(271,281,2,2,'2018-12-09 15:24:57',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(272,282,1,1,'2018-12-09 15:24:57',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(273,283,2,1,'2018-12-09 15:25:27',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(274,284,2,1,'2018-12-09 15:26:02',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(275,285,2,1,'2018-12-09 15:27:00',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(276,286,2,1,'2018-12-09 15:28:09',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(277,287,1,1,'2018-12-09 15:28:37',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(278,288,2,1,'2018-12-09 20:40:00',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(279,289,2,1,'2018-12-09 20:41:17',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(280,290,2,1,'2018-12-09 20:42:29',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(281,291,2,1,'2018-12-09 20:43:13',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(282,292,2,1,'2018-12-09 20:43:40',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `standard` */

DROP TABLE IF EXISTS `standard`;

CREATE TABLE `standard` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '规格名称',
  `Tid` int(11) DEFAULT NULL COMMENT '商品类型编号：Goodstype',
  `Gid` int(11) DEFAULT NULL COMMENT '商品编号goods表，如果有商品编号表示为自定义的规格，没有',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL COMMENT '操作员编号',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `standard` */

insert  into `standard`(`Id`,`Name`,`Tid`,`Gid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'库恩说',1,5,'2018-12-08 15:55:34',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `standardinstance` */

DROP TABLE IF EXISTS `standardinstance`;

CREATE TABLE `standardinstance` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '规格实例名称',
  `sid` int(11) DEFAULT NULL COMMENT '规格编号：standard',
  `Gid` int(11) DEFAULT NULL COMMENT '商品编号goods表，如果有商品编号表示为自定义的规格实例，没有则是为默认规格实例',
  `time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL COMMENT '操作员编号',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `standardinstance` */

insert  into `standardinstance`(`Id`,`Name`,`sid`,`Gid`,`time`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'记者金牛座',1,5,'2018-12-08 15:55:34',0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Code` varchar(20) DEFAULT NULL COMMENT '批次号:年月日+每天的自增值，自增值为四位，不够四位前面补0',
  `Allprice` double DEFAULT NULL COMMENT '这批次总共进货价格',
  `Allcount` int(11) DEFAULT NULL COMMENT '总进货数量',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：store',
  `Supid` int(11) DEFAULT NULL COMMENT '供应商编号supplier，如果为空则表示没有供应商属于散货',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '单据时间',
  `user2` varchar(50) DEFAULT NULL COMMENT '应付价格',
  `user3` varchar(50) DEFAULT NULL COMMENT '实付款',
  `user4` varchar(50) DEFAULT NULL COMMENT '结算账户',
  `user5` varchar(50) DEFAULT NULL COMMENT '备注',
  `user6` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user7` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user8` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user9` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `stock` */

insert  into `stock`(`Id`,`Code`,`Allprice`,`Allcount`,`Time`,`Sid`,`Supid`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`,`user6`,`user7`,`user8`,`user9`) values 
(1,'JHD1201811200001',20000000,500,'2018-11-29 10:55:06',1,1,0,NULL,'1','2018-11-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'JHD1201811290004',1231,5151,'2018-11-28 10:58:46',1,1,0,NULL,'1','2018-11-02',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(3,'JHD1201811290005',NULL,NULL,NULL,1,NULL,0,NULL,NULL,'2018-11-29','','',NULL,NULL,NULL,NULL,NULL,NULL),
(4,'JHD1201811290005',NULL,NULL,NULL,1,NULL,0,NULL,NULL,'2018-11-29','','',NULL,NULL,NULL,NULL,NULL,NULL),
(5,'JHD1201811290006',NULL,NULL,NULL,1,NULL,0,NULL,NULL,'2018-11-29','250','250',NULL,NULL,NULL,NULL,NULL,NULL),
(6,'JHD1201811290007',2000000,NULL,NULL,1,NULL,0,NULL,NULL,'2018-11-29','250','250',NULL,NULL,NULL,NULL,NULL,NULL),
(7,'JHD1201811290008',2000000,2,NULL,1,NULL,0,NULL,NULL,'2018-11-29','120','120',NULL,NULL,NULL,NULL,NULL,NULL),
(8,'JHD1201811290009',2000000,2,NULL,1,1,0,NULL,NULL,'2018-11-29','250','265',NULL,NULL,NULL,NULL,NULL,NULL),
(9,'JHD1201811290009',2000000,2,'2018-11-29 16:17:40',1,1,0,NULL,NULL,'2018-11-29','250','265',NULL,NULL,NULL,NULL,NULL,NULL),
(10,'JHD1201811290010',2000000,2,'2018-11-29 16:27:42',1,1,0,NULL,NULL,'2018-11-29','200','100',NULL,NULL,NULL,NULL,NULL,NULL),
(12,'JHD1201811290011',2000000,2,'2018-11-29 16:31:25',1,1,0,NULL,NULL,'2018-11-29','250','250',NULL,NULL,NULL,NULL,NULL,NULL),
(15,'JHD1201811290012',2000000,2,'2018-11-29 16:33:10',1,1,0,NULL,NULL,'2018-11-29','250','240',NULL,NULL,NULL,NULL,NULL,NULL),
(16,'JHD1201811290013',2000000,2,'2018-11-29 16:33:29',1,1,0,NULL,NULL,'2018-11-29','254','258',NULL,NULL,NULL,NULL,NULL,NULL),
(17,'JHD1201812010001',2000000,2,'2018-12-01 13:54:38',1,1,0,NULL,NULL,'2018-12-01','2500','2500','','',NULL,NULL,NULL,NULL),
(19,'JHD1201812030001',2000000,2,'2018-12-03 14:35:48',1,1,0,NULL,NULL,'2018-12-03','258','250','','',NULL,NULL,NULL,NULL),
(20,'JHD1201812050001',2000000,2,'2018-12-05 11:58:13',1,1,0,NULL,NULL,'2018-12-05','250','200','5','',NULL,NULL,NULL,NULL),
(21,'JHD1201812050002',2000000,2,'2018-12-05 11:59:09',1,1,0,NULL,NULL,'2018-12-05','5','5','','',NULL,NULL,NULL,NULL),
(23,'JHD1201812080001',2000000,2,'2018-12-08 11:12:34',1,1,0,NULL,NULL,'2018-12-08','155','250','','',NULL,NULL,NULL,NULL),
(24,'-1',310800,200,'2018-12-08 12:08:23',1,NULL,0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(25,'-1',70325242806,83882,'2018-12-08 15:55:34',1,NULL,0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(26,'JHD1201812090001',1747054,2,'2018-12-09 13:52:55',1,1,0,NULL,NULL,'2018-12-09','1747054','1747054','3','',NULL,NULL,NULL,NULL),
(27,'JHD1201812090002',6991416,2,'2018-12-09 14:12:08',1,1,0,NULL,NULL,'2018-12-09','6991416','6991416','2','',NULL,NULL,NULL,NULL),
(28,'JHD1201812090003',1164436,2,'2018-12-09 19:59:24',1,1,0,NULL,NULL,'2018-12-09','1164436','1164436','3','',NULL,NULL,NULL,NULL),
(29,'JHD1201812090004',581818,1,'2018-12-09 20:04:36',1,1,0,NULL,NULL,'2018-12-09','581818','581818','','',NULL,NULL,NULL,NULL),
(30,'JHD1201812090005',581818,1,'2018-12-09 20:31:32',1,1,0,NULL,NULL,'2018-12-09','581818','581818','3','',NULL,NULL,NULL,NULL);

/*Table structure for table `stockdetail` */

DROP TABLE IF EXISTS `stockdetail`;

CREATE TABLE `stockdetail` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Goodsinstanceid` int(11) DEFAULT NULL COMMENT '商品实例编号Goodsinstance',
  `Sid` int(11) DEFAULT NULL COMMENT '库存主表编号stock',
  `count` int(11) DEFAULT NULL COMMENT '进货数量',
  `scount` int(11) DEFAULT NULL COMMENT '出售数量 ，剩余数量等于count-scount',
  `Sum` double DEFAULT NULL COMMENT '进货总价格',
  `Price` double DEFAULT NULL COMMENT '进货单价格',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*Data for the table `stockdetail` */

insert  into `stockdetail`(`Id`,`Goodsinstanceid`,`Sid`,`count`,`scount`,`Sum`,`Price`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,1,1,400,51,20000,50,0,NULL,'1',NULL,NULL,NULL,NULL,NULL),
(2,2,1,200,72,200000,100,0,NULL,'1',NULL,NULL,NULL,NULL,NULL),
(3,1,2,400,0,200,50,0,NULL,'1',NULL,NULL,NULL,NULL,NULL),
(4,1,4,1,NULL,0,2400,2400,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(5,2,4,1,NULL,0,2400,2400,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(6,1,5,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(7,2,5,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(8,1,6,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(9,2,6,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(10,1,7,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(11,2,7,1,NULL,0,2400,0,2400,NULL,NULL,NULL,NULL,NULL,NULL),
(12,1,8,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(13,2,8,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(14,1,9,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(15,2,9,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(16,1,10,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(17,2,10,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(20,1,12,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(21,2,12,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(26,1,15,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(27,2,15,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(28,1,16,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(29,2,16,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(30,1,17,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(31,2,17,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(34,1,19,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(35,2,19,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(36,1,20,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(37,2,20,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(38,1,21,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(39,2,21,1,0,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL),
(40,1,23,1,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(41,2,23,1,0,2400,2400,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(42,1,NULL,200,0,310800,1554,0,NULL,'lirui',NULL,NULL,NULL,NULL,NULL),
(43,2,NULL,83882,0,70325242806,838383,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(44,2,26,3,0,1745454,581818,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(45,1,26,2,0,1600,800,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(46,2,27,12,0,6981816,581818,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(47,1,27,12,0,9600,800,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(48,NULL,28,2,0,1163636,581818,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(49,1,28,1,0,800,800,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(50,2,29,1,0,581818,581818,0,NULL,NULL,'贾森基德年年度记者金牛座',NULL,NULL,NULL,NULL),
(51,2,30,1,0,581818,581818,0,NULL,NULL,'贾森基德年年度记者金牛座',NULL,NULL,NULL,NULL);

/*Table structure for table `stocksstoreinfo` */

DROP TABLE IF EXISTS `stocksstoreinfo`;

CREATE TABLE `stocksstoreinfo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Sid` int(11) DEFAULT NULL COMMENT '新门店编号：store',
  `oldsid` int(11) DEFAULT NULL COMMENT '来源的哪个门店库存的门店编号：store',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stocksstoreinfo` */

/*Table structure for table `stocksstoreinfodetail` */

DROP TABLE IF EXISTS `stocksstoreinfodetail`;

CREATE TABLE `stocksstoreinfodetail` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Sid` int(11) DEFAULT NULL COMMENT '主表编号',
  `Goodsinstanceid` int(11) DEFAULT NULL COMMENT '商品实例编号',
  `Count` int(11) DEFAULT NULL COMMENT '分配的数量',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stocksstoreinfodetail` */

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '门店名称',
  `Province` varchar(50) DEFAULT NULL COMMENT '省',
  `City` varchar(50) DEFAULT NULL COMMENT '市',
  `district` varchar(50) DEFAULT NULL COMMENT '区',
  `address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `stid` int(11) DEFAULT NULL COMMENT '门店类型',
  `Parented` varchar(20) DEFAULT NULL COMMENT '自我关联',
  `status` int(20) DEFAULT '0' COMMENT '是否删除0，1删除,2冻结，3过期',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `store` */

insert  into `store`(`Id`,`name`,`Province`,`City`,`district`,`address`,`Time`,`stid`,`Parented`,`status`,`async`,`uid`,`user1`,`user2`,`user3`,`user4`,`user5`) values 
(1,'大理石',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `storetype` */

DROP TABLE IF EXISTS `storetype`;

CREATE TABLE `storetype` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '门店类型名称',
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `Level` int(11) DEFAULT '1' COMMENT '级别，从1开始，数字越大级别越小',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storetype` */

/*Table structure for table `storeuser` */

DROP TABLE IF EXISTS `storeuser`;

CREATE TABLE `storeuser` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL COMMENT '门店编号',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL COMMENT '操作人的Id',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storeuser` */

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL COMMENT '供应商名称',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号：Store',
  `Lid` int(11) DEFAULT NULL COMMENT '供应商级别supplierlevel',
  `Phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `Province` varchar(50) DEFAULT NULL COMMENT '省',
  `City` varchar(50) DEFAULT NULL COMMENT '市',
  `District` varchar(50) DEFAULT NULL COMMENT '区',
  `Addres` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `Balance` double DEFAULT NULL COMMENT '余额',
  `freezemoney` double DEFAULT NULL COMMENT '冻结金额',
  `Remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `contacts` varchar(50) DEFAULT NULL COMMENT '自定义',
  `acronymname` varchar(50) DEFAULT NULL COMMENT '自定义',
  `englishname` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `supplier` */

insert  into `supplier`(`Id`,`Name`,`Sid`,`Lid`,`Phone`,`Province`,`City`,`District`,`Addres`,`Balance`,`freezemoney`,`Remark`,`time`,`status`,`async`,`uid`,`contacts`,`acronymname`,`englishname`,`user4`,`user5`) values 
(1,'大哥牛',1,NULL,NULL,NULL,NULL,NULL,NULL,-1000561,NULL,NULL,NULL,0,NULL,NULL,'大牛哥','daniuge','d',NULL,NULL);

/*Table structure for table `supplierlevel` */

DROP TABLE IF EXISTS `supplierlevel`;

CREATE TABLE `supplierlevel` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL COMMENT '级别名称',
  `Agio` int(11) DEFAULT NULL COMMENT '折扣',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号Store',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplierlevel` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '用户名称（必须是电话号码）',
  `pwd` varchar(20) DEFAULT NULL COMMENT '必须6位以上',
  `Time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL COMMENT '用户',
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `userstyle` */

DROP TABLE IF EXISTS `userstyle`;

CREATE TABLE `userstyle` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL COMMENT '名称',
  `Sid` int(11) DEFAULT NULL COMMENT '门店编号Store',
  `time` datetime DEFAULT NULL COMMENT '订单日期',
  `status` int(11) DEFAULT '0' COMMENT '是否删除0，1删除',
  `async` int(11) DEFAULT NULL COMMENT '同步',
  `uid` varchar(50) DEFAULT NULL,
  `user1` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user2` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user3` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user4` varchar(50) DEFAULT NULL COMMENT '自定义',
  `user5` varchar(50) DEFAULT NULL COMMENT '自定义',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `userstyle` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
