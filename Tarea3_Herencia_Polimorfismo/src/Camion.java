public class Camion extends TransporteCarga{

    public Camion(float pesoCarga, String Placa, String Nombre) {
        super(pesoCarga, Placa, Nombre);
    }

    @Override
    public double calculaPrecioRenta() {
        return calculaPrecioBase() + ( 30 * getPesoCarga() );
    }

}