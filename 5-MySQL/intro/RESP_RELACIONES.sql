CREATE DATABASE ejercicio_relaciones; 
USE ejercicio_relaciones;

CREATE TABLE cohorte(
cohorte12_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
alumnos_id INT NOT NULL,
instructor_id INT NOT NULL,
numero_alumnos INT NOT NULL,
horario VARCHAR(255) NOT NULL,
tipo_sesiones VARCHAR(255) NOT NULL,
ciudad VARCHAR (255) NOT NULL);

SELECT * FROM cohorte;

INSERT INTO cohorte(numero_alumnos, horario, tipo_sesiones, ciudad)
VALUES (55, '9:30-5:30', 'Habilidades blandas', 'CDMX'),
(50, '9:30-5:30', 'Habilidades técinicas', 'CDMX');

CREATE TABLE alumno(
alumno_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
CURP VARCHAR(255) NOT NULL,
RFC VARCHAR(255),
nivel_ingles VARCHAR (255) NOT NULL,
amonestaciones INT NOT NULL);

INSERT INTO alumno(nombre,edad,CURP,RFC,nivel_ingles,amonestaciones)
VALUES('iker',20,'MANI011021HDFRGKA1','MANI011021K31','C2',0),
('Brandon',25,'BRANI011021HDFRGKA1','BRAN011021K31','C1',2),
('ZUL',20,'ZULI011021HDFRGKA1','ZUL011021K31','C1',0),
('Maciel',24,'BRANI011021HDFRGKA1','BRAN011021K31','C1',1);

SELECT * FROM alumno;

ALTER TABLE cohorte
 ADD CONSTRAINT fk_alumno_cohorte
 FOREIGN KEY (alumnos_id)
 REFERENCES alumno (alumnos_id);
 
 ALTER TABLE cohorte
 ADD CONSTRAINT fk_instructor_cohorte
 FOREIGN KEY (instructor_id)
 REFERENCES instructor (instructor_id);

CREATE TABLE instructor(
instructor_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
cumpleanios DATE NOT NULL,
RFC VARCHAR(255) NOT NULL,
supervisor VARCHAR(255) NOT NULL,
sesiones VARCHAR(255) NOT NULL
);

INSERT INTO instructor(nombre, edad, cumpleanios, RFC,supervisor,sesiones)
VALUES ('Raul', 35, '2022-09-05', 'MAISJDISJFKAJKS25','MARINA','COHORTE 16'),
('victor', 38, '2022-10-05', 'VICJDISJFKAJKS25','MARINA','COHORTE 16');

SELECT * FROM instructor;

CREATE TABLE direccion (
direccion_id INT NOT NULL PRIMARY KEY,
alumno_id INT NOT NULL,
calle VARCHAR(255) NOT NULL,
pais VARCHAR(255) NOT NULL,
cp INT NOT NULL
);

INSERT INTO direccion(calle, pais, cp)
VALUES ('Lima', 'México', '14950'),
('Hidalgo', 'México', '26790');

SELECT * FROM direccion;

ALTER TABLE direccion
 ADD CONSTRAINT fk_alumno_direccion
 FOREIGN KEY (alumno_id)
 REFERENCES alumno(alumno_id);


CREATE TABLE equipo(
equipo_id INT NOT NULL PRIMARY KEY,
alumno_id INT NOT NULL,
nombre VARCHAR(255) NOT NULL,
cantidad_integrantes INT NOT NULL,
logo VARCHAR(255) NOT NULL
);

INSERT INTO equipo(nombre, cantidad_integrantes, logo)
VALUES ('VaquitasGalácticas', '7', 'RAMAKA'),
('TecnoGurus', '7', 'Botánicas');

SELECT * FROM equipo;

ALTER TABLE equipo
ADD CONSTRAINT fk_equipo_alumno
FOREIGN KEY (alumno_id)
REFERENCES alumno(alumno_id);


