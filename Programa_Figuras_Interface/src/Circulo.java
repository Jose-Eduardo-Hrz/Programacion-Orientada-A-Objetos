public class Circulo implements Figura{
    
    // Atributos de la clase Circulo
    private int radio;

    // Metodo Constructor de la clase Circulo
    public Circulo(int radio){
        this.radio = radio;
    }

    // Metodos abstractos implementados de la interfaz Figura
    @Override
    public String dibujar() {
        return "Soy un Circulo";
    }

    @Override
    public float obtenerArea() {
        return (float) (radio*radio*3.1416);
    }

    @Override
    public float obtenerPerimetro() {
        return (float) (radio*2*3.1416);
    }

    @Override
    public String mostrarInformacion(){
        return String.format("%-20s %-15s %-15s", 
        dibujar() , obtenerArea() , obtenerPerimetro() );
    }

}
