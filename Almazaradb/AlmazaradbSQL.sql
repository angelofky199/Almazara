CREATE DATABASE  IF NOT EXISTS `almazaradb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `almazaradb`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: almazaradb
-- ------------------------------------------------------
-- Server version	5.6.25-log

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
-- Table structure for table `cambio`
--

DROP TABLE IF EXISTS `cambio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cambio` (
  `idCambio` int(11) NOT NULL,
  `kgOliva` float NOT NULL,
  `paga` tinyint(1) NOT NULL DEFAULT '0',
  `retira` tinyint(1) NOT NULL DEFAULT '0',
  `rendimiento` float NOT NULL,
  `litrosCambio` float NOT NULL,
  `litrosRetirados` float NOT NULL,
  `porcentajeMaquila` float NOT NULL,
  `maquila` float NOT NULL,
  `precioMolturacion` float NOT NULL,
  `aceiteRetirado` float NOT NULL,
  `totalPagar` float NOT NULL,
  `maquilaReflejada` float NOT NULL,
  `kgOlivaReflejados` float NOT NULL,
  `poblacionOliva` varchar(30) DEFAULT NULL,
  `Observaciones` varchar(100) DEFAULT NULL,
  `Usuario_idUsuario` int(11) NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idCambio`),
  KEY `fk_Cambio_Usuario1_idx` (`Usuario_idUsuario`),
  KEY `fk_Cambio_Cliente1_idx` (`Cliente_idCliente`),
  CONSTRAINT `fk_Cambio_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cambio_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` varchar(9) DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `poblacion` varchar(25) DEFAULT NULL,
  `subvencionado` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `kgOliva` float NOT NULL,
  `precioKg` float NOT NULL,
  `totalCompra` float NOT NULL,
  `pagado` tinyint(1) NOT NULL DEFAULT '0',
  `declara` tinyint(1) NOT NULL DEFAULT '0',
  `factura` tinyint(1) NOT NULL DEFAULT '0',
  `maquilaReflejada` float NOT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `fk_Compra_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_Compra_Usuario1_idx` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Compra_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `molturacion`
--

DROP TABLE IF EXISTS `molturacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `molturacion` (
  `idMolturacion` int(11) NOT NULL,
  `kgOvila` float NOT NULL,
  `litrosAceiteProd` float NOT NULL,
  `kgOrujo` float NOT NULL,
  `ingresoMolturacion` float NOT NULL,
  `fecha` datetime NOT NULL,
  `Pagada` tinyint(1) NOT NULL DEFAULT '0',
  `declara` tinyint(1) NOT NULL DEFAULT '0',
  `kgReflejadosDeclaracion` float NOT NULL,
  `maquila` float NOT NULL,
  `Observaciones` varchar(100) DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idMolturacion`),
  KEY `fk_Molturacion_Cliente_idx` (`Cliente_idCliente`),
  KEY `fk_Molturacion_Usuario1_idx` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Molturacion_Cliente` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Molturacion_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cantidad` float NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `factura` tinyint(1) NOT NULL DEFAULT '0',
  `regalo` tinyint(1) NOT NULL DEFAULT '0',
  `otro` tinyint(1) NOT NULL DEFAULT '0',
  `totalVenta` float NOT NULL,
  `Observaciones` varchar(100) DEFAULT NULL,
  `litrosDeclarables` float NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_Venta_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_Venta_Usuario1_idx` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `venta_has_producto`
--

DROP TABLE IF EXISTS `venta_has_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta_has_producto` (
  `Venta_idVenta` int(11) NOT NULL,
  `Producto_idProducto` int(11) NOT NULL,
  `precio` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioTotal` float NOT NULL,
  PRIMARY KEY (`Venta_idVenta`,`Producto_idProducto`),
  KEY `fk_Venta_has_Producto_Producto1_idx` (`Producto_idProducto`),
  KEY `fk_Venta_has_Producto_Venta1_idx` (`Venta_idVenta`),
  CONSTRAINT `fk_Venta_has_Producto_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_has_Producto_Venta1` FOREIGN KEY (`Venta_idVenta`) REFERENCES `venta` (`idVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping routines for database 'almazaradb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-13 18:46:48
