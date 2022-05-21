package Clases;

public class Medicamento extends Producto
{
	private String sustanciaActiva;

	public Medicamento(String codigo, String nombre, double precio, String presentacion, Proveedor proveedor,
			String sustanciaActiva) {
		super(codigo, nombre, precio, presentacion, proveedor);
		this.sustanciaActiva = sustanciaActiva;
	}

	public String getSustanciaActiva() {
		return sustanciaActiva;
	}

	public void setSustanciaActiva(String sustanciaActiva) {
		this.sustanciaActiva = sustanciaActiva;
	}

	
	public String toString() 
	{
		return super.toString() + " Tipo Medicamento " + sustanciaActiva;
	}
	
	
}
