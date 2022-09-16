package Heroes;

import Interfaces.*;

public class Ironman implements SuperHeroe, Humano{

    @Override
    public String normal() {
        return "Genio, Millonario, Play Boy y Filantropo";
    }

    @Override
    public String poderes() {
        return "Armadura de hierro que permite volar, tener resistencia a golpes, gran fuerza, expulsar energia y controlar dispositivos electronicos";
    }

    @Override
    public String identidad() {
        return "Mi nombre es Tony Stark";
    }

    @Override
    public int valorAtaque() {
        return 90;
    }

    @Override
    public int valorDefensa() {
        return 85;
    }

    @Override
    public int valorResistencia() {
        return 85;
    }

    @Override
    public int valorExperiencia() {
        return 93;
    }

    @Override
    public String toString() {
        return this.normal() + " mis poderes son " + this.poderes() + " mi identidad " + this.identidad();
    }
    
}
