USE generation;

-- 1.- Ejecute la siguiente consulta SQL para completar su primer JOIN para ver más información sobre los estudiantes:
SELECT Students.*, Countries.name country 
FROM Students 
INNER JOIN Countries 
ON Students.nationality = Countries.idCountries;

-- 2.- Modifique la sentencia SQL anterior para que una la tabla Students con la tabla IDTypes para conocer el tipo de identificación de cada estudiante.
SELECT Students.*, idtypes.* 
FROM Students 
INNER JOIN idtypes 
ON Students.IdType_id = idtypes.id_idTypes;

/* 3.-  Escriba una instrucción SQL adicional para UNIRSE
 a la tabla Estudiantes con la tabla CourseHasStudent para obtener el código de los cursos en los que está inscrito cada estudiante.*/
SELECT Students.*, idtypes.*, courses_has_students.course_code 
FROM Students 
INNER JOIN idtypes ON Students.IdType_id = idtypes.id_idTypes
INNER JOIN courses_has_students ON courses_has_students.students_id_student = students.idStudent;

/* 4.- Escriba una consulta SQL para unir la tabla CourseHasStudent con la tabla Courses 
para obtener el nombre de la información del curso con la ID de estudiante de los estudiantes inscritos en el curso.*/
SELECT courses_has_students.students_id_student, courses.code, courses.name, courses.module_code 
FROM courses_has_students 
INNER JOIN courses 
ON courses_has_students.course_code = courses.code;

-- 5.- Ahora que tiene las dos consultas, use INNER JOIN para combinar los resultados de las consultas
SELECT Students.*, idtypes.*, courses_has_students.course_code,courses_has_students.students_id_student, courses.code, courses.name, courses.module_code 
FROM Students 
INNER JOIN idtypes ON Students.IdType_id = idtypes.id_idTypes
INNER JOIN courses_has_students ON courses_has_students.students_id_student = students.idStudent
INNER JOIN courses ON courses_has_students.course_code = courses.code;

-- ------------------------------------------ Parte 2 --------------------------------------

-- 1.- Escriba una consulta SQL que le permita encontrar a todos los estudiantes en un país determinado.
SELECT * FROM students WHERE nationality = 23 ORDER BY nationality DESC;

-- 2.- Escriba una consulta SQL que le permita encontrar todos los países cuyo nombre comience con 'Ca'.
SELECT countries.Name FROM countries WHERE Name LIKE 'Ca%';

-- 3.- Cuente todos los alumnos que están matriculados en el curso 'JAVA-1'.
SELECT COUNT(DISTINCT students_id_student) FROM courses_has_students WHERE course_code = 'JAVA-1';
