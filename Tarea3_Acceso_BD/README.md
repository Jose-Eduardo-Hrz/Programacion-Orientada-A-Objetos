# Tarea 3. Acceso a la Base de Datos

## Instrucciones
1. Implementar una base de datos con MySQL o MariaDB para la gestión de Horarios. Se debe crear una tabla de Horarios con los siguientes atributos:

Horario con los siguientes atributos:

- claveHorario char(10), no acepta valores nulos y que sea llave primaria
- materia varchar(30)
- días varchar(35)
- horaInicio varchar(10)
- horaFin varchar(10)
- profesor varchar(200)

2. Desarrollar un proyecto en Eclipse con tres clases:

+ Una clase Horario para representar los atributos de la tabla Horarios
+ Una clase de UtileriasHorarios para implementar los siguientes métodos:
    * Imprimir todos los registros de la tabla de Horarios
    * Registrar un nuevo horario
    * Buscar y obtener un horario
    * Eliminar un registro de la tabla de Horarios
+ Una clase tipo Aplicación en la cual se deberá mostrar el Menú Principal a través del cual el usuario seleccionará las opciones que le interese realizar
    * Impresión de horarios
    * Registro de horario
    * Búsqueda de horario
    * Eliminación de horario
+ Para la ejecución de cada método se deben incorporar validaciones, por ejemplo, antes de eliminar un horario se debe verificar que si exista. Antes de registrar un nuevo horario se debe verificar que NO exista, etc.

## Requerimientos

- Base de datos MySQL
- JDBC version 8.0.28
- Archivo Properties con configuracion de BD

## Compilar y Ejecutar

```
javac -d bin src/*java
java -cp bin;lib/mysql-connector-java-8.0.28.jar Principal
```

## Configuracion de Archivo Properties

https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/34c152fa655621cb992463c991e79a38d391f71d/Tarea3_Acceso_BD/Configuracion.properties#L1-L8

Para este proyecto se utilizo una base de datos en la nube:
- Clever Cloud https://www.clever-cloud.com/

## Resultado

<div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/Tarea3_Acceso_BD/Resultado.gif" width="800">
 </div>

## Autores 

- Jose Eduardo Hernandez
- Maricela Claudia Bravo
