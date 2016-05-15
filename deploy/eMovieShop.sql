-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema emshop
--

CREATE DATABASE IF NOT EXISTS emshop;
USE emshop;

--
-- Definition of table `bills`
--

DROP TABLE IF EXISTS `bills`;
CREATE TABLE `bills` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `description` varchar(45) NOT NULL,
  `service_tax` double NOT NULL,
  `bill_date` datetime NOT NULL,
  `net_payable` double NOT NULL,
  `amt_recvd` double NOT NULL,
  `advance_amt` double NOT NULL,
  `balance_amt` double NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bills`
--

/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;


--
-- Definition of table `due_days_mst`
--

DROP TABLE IF EXISTS `due_days_mst`;
CREATE TABLE `due_days_mst` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `item_id` int(10) unsigned NOT NULL,
  `due_in_days` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_due_days_mst_1` (`item_id`),
  CONSTRAINT `FK_due_days_mst_1` FOREIGN KEY (`item_id`) REFERENCES `movie_mst` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='This is the due date master ';

--
-- Dumping data for table `due_days_mst`
--

/*!40000 ALTER TABLE `due_days_mst` DISABLE KEYS */;
INSERT INTO `due_days_mst` (`id`,`item_id`,`due_in_days`) VALUES 
 (1,1,10),
 (2,2,10),
 (3,3,5),
 (4,4,7);
/*!40000 ALTER TABLE `due_days_mst` ENABLE KEYS */;


--
-- Definition of table `member_mst`
--

DROP TABLE IF EXISTS `member_mst`;
CREATE TABLE `member_mst` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) default NULL,
  `contact_no` varchar(45) default NULL,
  `email_id` varchar(45) default NULL,
  `username` varchar(10) default NULL,
  `hashed_pwd` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `member_mst`
--

/*!40000 ALTER TABLE `member_mst` DISABLE KEYS */;
INSERT INTO `member_mst` (`id`,`name`,`address`,`contact_no`,`email_id`,`username`,`hashed_pwd`) VALUES 
 (1,'test test','testAddress','03324358879',NULL,'test','test');
/*!40000 ALTER TABLE `member_mst` ENABLE KEYS */;


--
-- Definition of table `movie_mst`
--

DROP TABLE IF EXISTS `movie_mst`;
CREATE TABLE `movie_mst` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `rel_date` datetime NOT NULL,
  `cast` varchar(45) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `rating` int(10) unsigned NOT NULL,
  `rent_amt` double NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `movie_mst`
--

/*!40000 ALTER TABLE `movie_mst` DISABLE KEYS */;
INSERT INTO `movie_mst` (`id`,`name`,`rel_date`,`cast`,`description`,`rating`,`rent_amt`) VALUES 
 (1,'Indiana Jones','2001-10-10 00:00:00','Ahsgdhjsgf','mast action',3,20),
 (2,'Phonebooth','2000-09-08 00:00:00','asjdbfjkasdnfj , asjdhfjsdk','This is a great movie',5,20),
 (3,'Valkyrie','2009-01-01 00:00:00','Tom Cruise','Movie about plot to murder Hitler. Set in WWII',5,45),
 (4,'Ghost and The Darkness','2005-06-08 00:00:00','Bradd Pitt','Movie about two ferocious lions',5,30);
/*!40000 ALTER TABLE `movie_mst` ENABLE KEYS */;


--
-- Definition of table `rent_txn`
--

DROP TABLE IF EXISTS `rent_txn`;
CREATE TABLE `rent_txn` (
  `id` int(10) unsigned NOT NULL,
  `member_id` int(10) unsigned NOT NULL,
  `start_date` datetime NOT NULL,
  `due_date` datetime NOT NULL,
  `item_id` int(10) unsigned NOT NULL,
  `return_date` datetime NOT NULL,
  `rent_amt` double NOT NULL,
  `bill_id` int(10) unsigned NOT NULL,
  `item_name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rent_txn`
--

/*!40000 ALTER TABLE `rent_txn` DISABLE KEYS */;
/*!40000 ALTER TABLE `rent_txn` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
