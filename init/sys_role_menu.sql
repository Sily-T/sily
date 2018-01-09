/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-09 21:11:52
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
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COMMENT='角色授权表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '1', '1', 'read', '1', null, '0', '2018-01-06 14:11:06', '0', '2018-01-09 16:25:48');
INSERT INTO `sys_role_menu` VALUES ('2', '1', '2', 'add', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-09 16:25:43');
INSERT INTO `sys_role_menu` VALUES ('3', '1', '2', 'delete', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-09 16:25:44');
INSERT INTO `sys_role_menu` VALUES ('4', '1', '2', 'read', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-09 16:25:45');
INSERT INTO `sys_role_menu` VALUES ('5', '1', '2', 'update', '1', null, '1', '2018-01-06 14:11:06', '1', '2018-01-09 16:25:47');
INSERT INTO `sys_role_menu` VALUES ('6', '1', '3', 'add', '1', null, '1', '2017-06-29 09:10:50', '1', '2017-06-29 09:10:50');
INSERT INTO `sys_role_menu` VALUES ('7', '1', '3', 'delete', '1', null, '1', '2017-06-29 09:11:18', '1', '2017-06-29 09:11:18');
INSERT INTO `sys_role_menu` VALUES ('8', '1', '3', 'read', '1', null, '1', '2017-06-28 18:18:50', '1', '2017-06-29 08:23:08');
INSERT INTO `sys_role_menu` VALUES ('9', '1', '3', 'update', '1', null, '1', '2017-06-29 09:11:01', '1', '2017-06-29 09:11:01');
INSERT INTO `sys_role_menu` VALUES ('10', '1', '4', 'add', '1', null, '1', '2017-06-29 09:12:14', '1', '2017-06-29 09:12:14');
INSERT INTO `sys_role_menu` VALUES ('11', '1', '4', 'delete', '1', null, '1', '2017-06-29 09:18:43', '1', '2017-06-29 09:18:43');
INSERT INTO `sys_role_menu` VALUES ('12', '1', '4', 'read', '1', null, '1', '2017-06-28 18:18:50', '1', '2017-06-29 08:23:08');
INSERT INTO `sys_role_menu` VALUES ('13', '1', '4', 'update', '1', null, '1', '2017-06-29 09:18:33', '1', '2017-06-29 09:18:33');
INSERT INTO `sys_role_menu` VALUES ('14', '1', '5', 'add', '1', null, '1', '2017-06-29 09:19:00', '1', '2017-06-29 09:19:00');
INSERT INTO `sys_role_menu` VALUES ('15', '1', '5', 'delete', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:19:13');
INSERT INTO `sys_role_menu` VALUES ('16', '1', '5', 'read', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:19:14');
INSERT INTO `sys_role_menu` VALUES ('17', '1', '5', 'update', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:19:16');
INSERT INTO `sys_role_menu` VALUES ('18', '1', '6', 'delete', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:19:17');
INSERT INTO `sys_role_menu` VALUES ('19', '1', '6', 'read', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:19:18');
INSERT INTO `sys_role_menu` VALUES ('20', '1', '6', 'add', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:23:12');
INSERT INTO `sys_role_menu` VALUES ('21', '1', '6', 'update', '1', null, '1', '2017-06-29 09:19:00', '1', '2018-01-09 16:23:14');
SET FOREIGN_KEY_CHECKS=1;
