CREATE DATABASE  IF NOT EXISTS `qlbanhang` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `qlbanhang`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: qlbanhang
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `danhmuc`
--

DROP TABLE IF EXISTS `danhmuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `danhmuc` (
  `id` varchar(10) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `xoa` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `danhmuc`
--

LOCK TABLES `danhmuc` WRITE;
/*!40000 ALTER TABLE `danhmuc` DISABLE KEYS */;
INSERT INTO `danhmuc` VALUES ('m01','Dien tu',0),('m02','Gia dung',0),('m03','Giao duc',0),('m04','Noi that',0),('m05','Thuc pham',0);
/*!40000 ALTER TABLE `danhmuc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidung`
--

DROP TABLE IF EXISTS `nguoidung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `nguoidung` (
  `id` varchar(10) NOT NULL,
  `tendangnhap` varchar(255) NOT NULL,
  `matkhau` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidung`
--

LOCK TABLES `nguoidung` WRITE;
/*!40000 ALTER TABLE `nguoidung` DISABLE KEYS */;
INSERT INTO `nguoidung` VALUES ('n01','admin','666'),('n02','qwerty','123456'),('n03','abcxyz','123789'),('n04','ManUtd','ManchesterIsBlue');
/*!40000 ALTER TABLE `nguoidung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `sanpham` (
  `id` varchar(10) NOT NULL,
  `danhmuc_id` varchar(10) DEFAULT NULL,
  `ten` varchar(255) NOT NULL,
  `dongia` float NOT NULL,
  `soluong` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `danhmuc_id` (`danhmuc_id`),
  CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`danhmuc_id`) REFERENCES `danhmuc` (`id`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES ('s01','m01','RTX 3060',6000000,50),('s02','m01','Logitech G502',900000,100),('s03','m01','Akko keyboard',2000000,50),('s04','m01','MSI Katana',30000000,30),('s05','m01','CPU intel i7 13700K',7000000,40);
INSERT INTO `sanpham` VALUES ('s06','m02','Tu lanh panasonic inverter',9900000,20),('s07','m02','Loc nuoc Sunhouse',5790000,50),('s08','m02','Noi com Sunhouse',700000,50),('s09','m02','May hut bui Gaabor',400000,100),('s10','m02','Robot hui bui Xiaomi',9000000,200);
INSERT INTO `sanpham` VALUES ('s11','m03','But chi',10000,300),('s12','m03','Tay',7000,250),('s13','m03','Tu dien',200000,155),('s14','m03','Mo hinh trai dat',250000,50),('s15','m03','Balo',800000,40);
INSERT INTO `sanpham` VALUES ('s16','m04','Sofa Italia ZT280',20000000,43),('s17','m04','Ban an Tera 2366',36000000,100),('s18','m04','Ke bep Acrylic',7000000,60),('s19','m04','San go Carnival ',16000000,30),('s20','m20','May lanh Inverter',8000000,40);
INSERT INTO `sanpham` VALUES ('s21','m05','Ca hoi vua',2000000,50),('s22','m05','Bo kobe',2200000,20),('s23','m05','Bao ngu',600000,100),('s24','m05','Nam truffle',8000000,72),('s25','m25','Ga chicken plus',200000,50);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-25 23:42:54
