import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        
        // Variable entrada que permite obtener datos en un flujo de entrada en consola
        Scanner entrada = new Scanner( System.in );

        // Se obtiene el tamaño del arreglo y se almacena en la variable tamArreglo
        System.out.println("\u001B[33mIndica cuantos nombres quieres registrar:\u001B[0m");
        int tamArreglo = Integer.parseInt( entrada.nextLine() );
        System.out.println();

        // Arreglo de tipo String que almacena nombres
        String nombres [] = new String[ tamArreglo ];

        System.out.println("\u001B[33mProporciona los " + tamArreglo + " nombres: \u001B[0m");
        // Ciclo que permite obtener los nombres
        for( int i = 0 ; i < tamArreglo ; i++ ){
            nombres[i] = entrada.nextLine();
        }
        System.out.println();

        // Metodo que permite imprimir los nombres del arreglo
        imprimirArreglo(nombres);

        // Variable que almacena el nombre con menor número de caracteres
        // (Al inicio se indica la posicion 0 del arreglo para tener un comparador)
        String menorCaracteres = nombres[0];

        // Variable que almacena el nombre con mayor número de caracteres
        // (Al inicio se indica la posicion 0 del arreglo para tener un comparador)
        String mayorCaracteres = nombres[0];

        // Ciclo que permite obtener el nombre con menor caracteres y mayor caracteres
        for( int i = 1 ; i < tamArreglo ; i++ ){
            menorCaracteres = ( nombres[i].length() < menorCaracteres.length() ? nombres[i] : menorCaracteres );
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
        System.out.println( "\u001B[33mEl nombre con menor caracteres es: \u001B[0m" + menorCaracteres );
        System.out.println( "\u001B[33mEl nombre con menor caracteres es: \u001B[0m" + mayorCaracteres + "\n" );

        // Metodo que permite imprimir los nombres del arreglo
        imprimirArreglo(nombres);

        entrada.close();

    }

    // Metodo para imprimir los datos del arreglo
    public static void imprimirArreglo( String nombres [] ){
        System.out.println( "\u001B[33mNombres almacenados en el arreglo: \u001B[0m" );
        for( String nombre : nombres ){
            System.out.print( nombre + " " );
        }
        System.out.println('\n');
    }

}
