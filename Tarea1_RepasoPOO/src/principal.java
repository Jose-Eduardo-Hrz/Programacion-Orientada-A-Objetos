package src;

import java.util.ArrayList;
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );
        int numAnimales = Integer.parseInt( entrada.nextLine() );
        ArrayList<Animal> Zoologico = new ArrayList<Animal>();

        for( int i = 0 ; i < numAnimales ; i++ ){
            Zoologico.add( 
                new Animal( 
                    entrada.nextLine(),  entrada.nextLine(), Integer.parseInt( entrada.nextLine() ), 
                    Integer.parseInt( entrada.nextLine() ), entrada.nextLine(), entrada.nextLine() 
                ) 
            );
        }

        System.out.println("\nAnimales obtenidos:");
        ImprimirZoologico(Zoologico);

        for( int i = 0 ; i < Zoologico.size() ; i++ ){
            Zoologico.get(i).setNumeroJaula(0);
            Zoologico.get(i).setDescripcion("");
            Zoologico.get(i).setTipoReproduccion("");
        }

        System.out.println("\nAnimales modificados:");
        ImprimirZoologico(Zoologico);

        entrada.close();
    }

    public static void ImprimirZoologico( ArrayList<Animal> Zoologico ){
        System.out.println( "\u001B[36m--------------------------------------------------------------------------------------------------------------------" );
        System.out.format("%20s %30s %10s %10s %20s %20s", "NOMBRE", "DESCRIPCION", "EDAD", "JAULA", "ALIMENTACION", "REPRODUCCION");
        System.out.println( "\n--------------------------------------------------------------------------------------------------------------------" );
        for( Animal animal : Zoologico ){
            System.out.println( animal.toString() );
        }
        System.out.println( "--------------------------------------------------------------------------------------------------------------------\u001B[0m" );
    }

} 
