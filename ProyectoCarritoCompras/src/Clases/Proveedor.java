package Clases;

import java.io.Serializable;

public class Proveedor implements Serializable
{
	private String idProveedor;
	private String nombre;
	private String razonSocial;
	
	public Proveedor(String idProveedor, String nombre, String razonSocial) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	
	public String toString() 
	{
		return "\nidProveedor = " + idProveedor + ", nombre = " + nombre + ", razonSocial = " + razonSocial;
	}
	
	
}
