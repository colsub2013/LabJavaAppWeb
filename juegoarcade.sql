-- MySQL dump 10.13  Distrib 5.6.14, for Win32 (x86)
--
-- Host: localhost    Database: nombredb
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `t_comboestado`
--

DROP TABLE IF EXISTS `t_comboestado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_comboestado` (
  `id_comboEstado` int(11) NOT NULL AUTO_INCREMENT,
  `descComboEstado` varchar(100) NOT NULL,
  PRIMARY KEY (`id_comboEstado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_comboestado`
--

LOCK TABLES `t_comboestado` WRITE;
/*!40000 ALTER TABLE `t_comboestado` DISABLE KEYS */;
INSERT INTO `t_comboestado` VALUES (1,'En venta'),(2,'Vendido'),(3,'Retirado');
/*!40000 ALTER TABLE `t_comboestado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_juegoarcade`
--

DROP TABLE IF EXISTS `t_juegoarcade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_juegoarcade` (
  `id_juegoArcade` int(11) NOT NULL AUTO_INCREMENT,
  `nombreArcade` varchar(100) NOT NULL,
  `companiaArcade` varchar(100) NOT NULL,
  `anioEdicion` int(11) NOT NULL,
  `id_comboEstado` int(11) NOT NULL,
  PRIMARY KEY (`id_juegoArcade`),
  KEY `id_comboEstado_fk` (`id_comboEstado`),
  CONSTRAINT `comboEstado_fk` FOREIGN KEY (`id_comboEstado`) REFERENCES `t_comboestado` (`id_comboEstado`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_juegoarcade`
--

LOCK TABLES `t_juegoarcade` WRITE;
/*!40000 ALTER TABLE `t_juegoarcade` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_juegoarcade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'nombredb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-11-30 23:47:47
