-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: ramaka
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(255) NOT NULL,
  `p_apellido` varchar(50) NOT NULL,
  `s_apellido` varchar(45) NOT NULL,
  `telefono` double NOT NULL,
  `correo` varchar(45) NOT NULL,
  `calle` varchar(255) NOT NULL,
  `referencias` varchar(255) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `CP` int NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Jona','Beltran','Leiva',5520304321,'ejemplo_2@gmail.com','Cristo de la repolla','A lado de una iglesia','EDOMEX','Sinaloa',8782),(2,'Joaquin','Rodriguez','Cruz',55202324657,'ejemplo_3@gmail.com','Siempreviva','Un men tirado en frente','EDOMEX','morido',7672),(3,'Marco','Zacarias','Flores del campo',5528344061,'ejemplo_4@gmail.com','Añejo de bacardios','En frente de un bar','CDMX','ebrio',9836),(4,'El pepe','Etesech','A secas',5587236512,'ejemplo_5@gmail.com','Sal si puedes con esquina aqui siempreviva','Deportivo azul','CDMX','En peligro',9837),(5,'Jona','Beltran','Leiva',5520304321,'ejemplo_2@gmail.com','Cristo de la repolla','A lado de una iglesia','EDOMEX','Sinaloa',8782),(6,'Joaquin','Rodriguez','Cruz',55202324657,'ejemplo_3@gmail.com','Siempreviva','Un men tirado en frente','EDOMEX','morido',7672),(7,'Marco','Zacarias','Flores del campo',5528344061,'ejemplo_4@gmail.com','Añejo de bacardios','En frente de un bar','CDMX','ebrio',9836),(8,'El pepe','Etesech','A secas',5587236512,'ejemplo_5@gmail.com','Sal si puedes con esquina aqui siempreviva','Deportivo azul','CDMX','En peligro',9837),(9,'Jona','Beltran','Leiva',5520304321,'ejemplo_2@gmail.com','Cristo de la repolla','A lado de una iglesia','EDOMEX','Sinaloa',8782),(10,'Joaquin','Rodriguez','Cruz',55202324657,'ejemplo_3@gmail.com','Siempreviva','Un men tirado en frente','EDOMEX','morido',7672),(11,'Marco','Zacarias','Flores del campo',5528344061,'ejemplo_4@gmail.com','Añejo de bacardios','En frente de un bar','CDMX','ebrio',9836),(12,'El pepe','Etesech','A secas',5587236512,'ejemplo_5@gmail.com','Sal si puedes con esquina aqui siempreviva','Deportivo azul','CDMX','En peligro',9837);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cotizacion`
--

