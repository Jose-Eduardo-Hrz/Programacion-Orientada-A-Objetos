public class Persona{

    // Atributos de clase Persona
    private String nombre;
    private int edad;
    private String genero;
    private String tipoPersona;

    // Metodo Contructor con parametros de clase Persona
    public Persona( String nombre , int edad , String genero , String tipoPersona ){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoPersona = tipoPersona;
    }

    // Metodos de acceso a los datos (getter)
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }
    public String getTipoPersona() { return tipoPersona; }
    
    // Metodos de acceso a los datos (setter)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setGenero(String genero) {  this.genero = genero; }
    public void setTipoPersona(String tipoPersona) { this.tipoPersona = tipoPersona; }

    // Metodo toString 
    @Override
    public String toString() {
        return String.format( "%-15s %-5s %-10s %-10s" , this.nombre , this.edad, this.genero, this.tipoPersona);
    }

}