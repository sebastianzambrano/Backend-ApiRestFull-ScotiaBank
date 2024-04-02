INSERT INTO cliente (id,tipo_documento,numero_documento,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,direccion_residencia,telefono_movil) VALUES (1,"cedula",1075,"juan","sebastian","zambrano","pastrana","calle 59","322723");
INSERT INTO trabajador (id,tipo_documento,numero_documento,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,direccion_residencia,telefono_movil,nombre_usuario) VALUES (1,"cedula",107,"juan","sebastian","zambrano","pastrana","calle 59","322723","jszambrano");

INSERT INTO producto (id,tipo_producto,numero_producto,nombre_producto,sucursal_producto,saldo_producto,id_cliente) VALUES (1,"ahorro",12,"ahorro a la vista","neiva",12000,1);

INSERT INTO pqrs (id,tipo_pqrs,descripcion_problema,solucion_problema,id_trabajador,id_producto) VALUES (1,"consulta saldo y transaccion","problma","solucion",1,1);
