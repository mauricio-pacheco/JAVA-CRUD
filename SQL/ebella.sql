/*
Navicat MySQL Data Transfer

Source Server         : MYSQL LOCAL
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : ebella

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2022-12-21 15:15:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ebella_administradores
-- ----------------------------
DROP TABLE IF EXISTS `ebella_administradores`;
CREATE TABLE `ebella_administradores` (
  `usuario` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ebella_administradores
-- ----------------------------
INSERT INTO `ebella_administradores` VALUES ('mauricio', '123');

-- ----------------------------
-- Table structure for ebella_clientes
-- ----------------------------
DROP TABLE IF EXISTS `ebella_clientes`;
CREATE TABLE `ebella_clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `datanasc` date DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ebella_clientes
-- ----------------------------
