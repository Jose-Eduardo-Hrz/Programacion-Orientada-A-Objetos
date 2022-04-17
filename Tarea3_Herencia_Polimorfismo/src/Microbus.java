public class Microbus extends TransportePersonas{

    public Microbus(int numeroAsientos, String Placa, String Nombre) {
        super(numeroAsientos, Placa, Nombre);
    }

    @Override
    public double calculaPrecioRenta() {
        return 500 + ( 35 * getNumeroAsientos() );
    }
    
}