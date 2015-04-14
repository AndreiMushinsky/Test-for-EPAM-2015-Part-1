-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	5.6.23-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Отдел маркетинга и рекламы'),(2,'Отдел сбыта'),(3,'Отдел разработок'),(4,'Производственный отдел'),(5,'Отдел закупок'),(6,'Финансовый отдел'),(7,'Административный отдел'),(8,'Отдел кадров');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lname` varchar(30) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `pname` varchar(30) NOT NULL,
  `salary` int(11) NOT NULL,
  `idx` int(11) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dep_id` (`dep_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Чижов','Леонтий','Николаевич',510,0,1),(2,'Варум','Марина','Юрьевна',450,1,1),(3,'Кудельман','Лариса','Александровна',390,2,1),(4,'Хлебникова','Марина','Арнольдовна',460,3,1),(5,'Турецкий','Михаил','Борисович',495,4,1),(7,'Кутиков','Александр','Викторович',480,5,1),(8,'Зворыкин','Владимир','Козьмич',700,0,3),(9,'Павлоа','Иван','Петрович',950,1,3),(10,'Зелинский','Николай','Дмитриевич',800,2,3),(11,'Лебедев','Петр','Николаевич',750,3,3),(12,'Курчатов','Игорь','Васильевич',560,0,4),(13,'Оганесян','Юрий','Цолакович',700,1,4),(14,'Весалаго','Виктор','Георгьевич',760,2,4),(15,'Фридман','Александр','Александрович',780,4,3),(16,'Орлов','Иван','Иванович',560,0,6),(17,'Лаптьева','Ирина','Владиленовна',480,1,6),(18,'Прытков','Игорь','Семенович',960,2,6),(19,'Маркова','Инна','Федоровна',480,0,5),(20,'Сычев','Семен','Семенович',600,3,4),(21,'Мышкина','Ольга','Борисовна',550,0,2),(22,'Ежов','Олег','Григорьевич',500,4,4),(23,'Вертинская','Ирина','Станиславовна',500,1,2),(24,'Фролов','Геннадий','Михайлович',560,1,5),(25,'Котловская','Ольга','Максимовна',620,2,2),(26,'Пранич','Степан','Иннокентьевич',450,5,4),(27,'Хромов','Евгений','Николаевич',850,3,6),(28,'Михалкова','Ирина','Глебовна',430,0,7),(29,'Корытко','Татьяна','Власовна',460,4,6),(30,'Коржиков','Леонид','Степанович',620,2,5),(31,'Степанова','Дарья','Сергеевна',530,3,2),(32,'Кузьменок','Дарья','Максимовна',620,3,5),(33,'Хлебников','Игорь','Дмитриевич',550,4,5),(34,'Короткевич','Диана','Алексеевна',860,0,8),(35,'Жук','Инна','Васильевна',450,1,8),(36,'Кот','Галина','Андреевна',420,1,7),(37,'Мизавцова','Жанна','Павловна',510,2,7);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-11 10:01:38
