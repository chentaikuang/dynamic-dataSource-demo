CREATE DATABASE xiaochen;

CREATE TABLE `t_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `age` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `t_user_info` (`id`, `name`, `age`) VALUES (1, 'xiaochen', 18);
INSERT INTO `t_user_info` (`id`, `name`, `age`) VALUES (2, '小臣local', 20);
