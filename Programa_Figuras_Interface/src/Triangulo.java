public class Triangulo implements Figura{
    
    // Atributos de la clase Triangulo
    private int base;
    private int altura;

    // Metodo Constructor de la clase Triangulo
    public Triangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }

    // Metodos abstractos implementados de la interfaz Figura
    @Override
    public String dibujar() {
        return "Soy un Triangulo";
    }

    @Override
    public float obtenerArea() {
        return (float) (base*altura)/2;
    }

    @Override
    public float obtenerPerimetro() {
        return base*3;
    }

    @Override
    public String mostrarInformacion(){
        return String.format("%-20s %-15s %-15s", 
        dibujar() , obtenerArea() , obtenerPerimetro() );
    }

}
