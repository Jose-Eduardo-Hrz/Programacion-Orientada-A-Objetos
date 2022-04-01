public class Mamifero extends Animal{
    
    private boolean terrestre;

    public Mamifero( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad, boolean terrestre ){
        super(Nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitad);
        this.terrestre = terrestre;
    }

    // Metodo Getter de la clase Mamifero
    public Boolean getTerrestre(){ return terrestre; }

    // Metodo Setter de la clase Mamifero
    public void setTerrestre(boolean terrestre){ this.terrestre = terrestre; }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10s %-10s %-10s %-10s %-10s",
            "N/A", "N/A", getTerrestre(), "N/A", "N/A"
        );
    }

}
