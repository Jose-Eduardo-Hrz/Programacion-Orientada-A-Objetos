package Aplicacion;

import Interfaces.*;

public class GestorBatalla {

    public static void batalla( SuperHeroe [] superheroes , Villano [] villanos ){

        revolverArreglo( superheroes );
        revolverArreglo( villanos );

        int batallasGanadasSuperHeroes = 0;
        int batallasGanadasVillanos = 0;

        for( int i = 0 ; i < superheroes.length; i++){
            System.out.println( "\u001B[36mBatalla " + (i + 1) + "\u001B[0m");
            System.out.println( "\u001B[36mDescripcion SuperHeroe: \u001B[0m" + superheroes[i] );
            System.out.println( "\u001B[36mDescripcion Villano: \u001B[0m" + villanos[i] + "\n" );
            mostrarTabla( superheroes[i] , villanos[i] );
            if( pelea(superheroes[i] , villanos[i] ) ){
                System.out.println( "\u001B[36mGano el superheroe!!!\u001B[0m" );
                batallasGanadasSuperHeroes++;
            }else{
                System.out.println( "\u001B[36mGano el villano!!!\u001B[0m" );
                batallasGanadasVillanos++;
            }
            System.out.println("\n");
        }

        System.out.println( "\u001B[36mBatallas Ganadas de los superheroes: \u001B[0m" + batallasGanadasSuperHeroes );
        System.out.println( "\u001B[36mBatallas Ganadas de los villanos: \u001B[0m" + batallasGanadasVillanos + "\n" );

        System.out.println( ( batallasGanadasSuperHeroes > batallasGanadasVillanos ? "\u001B[36mGanaron los superheroes!!\u001B[0m" : "\u001B[36mGanaron los villanos!!\u001B[0m" ) );

    }

    private static void revolverArreglo( Object [] arreglo ){
        for( int i = 0 ; i < 100 ; i++ ){
            int posicion1 = (int) (Math.random() * (arreglo.length - 1 - 0 + 1) );
            int posicion2 = (int) (Math.random() * (arreglo.length - 1  - 0 + 1) );
            Object elemento =  arreglo[posicion1];
            arreglo[posicion1] = arreglo[posicion2];
            arreglo[posicion2] = elemento;
        }
    }

    private static void mostrarTabla( SuperHeroe superheroe , Villano villano ){
        System.out.println( "-".repeat(50) );
        System.out.println( String.format( "| %-20s | %-10s | %-10s |" , "" , "Heroe" , "Villano" ) );
        System.out.println( "-".repeat(50) );
        System.out.println( String.format( "| %-20s | %-10s | %-10s |" , "Ataque" , superheroe.valorAtaque() , villano.valorAtaque() ) );
        System.out.println( "-".repeat(50) );
        System.out.println( String.format( "| %-20s | %-10s | %-10s |" , "Defensa" , superheroe.valorDefensa() , villano.valorDefensa() ) );
        System.out.println( "-".repeat(50) );
        System.out.println( String.format( "| %-20s | %-10s | %-10s |" , "Experiencia/Maldad" , superheroe.valorExperiencia() , villano.valorMaldad() ) );
        System.out.println( "-".repeat(50) );
        System.out.println( String.format( "| %-20s | %-10s | %-10s |" , "Resistencia" , superheroe.valorResistencia() , villano.valorResistencia() ) );
        System.out.println( "-".repeat(50) );
        System.out.println();
    }

    public static boolean pelea( SuperHeroe superheroe , Villano villano ){
        int condicionSuperHeroe = superheroe.valorDefensa() + superheroe.valorResistencia();
        int condicionVillano = villano.valorDefensa() + villano.valorResistencia();

        if( superheroe.valorExperiencia() > villano.valorMaldad() ){
            do{
                condicionVillano = condicionVillano - superheroe.valorAtaque();
                if( condicionVillano <= 0 )
                    return true;
                condicionSuperHeroe = condicionSuperHeroe - villano.valorAtaque();
                if( condicionSuperHeroe <= 0 )
                    return false;
            }while( true );
        }else{
            do{
                condicionSuperHeroe = condicionSuperHeroe - villano.valorAtaque();
                if( condicionSuperHeroe <= 0 )
                    return false;
                condicionVillano = condicionVillano - superheroe.valorAtaque();
                if( condicionVillano <= 0 )
                    return true;
            }while( true );
        }
    }

}
