/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-09 21:11:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单编号',
  `menu_name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `menu_type` smallint(2) DEFAULT '2' COMMENT '菜单类型(0:CURD;1:系统菜单;2:业务菜单;)',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上级菜单编号',
  `icon_cls` varchar(50) DEFAULT NULL COMMENT '节点图标CSS类名',
  `request_url` varchar(100) DEFAULT NULL COMMENT '请求地址',
  `expand_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '展开状态(1:展开;0:收缩)',
  `sort_no` int(2) DEFAULT NULL COMMENT '排序号',
  `is_show` tinyint(1) NOT NULL DEFAULT '1' COMMENT '叶子节点(0:树枝节点;1:叶子节点)',
  `permission_` varchar(50) DEFAULT NULL COMMENT '权限标识',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `enable` tinyint(1) DEFAULT '1',
  `create_by` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint(20) NOT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='菜单';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统管理', '2', null, null, '#', '0', '1', '1', 'sys', null, '1', '1', '2018-01-08 15:56:18', '1', '2018-01-09 16:04:22');
INSERT INTO `sys_menu` VALUES ('2', '用户管理', '1', '1', '', 'main.sys.user.list', '0', '1', '1', 'sys.base.user', null, '1', '1', '2018-01-06 12:48:05', '1', '2018-01-09 16:04:54');
INSERT INTO `sys_menu` VALUES ('3', '部门管理', '1', '1', '', 'main.sys.dept.list', '0', '2', '1', 'sys.base.dept', null, '1', '1', '2016-06-20 09:16:56', '1', '2018-01-09 16:04:55');
INSERT INTO `sys_menu` VALUES ('4', '菜单管理', '1', '1', '', 'main.sys.menu.list', '0', '3', '1', 'sys.base.menu', null, '1', '1', '2016-06-20 09:16:56', '1', '2018-01-09 16:04:56');
INSERT INTO `sys_menu` VALUES ('5', '角色管理', '1', '1', '', 'main.sys.role.list', '0', '4', '1', 'sys.base.role', null, '1', '1', '2016-06-20 09:16:56', '1', '2018-01-09 16:04:57');
INSERT INTO `sys_menu` VALUES ('6', '字典管理', '1', '1', '', 'main.sys.dic.list', '0', '7', '1', 'sys.base.dic', null, '1', '1', '2016-06-20 09:16:56', '1', '2018-01-09 16:05:26');
SET FOREIGN_KEY_CHECKS=1;
