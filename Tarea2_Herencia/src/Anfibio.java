public class Anfibio extends Animal{

    private String colorPiel;

    public Anfibio( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad, String colorPiel ){
        super(Nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitad);
        this.colorPiel = colorPiel;
    }

    // Metodos Getters de la clase Anfibio
    public String getColorPiel() { return colorPiel; }

    // Metodos Settes de la clase Anfibio
    public void setColorPiel(String colorPiel) { this.colorPiel = colorPiel; }

    // Metodo toString 
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-10s %-10s %-10s %-10s %-10s", 
            getNombre(), 
            getTipoPiel(),
            getTipoRespiracion(),
            getTipoReproduccion(),
            getHabitad(),
            getColorPiel(),
            "N/A","N/A", "N/A", "N/A"
        );
    }

}
