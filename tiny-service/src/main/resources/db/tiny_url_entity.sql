drop database `tiny_url_generator`;
create database `tiny_url_generator`;

CREATE TABLE `tiny_url_info` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tiny_url` varchar(50) NOT NULL,
  `long_url` varchar(200) NOT NULL,
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP,
   `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `idx_tiny_url_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


CREATE TABLE `tiny_url_info` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `age` varchar(200) NOT NULL,
   PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;