DROP table IF EXISTS empleados;

create table empleados(
    id int auto_increment,
    nombre varchar(250),
    apellido varchar(250),
    trabajo ENUM('Programador', 'Diseñador', 'Administracion'),
    salario double default null
);

INSERT INTO empleados (nombre, apellido, trabajo, salario) VALUES ('Juan', 'Pérez', 'Programador',2000.00);
INSERT INTO empleados (nombre, apellido, trabajo, salario) VALUES ('Ana', 'Gómez', 'Diseñador',1500);
INSERT INTO empleados (nombre, apellido, trabajo, salario) VALUES ('María', 'Rodríguez', 'Administracion',1700);
INSERT INTO empleados (nombre, apellido, trabajo, salario) VALUES ('Carlos', 'López', 'Programador',2000.00);
INSERT INTO empleados (nombre, apellido, trabajo, salario) VALUES ('Laura', 'Fernández', 'Diseñador',1500);
