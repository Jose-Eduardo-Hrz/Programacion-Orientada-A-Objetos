package Villanos;

import Interfaces.*;

public class DuendeVerde implements Villano, Humano{

    @Override
    public String normal() {
        return "Cientifico millonario";
    }

    @Override
    public String nombre() {
        return "Norman Osborn";
    }

    @Override
    public String proposito() {
        return "Conquistar el Mundo Entero";
    }

    @Override
    public int valorAtaque() {
        return 75;
    }

    @Override
    public int valorDefensa() {
        return 70;
    }

    @Override
    public int valorResistencia() {
        return 87;
    }

    @Override
    public int valorMaldad() {
        return 75;
    }

    @Override
    public String toString() {
        return "Soy " + normal() + " mi nombre es " + nombre() + " mi proposito es " + proposito();
    }
    
}
