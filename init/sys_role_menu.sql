/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-06 14:11:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NOT NULL,
  `menu_id` bigint(20) NOT NULL,
  `permission` varchar(50) NOT NULL COMMENT '权限标识',
  `enable` tinyint(1) NOT NULL DEFAULT '1',
  `remark` varchar(5000) DEFAULT NULL,
  `create_by` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint(20) NOT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sys_role_menu_key1` (`role_id`,`menu_id`,`permission`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 COMMENT='角色授权表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1', '0', 'read', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-06 14:11:22');
INSERT INTO `sys_role_menu` VALUES ('2', '1', '1', 'add', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-06 14:11:24');
INSERT INTO `sys_role_menu` VALUES ('3', '1', '1', 'delete', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-06 14:11:28');
INSERT INTO `sys_role_menu` VALUES ('4', '1', '1', 'read', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-06 14:11:31');
INSERT INTO `sys_role_menu` VALUES ('5', '1', '1', 'update', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-06 14:11:33');
SET FOREIGN_KEY_CHECKS=1;
