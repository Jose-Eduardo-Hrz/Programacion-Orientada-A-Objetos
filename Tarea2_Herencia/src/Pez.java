public class Pez extends Animal{
   
    private int numeroOjos;

    public Pez( String Nombre, String tipoPiel, String tipoRespiracion, String tipoReproduccion, String habitad, int numeroOjos ){
        super(Nombre, tipoPiel, tipoRespiracion, tipoReproduccion, habitad);
        this.numeroOjos = numeroOjos;
    }

    public int getNumeroOjos() {
        return numeroOjos;
    }

    public void setNumeroOjos(int numeroOjos) {
        this.numeroOjos = numeroOjos;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10s %-10s %-10s %-10s %-10s",
            "N/A", "N/A", "N/A", getNumeroOjos(), "N/A", "N/A"
        );
    }

}
