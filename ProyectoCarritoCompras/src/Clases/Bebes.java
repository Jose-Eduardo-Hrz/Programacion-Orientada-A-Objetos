package Clases;

public class Bebes extends Producto
{

	public Bebes(String codigo, String nombre, double precio, String presentacion, Proveedor proveedor) {
		super(codigo, nombre, precio, presentacion, proveedor);
	}

	@Override
	public String toString() {
		return super.toString() + " Tipo Bebes ";
	}

}
