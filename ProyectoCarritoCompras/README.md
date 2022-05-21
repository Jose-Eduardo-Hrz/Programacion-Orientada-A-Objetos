# Manejo de Carrito de Compras

## Descripción

Desarrollar un sistema basado en Programación Orientada a Objetos para realizar la gestión de una Farmacia. Dicho sistema deberá ser
capaz de realizar el registro de las ventas, los clientes, el inventario de productos y los proveedores.

En relación al registro de los clientes, el sistema deberá llevar un registro de todos los clientes que regularmente visitan la Farmacia. Por
cada cliente se deberá registra su CURP, nombre, dirección, correo, celular y datos del método de pago que prefiere (tarjeta de crédito o débito).

El inventario de productos deberá consistir de una clasificación como la que se muestra en la Fig. 1, donde cada producto deberá
tener una clave de identificación única, el nombre del producto, la descripción, el precio y el proveedor. 
Este inventario se manejará mediante una tabla de Hash (HashMap) la cual se utilizará para almacenar la información en
un archivo serializado “inventario.ser”.

<div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/ProyectoCarritoCompras/Imagenes/Imagen1.PNG" width="400">
 </div>

 <div align="center">
    Imagen 1. Clases
 </div>

Cuando se inicie el sistema deberá mostrar un menú principal con las siguientes opciones Menú principal

1. Registrar una venta
2. Registrar un cliente
3. Realizar una devolución
4. Solicitar una compra para el inventario
5. Registrar un proveedor
6. Consultas (ventas, clientes, compras, proveedores)

Cada vez que se registre una venta, las claves de los productos ya deben existir, de tal forma que
se puedan recuperar los datos de su precio y las existencias. Asimismo, por cada venta se debe
solicitar el CURP del cliente para recuperar sus datos y actualizar el monto de su pedido.


Todos los datos se deben ir serializando en los siguientes archivos: ventas.ser, clientes.ser,
devoluciones.ser, proveedores.ser, inventario.ser

## Caracteristicas

1. Diseño basado en los principios y conceptos de Programación Orientada a Objetos. Para
evaluar esta característica se revisarán todas las relaciones de herencia, la encapsulación,
la implementación de polimorfismo a través de clases abstractas e interfaces, la
sobrecarga de métodos, la abstracción, etc.
2. Uso de colecciones. Se deberán implementar colecciones de java por cada tipo de objeto
que se registre.
3. Uso de persistencia de objetos. Se deberán guardar las colecciones de objetos en archivos
serializados por cada tipo de objeto.
4. Funcionamiento correcto. Otro aspecto muy relevante del sistema, es que éste no debe
fallar, por lo tanto, se presentará un plan de pruebas con el objetivo de cubrir todos los
aspectos funcionales del sistema y que éstos sean evaluados.

## Diagrama

<div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/ProyectoCarritoCompras/Imagenes/Diagrama.png" width="1100">
 </div>

<div align="center">
  Imagen 2. Diagrama de Clases
</div>


**NOTA: Si no se logra observar correctamente el diagrama, favor de presionar la imagen**

 ## Resultados

 <div align="center">
  <img src="https://github.com/Jose-Eduardo-Hrz/Programacion-Orientada-A-Objetos/blob/main/ProyectoCarritoCompras/Imagenes/Resultado.gif" width="1000">
 </div>

 Tambien puede observar el código en la siguiente liga:

 https://replit.com/@JOSE-EDUARDOE73/Manejo-de-Carrito-de-Compras#README.md 

## Autores

- José Eduardo Hernández
- Maricela Claudia Bravo
