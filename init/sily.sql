/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-03 15:27:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门编号' ,
`unit_id`  bigint(20) NOT NULL COMMENT '隶属单位' ,
`dept_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称' ,
`parent_id`  bigint(20) NULL DEFAULT NULL COMMENT '上级部门编号' ,
`sort_no`  int(3) NULL DEFAULT NULL COMMENT '排序号' ,
`leaf_`  int(1) NULL DEFAULT NULL COMMENT '叶子节点(0:树枝节点;1:叶子节点)' ,
`enable_`  tinyint(1) NULL DEFAULT NULL COMMENT '启用状态' ,
`remark_`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注' ,
`create_by`  bigint(20) NOT NULL ,
`create_time`  datetime NOT NULL ,
`update_by`  bigint(20) NOT NULL ,
`update_time`  datetime NOT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='部门'
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`account`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录帐户' ,
`password`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录密码' ,
`user_type`  varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '用户类型(1普通用户2管理员3系统用户)' ,
`user_name`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名' ,
`name_pinyin`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名拼音' ,
`sex`  int(1) NOT NULL DEFAULT 0 COMMENT '性别(0:未知;1:男;2:女)' ,
`avatar`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像' ,
`phone`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话' ,
`email`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱' ,
`id_card`  varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号码' ,
`wei_xin`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信' ,
`qq`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'QQ' ,
`birthday`  date NULL DEFAULT NULL COMMENT '出生日期' ,
`dept_id`  bigint(20) NULL DEFAULT NULL COMMENT '部门编号' ,
`position`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位' ,
`address`  varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址' ,
`staff_no`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工号' ,
`enable`  tinyint(1) NULL DEFAULT 1 ,
`remark`  varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
`create_by`  bigint(20) NULL DEFAULT NULL ,
`update_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
`update_by`  bigint(20) NULL DEFAULT NULL ,
PRIMARY KEY (`id`),
UNIQUE INDEX `account` (`account`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户管理'
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for sys_dept
-- ----------------------------
ALTER TABLE `sys_dept` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for sys_user
-- ----------------------------
ALTER TABLE `sys_user` AUTO_INCREMENT=1;
SET FOREIGN_KEY_CHECKS=1;
