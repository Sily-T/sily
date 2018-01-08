/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sily

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-08 09:06:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_dic
-- ----------------------------
DROP TABLE IF EXISTS `sys_dic`;
CREATE TABLE `sys_dic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) NOT NULL,
  `code` varchar(50) DEFAULT NULL COMMENT '指令',
  `code_text` varchar(100) DEFAULT NULL COMMENT '指令文本',
  `parent_type` varchar(50) DEFAULT NULL COMMENT '父类型',
  `parent_code` varchar(50) DEFAULT NULL COMMENT '父指令',
  `sort_no` int(2) DEFAULT NULL COMMENT '序号',
  `edit_able` tinyint(1) NOT NULL DEFAULT '1' COMMENT '编辑状态（1可编辑；0不可编辑）',
  `enable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态（1启用，0禁用）',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint(20) NOT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type__code_` (`type`,`code`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='数据字典明细表';

-- ----------------------------
-- Records of sys_dic
-- ----------------------------
INSERT INTO `sys_dic` VALUES ('1', 'SEX', '0', '未知', null, null, '1', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 18:04:13');
INSERT INTO `sys_dic` VALUES ('2', 'SEX', '1', '男', null, null, '2', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:42');
INSERT INTO `sys_dic` VALUES ('3', 'SEX', '2', '女', null, null, '3', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:44');
INSERT INTO `sys_dic` VALUES ('4', 'LOCKED', '0', '激活', null, null, '1', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:46');
INSERT INTO `sys_dic` VALUES ('5', 'LOCKED', '1', '锁定', null, null, '2', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:48');
INSERT INTO `sys_dic` VALUES ('6', 'ROLETYPE', '1', '业务角色', null, null, '1', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:51');
INSERT INTO `sys_dic` VALUES ('7', 'ROLETYPE', '2', '管理角色', null, null, '2', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:53');
INSERT INTO `sys_dic` VALUES ('8', 'ROLETYPE', '3', '系统内置角色', null, null, '3', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:56');
INSERT INTO `sys_dic` VALUES ('9', 'LEAF', '0', '树枝节点', null, null, '1', '0', '1', null, '1', '2018-01-08 18:04:13', '1', '2018-01-08 09:04:58');
INSERT INTO `sys_dic` VALUES ('10', 'LEAF', '1', '叶子节点', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:03');
INSERT INTO `sys_dic` VALUES ('11', 'EDITABLE', '0', '只读', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:05');
INSERT INTO `sys_dic` VALUES ('12', 'EDITABLE', '1', '可编辑', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:07');
INSERT INTO `sys_dic` VALUES ('13', 'ENABLE', '0', '禁用', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:09');
INSERT INTO `sys_dic` VALUES ('14', 'ENABLE', '1', '启用', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:11');
INSERT INTO `sys_dic` VALUES ('15', 'AUTHORIZELEVEL', '1', '访问权限', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:13');
INSERT INTO `sys_dic` VALUES ('16', 'AUTHORIZELEVEL', '2', '管理权限', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:14');
INSERT INTO `sys_dic` VALUES ('17', 'MENUTYPE', '1', '系统菜单', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:16');
INSERT INTO `sys_dic` VALUES ('18', 'MENUTYPE', '2', '业务菜单', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:17');
INSERT INTO `sys_dic` VALUES ('19', 'USERTYPE', '1', '经办员', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:19');
INSERT INTO `sys_dic` VALUES ('20', 'USERTYPE', '2', '管理员', null, null, '2', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:20');
INSERT INTO `sys_dic` VALUES ('21', 'USERTYPE', '3', '系统内置用户', null, null, '3', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:22');
INSERT INTO `sys_dic` VALUES ('22', 'EXPAND', '0', '收缩', null, null, '1', '0', '1', null, '1', '2018-01-08 09:04:53', '1', '2018-01-08 09:05:24');
INSERT INTO `sys_dic` VALUES ('23', 'EXPAND', '1', '展开', null, null, '2', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:28');
INSERT INTO `sys_dic` VALUES ('24', 'CRUD', 'add', '新增', null, null, '1', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:29');
INSERT INTO `sys_dic` VALUES ('25', 'CRUD', 'read', '查询', null, null, '2', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:31');
INSERT INTO `sys_dic` VALUES ('26', 'CRUD', 'update', '修改', null, null, '3', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:32');
INSERT INTO `sys_dic` VALUES ('27', 'CRUD', 'delete', '删除', null, null, '4', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:34');
INSERT INTO `sys_dic` VALUES ('28', 'CRUD', 'open', '打开', null, null, '5', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:35');
INSERT INTO `sys_dic` VALUES ('29', 'CRUD', 'close', '关闭', null, null, '6', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:38');
INSERT INTO `sys_dic` VALUES ('30', 'CRUD', 'run', '执行', null, null, '7', '0', '1', null, '1', '2018-01-08 09:05:20', '1', '2018-01-08 09:05:39');
SET FOREIGN_KEY_CHECKS=1;
