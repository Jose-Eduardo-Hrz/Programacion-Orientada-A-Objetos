public class Mueble {

    // Atributos de clase Mueble
    private String nombre;
    private String tipoMaterial;

    // Metodo constructor con parametros de la clase Mueble
    public Mueble(String nombre,String tipoMaterial) {
        this.nombre = nombre;
        this.tipoMaterial = tipoMaterial;
    }

    // Metodo de acceso a los datos (getter)
    public String getNombre() { return nombre; }
    public String getTipoMaterial() { return tipoMaterial; }

    // Metodo de acceso a los datos (setter)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTipoMaterial(String tipoMaterial) { this.tipoMaterial = tipoMaterial;  }

    // Metodo toString
    @Override
    public String toString() {
        return String.format( "%-15s %-15s" , this.nombre,this.tipoMaterial);
    }

}
