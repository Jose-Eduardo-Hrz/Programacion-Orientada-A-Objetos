public class TransporteCarga extends Transporte{
    
    private float pesoCarga;

    public TransporteCarga( float pesoCarga , String Placa , String Nombre ){
        super( Placa , Nombre );
        this.pesoCarga = pesoCarga;
    }

    // Metodo Getter de la Clase Transporte de Carga
    public float getPesoCarga() { return pesoCarga; }

    // Metodo Setter de la Clase Transporte de Carga
    public void setPesoCarga(float pesoCarga) { this.pesoCarga = pesoCarga; }

    // Metodo to String
    public String toString() {
        return super.toString() + String.format("%-15s%-15s", getPesoCarga() + " ton" , "N/A" );
    }

}
