package Clases;

import java.io.Serializable;

public class Cliente implements Serializable
{
	private String CURP;
	private String nombre;
	private String direccion;
	private String correo;
	private String celular;
	private String metodoPago;
	
	public Cliente(String cURP, String nombre, String direccion, String correo, String celular, String metodoPago) {
		super();
		CURP = cURP;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.celular = celular;
		this.metodoPago = metodoPago;
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	
	public String toString() 
	{
		return "\nCURP = " + CURP + ", nombre = " + nombre + ", direccion = " + direccion + ", correo = " + correo
				+ ", celular = " + celular + ", metodoPago = " + metodoPago;
	}
	
	
}
