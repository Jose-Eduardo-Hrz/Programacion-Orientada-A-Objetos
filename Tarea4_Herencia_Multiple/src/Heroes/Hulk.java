package Heroes;

import Interfaces.*;

public class Hulk implements SuperHeroe, Humano{

    @Override
    public String normal() {
        return "Soy Cientifico y mi nombre es Bruce Banner";
    }

    @Override
    public String poderes() {
        return "Super Resistencia, Gran Fuerza y Experto en Peleas";
    }

    @Override
    public String identidad() {
        return "Soy verde, muy fuerte y simpre grito Holk aplasta";
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
    public int valorExperiencia() {
        return 60;
    }

    @Override
    public String toString() {
        return this.normal() + " mis poderes son " + this.poderes() + " mi identidad " + this.identidad();
    }

}
