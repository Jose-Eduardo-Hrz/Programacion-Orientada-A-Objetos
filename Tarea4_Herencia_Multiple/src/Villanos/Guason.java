package Villanos;

import Interfaces.Humano;
import Interfaces.*;

public class Guason implements Villano, Humano{

    @Override
    public String normal() {
        return "Indefinido";
    }

    @Override
    public String nombre() {
        return "Joker";
    }

    @Override
    public String proposito() {
        return "Indefinido";
    }

    @Override
    public int valorAtaque() {
        return 10;
    }

    @Override
    public int valorDefensa() {
        return 7;
    }

    @Override
    public int valorResistencia() {
        return 5;
    }

    @Override
    public int valorMaldad() {
        return 85;
    }

    @Override
    public String toString() {
        return "Soy " + normal() + " mi nombre es " + nombre() + " mi proposito es " + proposito();
    }
    
}
