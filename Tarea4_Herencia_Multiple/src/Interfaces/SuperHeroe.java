package Interfaces;

public interface SuperHeroe{

    abstract String poderes();
    abstract String identidad();

    // Metodo solicitado 
    abstract int valorAtaque();
    
    // Metodos agregado para mejorar la simulacion de batallas
    abstract int valorDefensa();
    abstract int valorResistencia();
    abstract int valorExperiencia();

}