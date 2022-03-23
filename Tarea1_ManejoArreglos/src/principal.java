package Tarea1_ManejoArreglos.src;

import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        
        // Variable entrada que permite obtener datos en un flujo de entrada en consola
        Scanner entrada = new Scanner( System.in );

        // Se obtiene el tamaño del arreglo y se almacena en la variable tamArreglo
        int tamArreglo = Integer.parseInt( entrada.nextLine() );

        // Arreglo de tipo String que almacena nombres
        String nombres [] = new String[ tamArreglo ];

        // Ciclo que permite obtener los nombres
        for( int i = 0 ; i < tamArreglo ; i++ ){
            nombres[i] = entrada.nextLine();
        }

        // Ciclo que permite imprimir los nombres del arreglo
        for( String nombre : nombres ){
            System.out.println( nombre );
        }
        System.out.println();

        // Variable que almacena el nombre con menor número de caracteres
        // (Al inicio se indica la posicion 0 del arreglo para tener un comparador)
        String menorCaracteres = nombres[0];

        // Ciclo que permite obtener el nombre con menor caracteres
        System.out.println( "Arreglo con valores: " );
        for( int i = 1 ; i < tamArreglo ; i++ ){
            menorCaracteres = ( nombres[i].length() < menorCaracteres.length() ? nombres[i] : menorCaracteres );
        }

        // Variable que almacena el nombre con mayor número de caracteres
        // (Al inicio se indica la posicion 0 del arreglo para tener un comparador)
        String mayorCaracteres = nombres[0];

        // Ciclo que permite obtener el nombre con menor caracteres
        for( int i = 1 ; i < tamArreglo ; i++ ){
            mayorCaracteres = ( nombres[i].length() > mayorCaracteres.length() ? nombres[i] : mayorCaracteres );
        }

        // Ordenar arreglo alfabeticamente
        int tamArregloDes = tamArreglo;
        for( int i = 0 ; i < tamArreglo ; i++ ){
            for( int ele1 = 0 , ele2 = 1 ; ele2 < tamArregloDes ; ele1++ , ele2++ ){
                if( nombres[ele1].compareToIgnoreCase(nombres[ele2]) > 0 ){
                    String cambio = nombres[ele1];
                    nombres[ele1] = nombres[ele2];
                    nombres[ele2] = cambio;
                }
            }
            tamArregloDes--;
        }

        // Seccion para mostrar los resultados
        System.out.println( "El nombre con menor caracteres es: " + menorCaracteres );
        System.out.println( "El nombre con menor caracteres es: " + mayorCaracteres + "\n" );

        System.out.println( "Arreglo ordenado alfabeticamente: " );
        for( String nombre : nombres ){
            System.out.println( nombre );
        }

        entrada.close();

    }
}