public class Veiculo extends TransportePersonas{

    public Veiculo(int numeroAsientos, String Placa, String Nombre) {
        super(numeroAsientos, Placa, Nombre);
    }

    @Override
    public double calculaPrecioRenta() {
        return calculaPrecioBase() + ( 20 * getNumeroAsientos() );
    }

}