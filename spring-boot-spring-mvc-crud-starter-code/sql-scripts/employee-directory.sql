CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
-- 
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (1,'virat','kohli','VK@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (2,'dhoni','ms','msd@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (3,'shubnam','gill','Sg@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (4,'Yuri','Petrov','yuri@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (5,'mithali','raj','mithali@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (6,'jhap','jha','pjha@example.com');
INSERT INTO `employee_directory.employee` (`id`,`first_name`,`last_name`,`email`) VALUES (7,'test','jha','jajhap@example.com');

