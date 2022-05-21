package Clases;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) throws FileNotFoundException {
        Utilerias.cargaListas();
        int opc;
        do {
            System.out.println();
            System.out.println("======================== Menu Principal ========================");
            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("1. Registrar un cliente");
            System.out.println("2. Registrar un producto");
            System.out.println("3. Agregar productos al carrito");
            System.out.println("4. Registrar una venta");
            System.out.println("5. Realizar una devolución");
            System.out.println("6. Solicitar una compra para el inventario");
            System.out.println("7. Registrar un proveedor");
            System.out.println("8. Salir");

            opc = leeEntero();
            switch (opc) {
                case 1:
                    //Registro de clientes
                    System.out.println("Datos del cliente");
                    System.out.println("CURP");
                    String CURP = leeCadena();
                    System.out.println("nombre");
                    String nombre = leeCadena();
                    System.out.println("direccion");
                    String direccion = leeCadena();
                    System.out.println("correo");
                    String correo = leeCadena();
                    System.out.println("celular");
                    String celular = leeCadena();
                    System.out.println("metodo de pago");
                    String metodoPago = leeCadena();

                    Cliente nuevo = new Cliente(CURP, nombre, direccion, correo, celular, metodoPago);
                    Utilerias.listaClientes.add(nuevo);
                    System.out.println(Utilerias.listaClientes);

                    break;
                case 2:
                    //Registrar un producto
                    System.out.println("Datos generales de los productos");
                    System.out.println("Codigo ");
                    String codigo = leeCadena();
                    System.out.println("Nombre ");
                    String nombreProd = leeCadena();
                    System.out.println("Precio ");
                    double precio = leeDoble();
                    System.out.println("Presentación ");
                    String presentacion = leeCadena();
                    System.out.println("Id del proveedor ");
                    String idProv = leeCadena();

                    //Buscar el proveedor por id
                    Proveedor delProducto = Utilerias.obtieneProveedor(idProv, Utilerias.listaProveedores);

                    System.out.println("Indica la cantidad de productos que se añaden al inventario ");
                    int existencia = leeEntero();
                    System.out.println("¿Qué tipo de producto es?");
                    System.out.println("1. Medicamento");
                    System.out.println("2. Productos para bebes");
                    System.out.println("3. Producto el cuidado de la salud");
                    System.out.println("4. Producto para la higiene");
                    int tipo = leeEntero();
                    if (tipo == 1) {
                        System.out.println("Sustancia activa ");
                        String sustanciaActiva = leeCadena();
                        Medicamento medicamento = new Medicamento(codigo,
                                nombreProd, precio, presentacion, delProducto, sustanciaActiva);
                        ProductoInventario prodInventario = new ProductoInventario(medicamento, existencia);
                        Utilerias.inventario.add(prodInventario);
                    } else if (tipo == 2) {
                        Bebes prodBebe = new Bebes(codigo,
                                nombreProd, precio, presentacion, delProducto);
                        ProductoInventario prodInventario = new ProductoInventario(prodBebe, existencia);
                        Utilerias.inventario.add(prodInventario);
                    } else if (tipo == 3) {
                        CuidadoSalud prodCuidadoSalud = new CuidadoSalud(codigo, nombreProd, precio, presentacion, delProducto);
                        ProductoInventario prodInventario = new ProductoInventario(prodCuidadoSalud, existencia);
                        Utilerias.inventario.add(prodInventario);
                    } else if (tipo == 4) {
                        Higiene prodHigiene = new Higiene(codigo, nombreProd, precio, presentacion, delProducto);
                        ProductoInventario prodInventario = new ProductoInventario(prodHigiene, existencia);
                        Utilerias.inventario.add(prodInventario);
                    } else {
                        System.out.println("Tipo inexistente");
                    }
                    System.out.println("Lista de productos recuperada");
                    System.out.println(Utilerias.inventario);
                    break;

                case 3:
                    //Añadir productos al carrito
                    System.out.println(Utilerias.inventario);
                    System.out.println("Proporciona el código del producto");
                    String cod = leeCadena();
                    Producto aComprar = Utilerias.obtieneProducto(cod, Utilerias.inventario);
                    System.out.println("¿Cuantos " + aComprar.getNombre() + " deseas llevar?");
                    int cant = leeEntero();
                    //Verificar si hay suficientes para añadir al carrito
                    int exist = Utilerias.obtieneExistencias(cod, Utilerias.inventario);
                    if (cant < exist) {
                        //Si se añade al carrito
                        //Crear un producto para el carrito
                        ProductoCarrito item = new ProductoCarrito(aComprar, cant);
                        //Calcular el total
                        item.setTotalProducto();
                        //Añadirlo al carrito de compras
                        Utilerias.carrito.add(item);
                    } else {
                        System.out.println("No hay suficientes " + aComprar.getNombre() + " en existencia");
                    }
                    System.out.println(Utilerias.carrito);
                    break;

                case 4:
                    //Registrar una venta
                    System.out.println("Proporciona el CURP del cliente");
                    CURP = leeCadena();
                    Cliente clie = Utilerias.obtieneCliente(CURP, Utilerias.listaClientes);

                    System.out.println("Clave para la venta");
                    String claveVenta = leeCadena();
                    //Verificar que el cliente exista y que haya añadido productos al carrito
                    if ((clie != null) && (Utilerias.carrito != null)) {
                        Venta nueva = new Venta(claveVenta, Utilerias.carrito, clie);
                        nueva.setTotalVenta();
                        Utilerias.actualizaInventario(nueva);
                        Utilerias.listaVentas.add(nueva);
                        System.out.println(Utilerias.listaVentas);
                        System.out.println(Utilerias.inventario);
                    }

                    break;
                case 5:
                    //Realizar una devolución
                    System.out.println("Proporciona el numero de transacción ");
                    String transac = leeCadena();
                    Venta aDevolucion = Utilerias.obtieneVenta(transac, Utilerias.listaVentas);
                    System.out.println("Datos de la venta a devolver");
                    System.out.println(aDevolucion.toString());
                    Utilerias.devuelveProdsalInventario(aDevolucion);
                    System.out.println(Utilerias.inventario);
                    //Se elimina la venta de la lista de ventas
                    Utilerias.listaVentas.remove(aDevolucion);
                    System.out.println(Utilerias.listaVentas);
                    break;
                case 6:
                    //Realizar una compra para el inventario

                    break;
                case 7:
                    //Registrar proveedores
                    System.out.println("Datos del proveedor");
                    System.out.println("Id");
                    String id = leeCadena();
                    System.out.println("nombre");
                    String nombreProv = leeCadena();
                    System.out.println("razon social");
                    String razon = leeCadena();

                    Proveedor prov = new Proveedor(id, nombreProv, razon);
                    Utilerias.listaProveedores.add(prov);
                    System.out.println(Utilerias.listaProveedores);

                    break;
                case 8:
                    System.out.println("Serializando colecciones...");
                    Utilerias.serializa(Utilerias.listaClientes, "Archivos/clientes.ser");
                    Utilerias.serializa(Utilerias.listaProveedores, "Archivos/proveedores.ser");
                    Utilerias.serializa(Utilerias.inventario, "Archivos/inventario.ser");
                    Utilerias.serializa(Utilerias.listaVentas, "Archivos/ventas.ser");
                    System.out.println("Hasta pronto");
                    break;

            }
        } while (opc != 8);
    }

    public static int leeEntero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static double leeDoble() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    public static String leeCadena() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
