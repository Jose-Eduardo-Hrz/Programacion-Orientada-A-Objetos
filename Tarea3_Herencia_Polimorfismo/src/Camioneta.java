public class Camioneta extends TransporteCarga{

    public Camioneta(float pesoCarga, String Placa, String Nombre) {
        super(pesoCarga, Placa, Nombre);
    }

    @Override
    public double calculaPrecioRenta() {
        return calculaPrecioBase() + ( 550 );
    }
    
}