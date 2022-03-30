public class Reptil extends Animal{
    
    private boolean tienePatas;

    public Reptil( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad, boolean tienePatas ){
        super(Nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitad);
        this.tienePatas = tienePatas;
    }

    public boolean getTienePatas(){ return tienePatas; }

    public void setTienePatas(boolean tienePatas){ this.tienePatas = tienePatas; }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-10s %-10s %-10s %-10s %-10s", 
            getNombre(), 
            getTipoPiel(),
            getTipoRespiracion(),
            getTipoReproduccion(),
            getHabitad(),
            "N/A", "N/A","N/A", "N/A",
            getTienePatas()
        );
    }

}
