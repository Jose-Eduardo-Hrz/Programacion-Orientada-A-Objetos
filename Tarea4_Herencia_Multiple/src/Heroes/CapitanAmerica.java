package Heroes;

import Interfaces.Humano;
import Interfaces.*;

public class CapitanAmerica implements SuperHeroe, Humano{

    @Override
    public String normal() {
        return "Soy un militar de la segunda guerra mundial";
    }

    @Override
    public String poderes() {
        return "Super fuerza y resistencia";
    }

    @Override
    public String identidad() {
        return "steve rogers";
    }

    @Override
    public int valorAtaque() {
        return 70;
    }

    @Override
    public int valorDefensa() {
        return 65;
    }

    @Override
    public int valorResistencia() {
        return 75;
    }

    @Override
    public int valorExperiencia() {
        return 90;
    }

    @Override
    public String toString() {
        return this.normal() + " mis poderes son " + this.poderes() + " mi identidad " + this.identidad();
    }
    
}
