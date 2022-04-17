# Tarea 3. Herencia y Polimorfismo

Desarrollar un sistema para la gestión y renta de diferentes tipos de transporte: vehículos, microbuses, camiones y camionetas.

1. Implementar una clase abstracta Transporte, definir los atributos comunes a todos los transportes: placa y nombre. Todos los tipos de transporte se identificarán de forma única mediante la placa.
2. Desarrollar una interface en Java para definir los métodos abstractos que permitan calcular el precio de renta aplicable a cada tipo de transporte.

```java
public interface CalculaCostos
{
    public abstract double calculaPrecioBase();
    public abstract double calculaPrecioRenta();
}
```

3. Los tipos de transporte que se deben heredar de la clase Transporte son: 
  - TransportePersonas el cual debe incluir un atributo específico para el numero de asientos. 
  - TransporteCarga, con un atributo específico para el peso en toneladas autorizado.

4. Los tipos específicos de transportes que alquila la empresa son:

    a. Para el transporte de personas: Vehículo y Microbús

    b. Para el transporte de carga: Camioneta y Camión.

5. El precio base de alquiler de cualquier transporte se calcula a razón de $500.00 pesos diarios.
6. Para el cálculo de alquiler de un vehículo, al precio base se le suma la cantidad de $20.00 pesos por el número de asientos.
7. Para el cálculo de alquiler de un microbús es igual al del vehículo, solo que se añade una cantidad de $35.00 pesos por el número de asientos.
8. Para el cálculo de alquiler de un camión de carga es el precio base más $30.00 X PMA (PMA es el peso máximo autorizado en toneladas).
9. Para el cálculo de alquiler de una camioneta, al precio base se le suma un precio fijo de $550.00 pesos.


## Resultado

<div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/Tarea3_Acceso_BD/Resultado.gif" width="800">
 </div>

 Tambien puedes visualizar y ejecutar el programa en la siguiente url:

 https://replit.com/@JOSE-EDUARDOE73/Tarea3HerenciaPolimorfismo#src/Principal.java

## Autores

- José Eduardo Hernández
- Maricela Claudia Bravo

## Repositorio

https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/edit/main/Tarea3_Acceso_BD/README.md