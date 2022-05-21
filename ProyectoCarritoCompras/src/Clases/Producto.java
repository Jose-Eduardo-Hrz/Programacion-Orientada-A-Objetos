package Clases;

import java.io.Serializable;

public class Producto implements Serializable
{
	private String codigo;
	private String nombre;
	private double precio;
	private String presentacion;
	private Proveedor proveedor;
	
	public Producto(String codigo, String nombre, double precio, String presentacion, Proveedor proveedor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.presentacion = presentacion;
		this.proveedor = proveedor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	
	public String toString() 
	{
		return "\nCodigo del producto " + codigo + "\n Nombre " + nombre + " Precio " + precio + " Presentacion "
				+ presentacion + "\n Proveedor " + proveedor.getRazonSocial();
	}
	
	
}
