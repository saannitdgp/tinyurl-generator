drop table `tiny_url_info`;

drop table if exists `tiny_url_info`;
drop table if exists `student`;
drop table if exists `report_card`;



CREATE TABLE `tiny_url_info` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `short_url` varchar(50) DEFAULT NULL,
  `long_url` varchar(50) DEFAULT NULL,
   `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`),
   KEY `idx_update` (`updated_at`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 ;
    `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `percentage` decimal(4,2) NOT NULL,
    `department` varchar(50) DEFAULT NULL,
     `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
     `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY(`id`),
     KEY `idx_update` (`updated_at`)
) ENGINE = InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET = utf8;

CREATE TABLE `report_card` (
    `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `percentage` decimal(4,2) NOT NULL,
    `department` varchar(50) DEFAULT NULL,
     `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
     `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY(`id`),
     KEY `idx_update` (`updated_at`)
) ENGINE = InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET = utf8;



CREATE TABLE `student` (
    `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL,
    `email` varchar(50) DEFAULT NULL,
    `report_card_id` int(10) unsigned NOT NULL,
     `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
     `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY(`student_id`),
     CONSTRAINT `fk_report_card_id` FOREIGN KEY (`report_card_id`)  REFERENCES `report_card`(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET = utf8;




