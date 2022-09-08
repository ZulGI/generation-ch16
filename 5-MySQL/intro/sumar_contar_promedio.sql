USE sakila;

SELECT * FROM payment;

-- SUM(), AVG(), COUNT()

SELECT customer_id, amount FROM payment;

-- COUNT() cuenta las filas de una tabla
SELECT  COUNT(*) AS 'Cantidad de filas' FROM payment;

SELECT COUNT(*) AS 'Cantidad de paises' FROM world.country;

-- Cantidad de ventas que tuvo el trabajador 2
SELECT COUNT(*) FROM payment WHERE staff_id = 1;

-- Cantidad de clientes distintos
SELECT COUNT(DISTINCT customer_id) FROM payment;

/* 
SUM()
*/
SELECT SUM(payment_date) AS 'Total de rentas'FROM payment;

SELECT SUM(amount) AS 'Total de rentas' FROM payment WHERE staff_id = 2;

-- ¿Cuál cliente realizó más rentas? 148 - 46 / 318 - 12
SELECT customer_id, COUNT(*) FROM payment GROUP BY customer_id ORDER BY COUNT(*) ASC;

-- GROUP BY - Agrupa, pero omite los valores repetidos
-- ORDER BY - Ordena según la columna o función que le indiquemos ASC / DESC
SELECT * FROM payment ORDER BY staff_id;
SELECT * FROM payment GROUP BY staff_id;

-- ¿Cual cliente gastó más? 526 - 212.55 / 248 - 50.85 
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id ORDER BY total ASC;

-- AVG() - regra el promedio
SELECT AVG(amount) AS Promedio FROM payment;

 -- ¿Cuál cliente gató más en promedio? 187 - 5.7 / 252 - 2.9
SELECT customer_id, AVG(amount) AS Promedio FROM payment GROUP BY customer_id ORDER BY AVG(amount) DESC;
