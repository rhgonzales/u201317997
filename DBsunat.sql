delimiter $$

CREATE DATABASE `sunat` /*!40100 DEFAULT CHARACTER SET latin1 */$$


delimiter $$

CREATE TABLE `pagos` (
  `idpagos` int(11) NOT NULL AUTO_INCREMENT,
  `ruc` varchar(20) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `periodoTributario` varchar(10) DEFAULT NULL,
  `codigoTributario` int(11) DEFAULT NULL,
  `resolucion` varchar(15) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  PRIMARY KEY (`idpagos`),
  KEY `ruc` (`ruc`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1$$


