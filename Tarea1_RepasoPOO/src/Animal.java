package src;

public class Animal {
    
    // Atributos de la clase Animal
    private String nombre;
    private String descripcion;
    private int edad;
    private int numeroJaula;
    private String tipoAlimentacion;
    private String tipoReproduccion;

    // Constructor
    public Animal( String nombre, String descripcion, int edad, int numeroJaula, String tipoAlimentacion, String tipoReproduccion ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edad = edad;
        this.numeroJaula = numeroJaula;
        this.tipoAlimentacion = tipoAlimentacion;
        this.tipoReproduccion = tipoReproduccion;
    }

    // Metodos Getters ( Para obtener los atributos de la clase )
    public String getNombre(){ return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getEdad() {  return edad; }
    public int getNumeroJaula() { return numeroJaula; }
    public String getTipoAlimentacion() {  return tipoAlimentacion; }
    public String getTipoReproduccion() { return tipoReproduccion; }

    // Metodos Setters ( Para modificar los atributos de la clase )
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setNumeroJaula(int numeroJaula) { this.numeroJaula = numeroJaula; }
    public void setTipoAlimentacion(String tipoAlimentacion) { this.tipoAlimentacion = tipoAlimentacion; }
    public void setTipoReproduccion(String tipoReproduccion) {  this.tipoReproduccion = tipoReproduccion; }

    // Metodo toString para mostrar TODOS los atributos de la clase Animal
    @Override
    public String toString() {
        return String.format("%20s %30s %10s %10s %20s %20s", getNombre(), getDescripcion(), getEdad(), getNumeroJaula(), getTipoAlimentacion() , getTipoReproduccion() );
    }
}
