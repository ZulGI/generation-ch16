CREATE DATABASE generation;

USE generation;

CREATE TABLE cohorte_16 (
alumno_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre CHAR(50) NOT NULL,
apellido CHAR(50) NOT NULL,
companeros INT NOT NULL, 
direccion VARCHAR(150) NOT NULL,
proyecto VARCHAR(150) NOT NULL);

INSERT INTO cohorte_16 (nombre, apellido, companeros, direccion, proyecto)
VALUES('Zul', 'García Islas', '6', 'Tlalpan, CDMX', 'Ramaka'),
('César', 'Mata Rodriguez', '6', 'Linda Vista', 'Ramaka'),
('Raquel', 'Cruz Morales', '6', 'Tlalpan, CDMX', 'Ramaka'),
('Jonathan', 'Ramires Alonso', '6', 'Ejercitos Constitucionalista (Por ahí matan)', 'Ramaka'),
('Diana', 'Minor Espinosa', '6', 'Magdalena Contreras, CDMX', 'Ramaka');

SELECT * FROM generation.cohorte_16;

DELETE FROM cohorte_16
WHERE alumno_id =3;

ALTER TABLE cohorte_16 parametros a modificar;