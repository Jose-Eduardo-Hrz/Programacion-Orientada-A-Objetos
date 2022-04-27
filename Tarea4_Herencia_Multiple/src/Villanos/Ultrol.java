package Villanos;

import Interfaces.Villano;

public class Ultrol implements Villano{

    @Override
    public String nombre() {
        return "Ultrol";
    }

    @Override
    public String proposito() {
        return "Matar a todos los seres humanos para proteger el planeta tierra";
    }

    @Override
    public int valorAtaque() {
        return 95;
    }

    @Override
    public int valorDefensa() {
        return 95;
    }

    @Override
    public int valorResistencia() {
        return 99;
    }

    @Override
    public int valorMaldad() {
        return 91;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre() + " mi proposito es " + proposito();
    }
    
}
