/*CREAR BASE DE DATOS*/
CREATE DATABASE BD_Horarios;

USE BD_Horarios;

/*CREAR TABLA Horario*/
CREATE TABLE Horario(
	ClaveHorario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	Materia VARCHAR(30) NOT NULL,
	Dias VARCHAR(35) NOT NULL,
	HoraInicio VARCHAR(10) NOT NULL,
	HoraFin VARCHAR(10) NOT NULL,
	Profesor VARCHAR(200) NOT NULL,
	INDEX(ClaveHorario)
);

