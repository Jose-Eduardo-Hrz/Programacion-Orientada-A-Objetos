public class Cuadrado implements Figura{
    
    // Atributos de la clase Cuadrado
    private int lado;

    // Metodo Constructor de la clase Cuadrado
    public Cuadrado(int lado){
        this.lado = lado;
    }

    // Metodos abstractos implementados de la interfaz Figura
    @Override
    public String dibujar() {
        return "Soy un Cuadrado";
    }

    @Override
    public float obtenerArea() {
        return (float) (lado*lado);
    }

    @Override
    public float obtenerPerimetro() {
        return (float) (lado*4);
    }

    @Override
    public String mostrarInformacion(){
        return String.format("%-20s %-15s %-15s", 
        dibujar() , obtenerArea() , obtenerPerimetro() );
    }

}
