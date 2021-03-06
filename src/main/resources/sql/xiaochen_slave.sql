/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : xiaochen_slave

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-10-15 10:49:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `age` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(255) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES ('1', 'xiaochen', '18', 'slave');
INSERT INTO `t_user_info` VALUES ('2', '小臣local', '20', 'slave');
INSERT INTO `t_user_info` VALUES ('3', 'dev', '1999', 'slave');
