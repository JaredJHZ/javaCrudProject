DROP DATABASE IF EXISTS buildingprojects;

CREATE DATABASE buildingprojects;


CREATE TABLE departamentos(
    idDepto char(8) PRIMARY KEY,
    nombreDeDepartamento varchar NOT NULL
);

CREATE TABLE trabajadores(
idEmpleado char(8) PRIMARY KEY,
idDepto char(8) REFERENCES departamentos(idDepto) ON UPDATE CASCADE ON DELETE CASCADE,
nombre varchar NOT NULL,
apellidoPaterno varchar NOT NULL,
apellidoMaterno varchar NOT NULL,
fechaDeNacimiento date NOT NULL,
fechaDeContratacion date NOT NULL,
salario NUMERIC NOT NULL);


CREATE TABLE jefe_de_departamentos(
    idEmpleado char(8) REFERENCES trabajadores(idEmpleado),
    idDepto char(8) REFERENCES departamentos(idDepto) ON UPDATE CASCADE ON DELETE CASCADE,
    idJefe char(8) PRIMARY KEY
);

CREATE TABLE proyectos(
    idProyecto char(8) PRIMARY KEY,
    idJefe char(8) REFERENCES jefe_de_departamentos(idJefe) ON UPDATE CASCADE ON DELETE CASCADE,
    nombreProyecto varchar NOT NULL,
    presupuesto NUMERIC NOT NULL,
    fechaDeInicio DATE NOT NULL,
    duracionDeSemanasEsperadas NUMERIC NOT NULL
);

CREATE TABLE asignaciones(
    idProyecto char(8) REFERENCES proyectos(idProyecto) ON UPDATE CASCADE ON DELETE CASCADE,
    idEmpleado char(8) REFERENCES trabajadores(idEmpleado) ON UPDATE CASCADE ON DELETE CASCADE,
    horasAsignadas NUMERIC NOT NULL,
    calificacion NUMERIC NOT NULL
);

SELECT departamentos.nombreDeDepartamento as NombreDepartamento, 
CONCAT(trabajadores.nombre , ' ', trabajadores.apellidoPaterno) 
as NombreCompleto, trabajadores.salario as salario
FROM trabajadores INNER JOIN departamentos ON trabajadores.idDepto = departamentos.idDepto;