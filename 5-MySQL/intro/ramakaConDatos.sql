use ramaka;

-- DATOS PARA CLIENTE
SELECT * FROM cliente;
INSERT INTO cliente(nombre_cliente, p_apellido, s_apellido, telefono, correo, calle, referencias, ciudad, estado, CP)
VALUES ('Jona','Beltran', 'Leiva','5520304321', 'ejemplo_2@gmail.com', 'Cristo de la repolla', 'A lado de una iglesia', 'EDOMEX', 'Sinaloa', 08782),
('Joaquin','Rodriguez', 'Cruz','55202324657', 'ejemplo_3@gmail.com', 'Siempreviva', 'Un men tirado en frente', 'EDOMEX', 'morido', 07672),
('Marco','Zacarias', 'Flores del campo','5528344061', 'ejemplo_4@gmail.com', 'Añejo de bacardios', 'En frente de un bar', 'CDMX', 'ebrio', 09836),
('El pepe','Etesech', 'A secas','5587236512', 'ejemplo_5@gmail.com', 'Sal si puedes con esquina aqui siempreviva', 'Deportivo azul', 'CDMX', 'En peligro', 09837);

-- DATOS PARA cotizacion
SELECT * FROM cotizacion;

INSERT INTO cotizacion(fecha, descripcion_cotizacion, cliente_id_cliente)
VALUES ('2022-08-09', 'Mesa de centro',1), 
('2022-12-12', 'Closet blanco acabado fino',2), 
('2022-01-05', 'Lavabo de mano',3), 
('2022-10-07', 'Comedor caoba',4), 
('2022-04-04', 'Casita para perro',5);

-- DATOS PARA pedidos 
SELECT * FROM pedidos;
INSERT INTO pedidos(estatus, numero_rastreo, fecha_pedido, notas, cliente_id_cliente )
VALUES ('entregado', '9056894132785195', '2020-02-11', 'Dejar en la puerta', 1),
('en proceso', 'AH34Z897646186HGH585464', '2022-09-05', 'Entregar en vigilancia', 2),
('aceptado', '4DFG545524CRS88868J8797', '2022-09-07', 'Llamar al llegar al domicilio', 3),
('cancelado', '9125649568644489', '2021-05-22', 'Casa blanca en contraesquina a tienda de abarrotes', 4),
('ruta de envio', '815264793', '2022-08-28', 'Entregar a Juan López', 5);

-- DATOS PARA producto


INSERT INTO producto(nombre_producto, descripcion_producto, precio_producto, cantidad_producto) 
VALUES ('Maceta para Orquídea', 'Maceta de maceta de pino con acabado especial contra agua con medidas de 25cm x25cm x15cm', 350, 1), 
('Silla ergonomica', 'Silla especial para oficinas o gamers para evitar problemas de columna', 8000, 1),
('Servilletero de vaquita', 'Servilletero en caoba tallado con forma de vaca', 2000, 3),
('Espejo de gatito', 'Espejo redondo con forma de gatito, con medidas de 20cm x 20cm', 600, 2),
('Pecera con madera', 'Pecera de 250 litros con base en madera de cerezo con cajones, contactos e iluminación', 5000, 1);

SELECT * FROM producto_has_pedidos;
INSERT INTO producto_has_pedidos( pedidos_id_pedidos, pedidos_cliente_id_cliente)
VALUES( 1, 1),
( 2, 2),
( 3, 3),
( 4, 4),
( 5, 5);

-- DATOS PARA registro
SELECT * FROM registro;
INSERT INTO registro (usuario, contrasenia, cliente_id_cliente) 
VALUES ('raquel123', 'Raquel456', 1),
        ('sahian123', 'Sahian456', 2),
        ('marina123', 'Marina456', 3),
        ('maria123', 'Maria456', 4),
        ('magali123', 'Magali456', 5);
