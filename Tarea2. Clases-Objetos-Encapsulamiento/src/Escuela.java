
public class Escuela {
    
    // Atributos de la clase Escuela
    private String nombre;
    private String zona;
    private Persona[] profPersonas;
    private Persona[] alumPersonas;
    private UtilEscolar[] utilEscolars;
    private Mueble[] muebles;

    // Metodo Constructor con parametros de la clase Escuela
    public Escuela(String nombre, String zona, Persona[] profPersonas, Persona[] alumPersonas,
            UtilEscolar[] utilEscolars, Mueble[] muebles) {
        this.nombre = nombre;
        this.zona = zona;
        this.profPersonas = profPersonas;
        this.alumPersonas = alumPersonas;
        this.utilEscolars = utilEscolars;
        this.muebles = muebles;
    }

    // Metodos de acceso a los datos (getter)
    public String getNombre() { return nombre; }
    public String getZona() { return zona; }
    public Persona[] getProfPersonas() {  return profPersonas; }
    public Persona[] getAlumPersonas() {  return alumPersonas; }
    public Mueble[] getMuebles() { return muebles; }
    public UtilEscolar[] getUtilEscolars() { return utilEscolars; }
    
    // Metodos de acceso a los datos (setter)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setZona(String zona) { this.zona = zona; }
    public void setProfPersonas(Persona[] profPersonas) { this.profPersonas = profPersonas; }
    public void setAlumPersonas(Persona[] alumPersonas) { this.alumPersonas = alumPersonas; }
    public void setMuebles(Mueble[] muebles) { this.muebles = muebles; }
    public void setUtilEscolars(UtilEscolar[] utilEscolars) { this.utilEscolars = utilEscolars; }
    
    // Metodo toString 
    @Override
    public String toString() {
        String resultado = "";
        resultado += "Nombre de la Escuela: " + this.nombre + "\n";
        resultado += "Zona de la Escuela: " + this.zona + "\n";
        resultado += "\nPersonas: " + "\n";
        for( Persona p : profPersonas ) resultado += p + "\n";
        resultado += "\nUtiles escolares : " + "\n";
        for( UtilEscolar ue : this.utilEscolars ) resultado += ue + "\n";
        resultado += "\nMuebles : " + "\n";
        for( Mueble m : this.muebles ) resultado += m + "\n";
        return resultado;
    }
}
