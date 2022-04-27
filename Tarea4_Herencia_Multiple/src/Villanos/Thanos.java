package Villanos;

import Interfaces.*;

public class Thanos implements Villano, Alien{

    @Override
    public String planet() {
        return "Titan";
    }

    @Override
    public String nombre() {
        return "Thanos";
    }

    @Override
    public String proposito() {
        return "Matar a la mitad de los seres vivos del universo";
    }

    @Override
    public int valorAtaque() {
        return 99;
    }

    @Override
    public int valorDefensa() {
        return 97;
    }

    @Override
    public int valorResistencia() {
        return 98;
    }

    @Override
    public int valorMaldad() {
        return 99;
    }

    @Override
    public String toString() {
        return "Yo naci en " + planet() + " mi nombre es " + nombre() + " mi proposito es " + proposito();
    }
    
}
