public class Ave extends Animal{
    
    private boolean vuela;

    public Ave( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad, boolean vuela ){
        super(Nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitad);
        this.vuela = vuela;
    }

    // Metodo Getter de la clase Ave
    public Boolean getVuela(){ return vuela; }

    // Metodo Setter de la clase Ave
    public void setVuela( boolean vuela ){ this.vuela = vuela; }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-10s %-10s %-10s %-10s %-10s", 
            getNombre(), 
            getTipoPiel(),
            getTipoRespiracion(),
            getTipoReproduccion(),
            getHabitad(),
            "N/A",
            getVuela(),
            "N/A", "N/A", "N/A"
        );
    }

}
