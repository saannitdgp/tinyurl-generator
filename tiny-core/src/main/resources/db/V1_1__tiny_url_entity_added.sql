drop table `tiny_url_info`;


CREATE TABLE `tiny_url_info` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `short_url` varchar(50) DEFAULT NULL,
  `long_url` varchar(50) DEFAULT NULL,
   `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`),
   KEY `idx_update` (`updated_at`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 ;


CREATE TABLE `student` (
    `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL,
    `email` varchar(50) DEFAULT NULL,
     `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
     `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY(`student_id`),
     KEY `idx_update` (`updated_at`)
) ENGINE = InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET = utf8;