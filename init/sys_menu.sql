/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-06 14:09:44
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
INSERT INTO `sys_menu` VALUES ('19', '用户管理', '1', null, '', 'main.sys.user.list', '0', null, '1', '', null, '1', '1', '2018-01-06 12:48:05', '1', '2018-01-06 14:08:14');
SET FOREIGN_KEY_CHECKS=1;
