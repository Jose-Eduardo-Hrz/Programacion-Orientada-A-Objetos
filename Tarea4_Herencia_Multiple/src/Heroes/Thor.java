package Heroes;

import Interfaces.*;

public class Thor implements SuperHeroe, Alien{

    @Override
    public String planet() {
        return "Asgard";
    }

    @Override
    public String poderes() {
        return "Super fuerza, controlar los truenos, super resistencia, volar y controlar el Mjolnir (Martillo)";
    }

    @Override
    public String identidad() {
        return "Thor Odinson";
    }

    @Override
    public int valorAtaque() {
        return 98;
    }

    @Override
    public int valorDefensa() {
        return 95;
    }

    @Override
    public int valorResistencia() {
        return 96;
    }

    @Override
    public int valorExperiencia() {
        return 97;
    }

    @Override
    public String toString() {
        return "Yo naci en " + this.planet() + " mis poderes son " + this.poderes() + " mi identidad " + this.identidad();
    }
    
}
