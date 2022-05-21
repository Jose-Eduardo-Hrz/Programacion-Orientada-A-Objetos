package Clases;

import java.io.Serializable;

public class ProductoInventario implements Serializable
{
	private Producto producto;
	private int existencia;
	
	public ProductoInventario(Producto producto, int existencia) {
		this.producto = producto;
		this.existencia = existencia;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "\nProducto de Inventario " + producto.getCodigo() + " " + producto.getNombre() + ", existencia " + existencia;
	}
	
	
	
}
