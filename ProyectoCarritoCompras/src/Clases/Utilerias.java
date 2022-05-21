package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utilerias {

    static List<Cliente> listaClientes;
    static List<Proveedor> listaProveedores;
    static List<ProductoInventario> inventario;
    static List<ProductoCarrito> carrito;
    static List<Venta> listaVentas;

    @SuppressWarnings("unchecked")
    public static void cargaListas() {
        listaClientes = (List<Cliente>) Utilerias.deserializa("Archivos/clientes.ser");
        if (listaClientes != null) {
            System.out.println();
            System.out.print("Lista de clientes recuperada ");
            System.out.println(listaClientes);
        } else {
            listaClientes = new ArrayList<Cliente>();
        }

        listaProveedores = (List<Proveedor>) Utilerias.deserializa("Archivos/proveedores.ser");
        if (listaProveedores != null) {
            System.out.println();
            System.out.print("Lista de proveedores recuperada ");
            System.out.println(listaProveedores);
        } else {
            listaProveedores = new ArrayList<Proveedor>();
        }

        inventario = (List<ProductoInventario>) Utilerias.deserializa("Archivos/inventario.ser");
        if (inventario != null) {
            System.out.println();
            System.out.print("Lista de productos recuperada ");
            System.out.println(inventario);
        } else {
            inventario = new ArrayList<ProductoInventario>();
        }

        carrito = new ArrayList<ProductoCarrito>();

        listaVentas = (List<Venta>) Utilerias.deserializa("Archivos/ventas.ser");
        if (listaVentas != null) {
            System.out.println();
            System.out.print("Lista de ventas recuperada ");
            System.out.println(listaVentas);
        } else {
            listaVentas = new ArrayList<Venta>();
        }
    }

    public static void serializa(Collection coleccion, String archivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(coleccion);
            out.close();
            fileOut.close();

            System.out.println("Datos serializados en " + archivo);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Collection deserializa(String archivo) {
        Collection recuperado = null;
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            recuperado = (Collection) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException i) {
            System.out.println("No existe el archivo" + archivo);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return recuperado;
    }

    // Metodo para devolver el proveedor dado un id
    public static Proveedor obtieneProveedor(String id, List<Proveedor> lista) {
        Proveedor buscado = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdProveedor().equals(id)) {
                buscado = lista.get(i);
            }
        }
        return buscado;
    }

    // Metodo para devolver el producto dado su codigo
    public static Producto obtieneProducto(String codigo, List<ProductoInventario> lista) {
        Producto buscado = null;
        for (int i = 0; i < lista.size(); i++) {
            Producto cadaProd = lista.get(i).getProducto();
            if (cadaProd.getCodigo().equalsIgnoreCase(codigo)) {
                buscado = cadaProd;
            }
        }
        return buscado;
    }

    // Metodo para devolver la venta dada su transaccion
    public static Venta obtieneVenta(String trans, List<Venta> lista) {
        Venta registrada = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumTransaccion().equalsIgnoreCase(trans)) {
                registrada = lista.get(i);
            }
        }
        return registrada;
    }

    // Metodo para devolver la existencia de un producto dado su codigo
    public static int obtieneExistencias(String codigo, List<ProductoInventario> lista) {
        int existencias = 0;
        for (int i = 0; i < lista.size(); i++) {
            Producto cadaProd = lista.get(i).getProducto();
            if (cadaProd.getCodigo().equalsIgnoreCase(codigo)) {
                existencias = lista.get(i).getExistencia();
            }
        }
        return existencias;
    }

    // Metodo para devolver el cliente dado su CURP
    public static Cliente obtieneCliente(String curp, List<Cliente> lista) {
        Cliente buscado = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCURP().equals(curp)) {
                buscado = lista.get(i);
            }
        }
        return buscado;
    }

    //Metodo para actualizar el inventario después de una venta
    public static void actualizaInventario(Venta venta) {
        //Obtener la lista de productos a pagar de la venta
        List<ProductoCarrito> productosComprados = venta.getProdsAPagar();
        for (int i = 0; i < productosComprados.size(); i++) {
            String claveProd = productosComprados.get(i).getProducto().getCodigo();
            int cantidadComprada = productosComprados.get(i).getCantidad();
            //Actualizacion en el inventario
            actualizaCantidadExistencia(claveProd, cantidadComprada);
        }

    }

    public static void actualizaCantidadExistencia(String clave, int cantComprar) {
        for (int i = 0; i < inventario.size(); i++) {
            Producto item = inventario.get(i).getProducto();
            if (item.getCodigo().equalsIgnoreCase(clave)) {
                int antes = inventario.get(i).getExistencia();
                int diferencia = antes - cantComprar;
                inventario.get(i).setExistencia(diferencia);
            }
        }
    }

    public static void devuelveProdsalInventario(Venta aDevolver) {
        List<ProductoCarrito> prodsADevolver = aDevolver.getProdsAPagar();

        for (int i = 0; i < prodsADevolver.size(); i++) {
            Producto item = prodsADevolver.get(i).getProducto();
            String clave = item.getCodigo();
            int cantDevuelta = prodsADevolver.get(i).getCantidad();
            sumaExistencia(clave, cantDevuelta);
        }
    }

    public static void sumaExistencia(String clave, int cantDevuelta) {
        for (int i = 0; i < inventario.size(); i++) {
            Producto item = inventario.get(i).getProducto();
            if (item.getCodigo().equalsIgnoreCase(clave)) {
                int antes = inventario.get(i).getExistencia();
                int suma = antes + cantDevuelta;
                inventario.get(i).setExistencia(suma);
            }
        }
    }
    
}
