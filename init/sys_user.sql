/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-10 14:00:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL COMMENT '登录帐户',
  `password` varchar(250) DEFAULT NULL COMMENT '登录密码',
  `user_type` varchar(2) DEFAULT '1' COMMENT '用户类型(1普通用户2管理员3系统用户)',
  `user_name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `name_pinyin` varchar(64) DEFAULT NULL COMMENT '姓名拼音',
  `sex` int(1) NOT NULL DEFAULT '0' COMMENT '性别(0:未知;1:男;2:女)',
  `avatar` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `wei_xin` varchar(32) DEFAULT NULL COMMENT '微信',
  `qq` varchar(32) DEFAULT NULL COMMENT 'QQ',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门编号',
  `position` varchar(64) DEFAULT NULL COMMENT '职位',
  `address` varchar(256) DEFAULT NULL COMMENT '详细地址',
  `staff_no` varchar(32) DEFAULT NULL COMMENT '工号',
  `enable` tinyint(1) DEFAULT '1',
  `remark` varchar(1024) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `create_by` bigint(20) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户管理';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '$2a$05$baP5xNaDvSHNOtXK35g96.Wb9c0EbyqgxlCh5bhJgYTCnHzdec4v2', '1', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, '1', null, '2018-01-04 20:18:11', null, '2018-01-10 12:02:09', null);
INSERT INTO `sys_user` VALUES ('2', 'amy', '$2a$05$baP5xNaDvSHNOtXK35g96.Wb9c0EbyqgxlCh5bhJgYTCnHzdec4v2', '1', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, '1', null, '2018-01-05 15:47:26', null, '2018-01-10 14:00:23', null);
INSERT INTO `sys_user` VALUES ('4', 'ww', '$2a$05$baP5xNaDvSHNOtXK35g96.Wb9c0EbyqgxlCh5bhJgYTCnHzdec4v2', '1', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, '1', null, '2018-01-05 15:49:31', null, '2018-01-10 14:00:24', null);
INSERT INTO `sys_user` VALUES ('5', 'yy', '$2a$05$baP5xNaDvSHNOtXK35g96.Wb9c0EbyqgxlCh5bhJgYTCnHzdec4v2', '1', null, null, '0', null, null, null, null, null, null, null, null, null, null, null, '1', null, '2018-01-05 15:52:20', null, '2018-01-10 14:00:25', null);
SET FOREIGN_KEY_CHECKS=1;
