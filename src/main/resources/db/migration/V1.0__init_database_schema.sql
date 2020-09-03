/*
Navicat MySQL Data Transfer

Source Server         : 10.10.167.31
Source Server Version : 50717
Source Host           : 10.10.167.31:3306
Source Database       : schedule_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-08-27 14:23:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for schedule_cron_t
-- ----------------------------
DROP TABLE IF EXISTS `schedule_cron_t`;
CREATE TABLE `schedule_cron_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `crontab` varchar(255) DEFAULT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schedule_cron_t
-- ----------------------------
INSERT INTO `schedule_cron_t` VALUES ('1', '0 0/1 * * * ?', '001');
INSERT INTO `schedule_cron_t` VALUES ('2', '0 0/2 * * * ?', '002');
