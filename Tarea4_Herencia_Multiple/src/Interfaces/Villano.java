package Interfaces;

public interface Villano {

    abstract String nombre();
    abstract String proposito();

    // Metodo solicitado 
    abstract int valorAtaque();

    // Metodos agregado para mejorar la simulacion de batallas
    abstract int valorDefensa();
    abstract int valorResistencia();
    abstract int valorMaldad();

}
