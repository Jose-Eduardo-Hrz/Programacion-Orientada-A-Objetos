package Aplicacion;

import Heroes.*;
import Interfaces.*;
import Villanos.*;

public class Principal {
    public static void main(String[] args) {
        
        SuperHeroe [] heroes = new SuperHeroe[5];
        heroes[0] = new CapitanAmerica();
        heroes[1] = new Hulk();
        heroes[2] = new Ironman();
        heroes[3] = new Spiderman();
        heroes[4] = new Thor();

        Villano [] villanos = new Villano[5];
        villanos[0] = new BlackDwarf();
        villanos[1] = new DuendeVerde();
        villanos[2] = new Guason();
        villanos[3] = new Thanos();
        villanos[4] = new Ultrol();

        GestorBatalla.batalla( heroes , villanos );

    }
}
