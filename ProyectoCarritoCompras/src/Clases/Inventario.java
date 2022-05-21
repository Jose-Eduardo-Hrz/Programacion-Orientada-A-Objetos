package Clases;

public class Inventario 
{
	private Producto producto;
	private int existencia;
	
	public Inventario(Producto producto, int existencia) {
		super();
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

	
	public String toString() {
		return "Inventario [producto=" + producto + ", existencia=" + existencia + "]";
	}
	
	
}
