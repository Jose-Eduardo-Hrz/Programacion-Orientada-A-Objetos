# Tarea 3. Acceso a la Base de Datos

## Instrucciones
1. Implementar una base de datos con MySQL o MariaDB para la gesti�n de Horarios. Se debe crear una tabla de Horarios con los siguientes atributos:

Horario con los siguientes atributos:

- claveHorario char(10), no acepta valores nulos y que sea llave primaria
- materia varchar(30)
- d�as varchar(35)
- horaInicio varchar(10)
- horaFin varchar(10)
- profesor varchar(200)

2. Desarrollar un proyecto en Eclipse con tres clases:

2.1.    una clase Horario para representar los atributos de la tabla Horarios
2.2.    una clase de UtileriasHorarios para implementar los siguientes m�todos:
    a.    imprimir todos los registros de la tabla de Horarios
    b.    registrar un nuevo horario
    c.    buscar y obtener un horario
    d.    eliminar un registro de la tabla de Horarios
2.3.    una clase tipo Aplicaci�n en la cual se deber� mostrar el Men� Principal a trav�s del cual el usuario seleccionar� las opciones que le interese realizar
    a.    Impresi�n de horarios
    b.    Registro de horario
    c.    B�squeda de horario
    d.    Eliminaci�n de horario
2.4.    Para la ejecuci�n de cada m�todo se deben incorporar validaciones, por ejemplo, antes de eliminar un horario se debe verificar que si exista. Antes de registrar un nuevo horario se debe verificar que NO exista, etc.

## Requerimientos

- Base de datos MySQL
- JDBC version 8.0.28
- Archivo Properties con configuracion de BD

## Compilar y Ejecutar

``bash
javac -d bin src/*java
java -cp bin;lib/mysql-connector-java-8.0.28.jar Principal
``

## Configuracion de Archivo Properties



## Resultado

<div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/Tarea2_Programacion_Flujos/Resultado.gif" width="800">
 </div>

## Autores 

- Jose Eduardo Hernandez
- Maricela Claudia Bravo