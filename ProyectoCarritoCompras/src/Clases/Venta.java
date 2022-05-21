package Clases;

import java.io.Serializable;
import java.util.List;

public class Venta implements Serializable
{
	private String numTransaccion;
	private List<ProductoCarrito> prodsAPagar;
	private double totalVenta;
	private Cliente cliente;
	
	public Venta(String numTransaccion, List<ProductoCarrito> prodsAPagar, Cliente cliente) 
	{
		this.numTransaccion = numTransaccion;
		this.prodsAPagar = prodsAPagar;
		this.cliente = cliente;
	}

	public String getNumTransaccion() {
		return numTransaccion;
	}

	public void setNumTransaccion(String numTransaccion) {
		this.numTransaccion = numTransaccion;
	}

	public List<ProductoCarrito> getProdsAPagar() {
		return prodsAPagar;
	}

	public void setProdsAPagar(List<ProductoCarrito> prodsAPagar) {
		this.prodsAPagar = prodsAPagar;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta() 
	{
		double suma = 0.0;
		for(int i=0; i<prodsAPagar.size(); i++)
			suma = suma + prodsAPagar.get(i).getTotalProducto();
		this.totalVenta = suma;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "\nNumero de venta " + numTransaccion + "\nLista de productos " + prodsAPagar + "\nTotal de la Venta = " + totalVenta
				+ "\nDatos del cliente" + cliente;
	}
	
	
	
}
