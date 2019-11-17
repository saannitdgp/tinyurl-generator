#script for creating table

drop table if exists `word_info`;
CREATE TABLE `word_info` (
  `word` varchar(100) NOT NULL,
  `synonyms` TEXT NOT NULL,
  `translate_in_hindi` varchar(255) DEFAULT NULL,
  `description` TEXT NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (`word`),
   KEY `idx_update` (`updated_at`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 ;



