package Villanos;

import Interfaces.*;

public class BlackDwarf implements Villano, Alien{

    @Override
    public String planet() {
        return "Indefinido";
    }

    @Override
    public String nombre() {
        return "Black Dwarf";
    }

    @Override
    public String proposito() {
        return "Ayudar a Thanos";
    }

    @Override
    public int valorAtaque() {
        return 90;
    }

    @Override
    public int valorDefensa() {
        return 95;
    }

    @Override
    public int valorResistencia() {
        return 90;
    }

    @Override
    public int valorMaldad() {
        return 60;
    }
    
    @Override
    public String toString() {
        return "Yo naci en " + this.planet() + " mi nombre es " + this.nombre() + " mi proposito es " + this.proposito();
    }

}
