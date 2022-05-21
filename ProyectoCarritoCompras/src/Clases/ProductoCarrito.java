package Clases;

import java.io.Serializable;

public class ProductoCarrito implements Serializable
{
	private Producto producto;
	private int cantidad;
	private double totalProducto;
	
	public ProductoCarrito(Producto producto, int cantidad) 
	{
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotalProducto() {
		return totalProducto;
	}

	public void setTotalProducto() 
	{
		this.totalProducto = cantidad * producto.getPrecio();
	}

	@Override
	public String toString() 
	{
		return "\nProducto en el Carrito " + producto.getNombre() + ", cantidad " + cantidad + ", total " + this.getTotalProducto();
	}
	
	
	
}
