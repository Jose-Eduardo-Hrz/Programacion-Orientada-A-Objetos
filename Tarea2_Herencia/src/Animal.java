public class Animal {
    
    // Atributos de la Clase Animal
    private String Nombre;
    private String tipoPiel;
    private String tipoRespiracion;
    private String tipoReproduccion;
    private String habitad;

    // Constructor de la Clase Animal
    public Animal( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad ){
        this.Nombre = Nombre;
        this.tipoPiel = tipoPiel;
        this.tipoRespiracion = tipoRespiracion;
        this.tipoReproduccion = tipoReproduccion;
        this.habitad = habitad;
    }

    // Metodos Getters de la Clase Animal
    public String getNombre() { return Nombre; }
    public String getTipoPiel() { return tipoPiel; }
    public String getTipoRespiracion() { return tipoRespiracion; }
    public String getTipoReproduccion() { return tipoReproduccion; }
    public String getHabitad() { return habitad; }

    // Metodos Setters de la Clase Animal
    public void setNombre(String nombre) { this.Nombre = nombre; }
    public void setTipoPiel(String tipoPiel) { this.tipoPiel = tipoPiel; }
    public void setTipoRespiracion(String tipoRespiracion) { this.tipoRespiracion = tipoRespiracion; }
    public void setTipoReproduccion(String tipoReproduccion) { this.tipoReproduccion = tipoReproduccion; }
    public void setHabitad(String habitad) { this.habitad = habitad; }

    // Metodo toString
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s ", 
            getNombre(), getTipoPiel(), getTipoRespiracion(), getTipoReproduccion(), getHabitad()
        );
    }
}
