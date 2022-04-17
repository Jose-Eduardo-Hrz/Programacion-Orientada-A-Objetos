public class TransportePersonas extends Transporte{
    
    private int numeroAsientos;

    public TransportePersonas( int numeroAsientos , String Placa , String Nombre ){
        super( Placa , Nombre );
        this.numeroAsientos = numeroAsientos;
    }

    // Metodo Getter de la Clase Transporte de Personas
    public int getNumeroAsientos() { return numeroAsientos; }

    // Metodo Setter de la Clase Transporte de Personas
    public void setNumeroAsientos(int numeroAsientos) { this.numeroAsientos = numeroAsientos; }

    // Metodo to String
    public String toString() {
        return super.toString() + String.format("%-15s%-15s" , "N/A" , getNumeroAsientos() );
    }

}