DROP TABLE IF EXISTS `cotizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cotizacion` (
  `id_cotizacion` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `descripcion_cotizacion` varchar(255) NOT NULL,
  `cliente_id_cliente` int NOT NULL,
  PRIMARY KEY (`id_cotizacion`,`cliente_id_cliente`),
  KEY `fk_cotizacion_cliente1_idx` (`cliente_id_cliente`),
  CONSTRAINT `fk_cotizacion_cliente1` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cotizacion`
--

LOCK TABLES `cotizacion` WRITE;
/*!40000 ALTER TABLE `cotizacion` DISABLE KEYS */;
INSERT INTO `cotizacion` VALUES (6,'2022-08-09','Mesa de centro',1),(7,'2022-12-12','Closet blanco acabado fino',2),(8,'2022-01-05','Lavabo de mano',3),(9,'2022-10-07','Comedor caoba',4),(10,'2022-04-04','Casita para perro',5),(11,'2022-08-09','Mesa de centro',1),(12,'2022-12-12','Closet blanco acabado fino',2),(13,'2022-01-05','Lavabo de mano',3),(14,'2022-10-07','Comedor caoba',4),(15,'2022-04-04','Casita para perro',5);
/*!40000 ALTER TABLE `cotizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `id_pedidos` int NOT NULL AUTO_INCREMENT,
  `estatus` varchar(45) NOT NULL,
  `numero_rastreo` varchar(50) NOT NULL,
  `fecha_pedido` date NOT NULL,
  `notas` varchar(255) NOT NULL,
  `cliente_id_cliente` int NOT NULL,
  PRIMARY KEY (`id_pedidos`,`cliente_id_cliente`),
  KEY `fk_pedidos_cliente1_idx` (`cliente_id_cliente`),
  CONSTRAINT `fk_pedidos_cliente1` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,'entregado','9056894132785195','2020-02-11','Dejar en la puerta',1),(2,'en proceso','AH34Z897646186HGH585464','2022-09-05','Entregar en vigilancia',2),(3,'aceptado','4DFG545524CRS88868J8797','2022-09-07','Llamar al llegar al domicilio',3),(4,'cancelado','9125649568644489','2021-05-22','Casa blanca en contraesquina a tienda de abarrotes',4),(5,'ruta de envio','815264793','2022-08-28','Entregar a Juan López',5),(6,'entregado','9056894132785195','2020-02-11','Dejar en la puerta',1),(7,'en proceso','AH34Z897646186HGH585464','2022-09-05','Entregar en vigilancia',2),(8,'aceptado','4DFG545524CRS88868J8797','2022-09-07','Llamar al llegar al domicilio',3),(9,'cancelado','9125649568644489','2021-05-22','Casa blanca en contraesquina a tienda de abarrotes',4),(10,'ruta de envio','815264793','2022-08-28','Entregar a Juan López',5);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(45) NOT NULL,
  `descripcion_producto` varchar(255) NOT NULL,
  `precio_producto` float NOT NULL,
  `cantidad_producto` int NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Maceta para Orquídea','Maceta de maceta de pino con acabado especial contra agua con medidas de 25cm x25cm x15cm',350,1),(2,'Silla ergonomica','Silla especial para oficinas o gamers para evitar problemas de columna',8000,1),(3,'Servilletero de vaquita','Servilletero en caoba tallado con forma de vaca',2000,3),(4,'Espejo de gatito','Espejo redondo con forma de gatito, con medidas de 20cm x 20cm',600,2),(5,'Pecera con madera','Pecera de 250 litros con base en madera de cerezo con cajones, contactos e iluminación',5000,1),(6,'Maceta para Orquídea','Maceta de maceta de pino con acabado especial contra agua con medidas de 25cm x25cm x15cm',350,1),(7,'Silla ergonomica','Silla especial para oficinas o gamers para evitar problemas de columna',8000,1),(8,'Servilletero de vaquita','Servilletero en caoba tallado con forma de vaca',2000,3),(9,'Espejo de gatito','Espejo redondo con forma de gatito, con medidas de 20cm x 20cm',600,2),(10,'Pecera con madera','Pecera de 250 litros con base en madera de cerezo con cajones, contactos e iluminación',5000,1);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_has_pedidos`
--

DROP TABLE IF EXISTS `producto_has_pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto_has_pedidos` (
  `producto_id_producto` int NOT NULL,
  `pedidos_id_pedidos` int NOT NULL,
  `pedidos_cliente_id_cliente` int NOT NULL,
  PRIMARY KEY (`producto_id_producto`,`pedidos_id_pedidos`,`pedidos_cliente_id_cliente`),
  KEY `fk_producto_has_pedidos_pedidos1_idx` (`pedidos_id_pedidos`,`pedidos_cliente_id_cliente`),
  KEY `fk_producto_has_pedidos_producto1_idx` (`producto_id_producto`),
  CONSTRAINT `fk_producto_has_pedidos_pedidos1` FOREIGN KEY (`pedidos_id_pedidos`, `pedidos_cliente_id_cliente`) REFERENCES `pedidos` (`id_pedidos`, `cliente_id_cliente`),
  CONSTRAINT `fk_producto_has_pedidos_producto1` FOREIGN KEY (`producto_id_producto`) REFERENCES `producto` (`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_has_pedidos`
--

LOCK TABLES `producto_has_pedidos` WRITE;
/*!40000 ALTER TABLE `producto_has_pedidos` DISABLE KEYS */;
INSERT INTO `producto_has_pedidos` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5);
/*!40000 ALTER TABLE `producto_has_pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `cliente_id_cliente` int NOT NULL,
  PRIMARY KEY (`id_usuario`,`cliente_id_cliente`),
  KEY `fk_registro_cliente_idx` (`cliente_id_cliente`),
  CONSTRAINT `fk_registro_cliente` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1,'raquel123','Raquel456',1),(2,'sahian123','Sahian456',2),(3,'marina123','Marina456',3),(4,'maria123','Maria456',4),(5,'magali123','Magali456',5);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-11 18:07:40
