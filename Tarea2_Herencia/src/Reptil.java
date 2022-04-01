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
        return super.toString() + String.format("%-10s %-10s %-10s %-10s %-10s",
            "N/A", "N/A","N/A", "N/A", getTienePatas()
        );
    }

}
