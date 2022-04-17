public abstract class Transporte implements CalculaCostos {

  private String Placa;
  private String Nombre;

  public Transporte(String Placa, String Nombre) {
    this.Placa = Placa;
    this.Nombre = Nombre;
  }

  // Metodos Getters para la clase Transporte
  public String getPlaca() { return Placa; }
  public String getNombre() { return Nombre; }

  // Metodo Setters para la clase Transporte
  public void setPlaca(String placa)  {Placa = placa; }
  public void setNombre(String nombre)  {Nombre = nombre; }

  // Metodos abstractos de la Clase CalculaCostos
  @Override
  public double calculaPrecioBase() { return 500; }
  @Override
  public double calculaPrecioRenta() { return 0 ; }

  // Metodo toString
  @Override
  public String toString() {
    return String.format("%-10s %-30s", getPlaca(), getNombre());
  }

}