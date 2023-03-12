public class UtilEscolar {
    
    // Atributo de la clase UtilEscolar
    private String nombre;
    
    // Constructor con parametros de la clase UtilEscolar
    public UtilEscolar(String nombre){
        this.nombre = nombre;
    }

    // Metodo de acceso (getter)
    public String getNombre() {
        return nombre;
    }

    // Metodo de acceso (getter)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("%-15s", this.nombre);
    }

}
