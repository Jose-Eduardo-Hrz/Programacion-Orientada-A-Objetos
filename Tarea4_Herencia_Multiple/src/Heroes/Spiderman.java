package Heroes;

import Interfaces.*;

public class Spiderman implements SuperHeroe, Humano{

    @Override
    public String normal() {
        return "Soy fotografo del diario el Clarin";
    }

    @Override
    public String poderes() {
        return "Super fuerza, sentido aracnido (punsada), poderes aracnidos y resistencia";
    }

    @Override
    public String identidad() {
        return "Soy Petter Parker";
    }

    @Override
    public int valorAtaque() {
        return 85;
    }

    @Override
    public int valorDefensa() {
        return 60;
    }

    @Override
    public int valorResistencia() {
        return 60;
    }

    @Override
    public int valorExperiencia() {
        return 50;
    }

    @Override
    public String toString() {
        return normal() + " mis poderes son " + poderes() + " mi identidad " + identidad();
    }
    
}
