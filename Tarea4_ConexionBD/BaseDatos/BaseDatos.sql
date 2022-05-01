create database Tarea4_Alumno;

use Tarea4_Alumno;

CREATE TABLE Alumno(
	Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Matricula VARCHAR(10) NOT NULL,
	Nombre VARCHAR(50),
	Correo VARCHAR(50),
	Carrera VARCHAR(25)
);