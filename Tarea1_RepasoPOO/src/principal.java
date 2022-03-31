import java.util.Scanner;

public class principal{
    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );

        System.out.println("Indica el numero de animales anfibios:");
        int numAnfibios = Integer.parseInt(entrada.nextLine());

        System.out.println("Indica el numero de animales que son aves:");
        int numAves = Integer.parseInt(entrada.nextLine());

        System.out.println("Indica el numero de animales mamiferos:");
        int numMamiferos = Integer.parseInt(entrada.nextLine());

        System.out.println("Indica el numero de animales que son peces:");
        int numPeces = Integer.parseInt(entrada.nextLine());

        System.out.println("Indica el numero de reptiles:");
        int numReptiles = Integer.parseInt(entrada.nextLine());

        int numTotalAnimales = numAnfibios + numAves + numMamiferos + numPeces + numReptiles;

        Animal [] animales = new Animal[ numTotalAnimales ];

        int i = 0;

        System.out.println( "Proporcione los animales anfibios de la siguiente manera:" );
        System.out.println( "\u001B[36m [Nombre: String] [tipoPiel: String] [tipoRespiracion: String] [tipoReproduccion: String] [habitad]: String [colorPiel: String] \u001B[0m" );
        for( int j = 0 ; j < numAnfibios ; j++ ){
            animales[i] = new Anfibio( entrada.next() , entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next());
            i++;
        }

        System.out.println( "Proporcione las aves de la siguiente manera:" );
        System.out.println( "\u001B[36m [Nombre: String] [tipoPiel: String] [tipoRespiracion: String] [tipoReproduccion: String] [habitad: String] [vuela: boolean]\u001B[0m" );
        for( int j = 0 ; j < numAnfibios ; j++ ){
            animales[i] = new Ave(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), Boolean.parseBoolean(entrada.next()));
            i++;
        }

        System.out.println( "Proporcione los animeles mamiferos de la siguiente manera:" );
        System.out.println( "\u001B[36m [Nombre: String] [tipoPiel: String] [tipoRespiracion: String] [tipoReproduccion: String] [habitad: String] [terrestre: boolean]\u001B[0m" );
        for( int j = 0 ; j < numAnfibios ; j++ ){
            animales[i] = new Mamifero(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), Boolean.parseBoolean(entrada.next()));
            i++;
        }

        System.out.println( "Proporcione los peces de la siguiente manera:" );
        System.out.println( "\u001B[36m [Nombre: String] [tipoPiel: String] [tipoRespiracion: String] [tipoReproduccion: String] [habitad: String] [numeroOjos: int]\u001B[0m" );
        for( int j = 0 ; j < numAnfibios ; j++ ){
            animales[i] = new Pez(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), Integer.parseInt(entrada.next()));
            i++;
        }

        System.out.println( "Proporcione los reptiles de la siguiente manera:" );
        System.out.println( "\u001B[36m [Nombre: String] [tipoPiel: String] [tipoRespiracion: String] [tipoReproduccion: String] [habitad: String] [tienePatas: boolean]\u001B[0m" );
        for( int j = 0 ; j < numAnfibios ; j++ ){
            animales[i] = new Reptil(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), Boolean.parseBoolean(entrada.next()));
            i++;
        }

        pintarTabla(animales);
    }

    public static void pintarTabla( Animal [] animales ){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-10s %-10s %-10s %-10s %-10s\n", 
            "NOMBRE", "TIPO PIEL", "TIPO RESPIRACION", "TIPO REPRODUCCION", "HABITAD", 
            "COLOR PIEL", "VUELA", "TERRESTRE", "NUM OJOS", "PATAS"
        );
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for( int i = 0 ; i < animales.length ; i++ ){
            System.out.println( animales[i].toString() );
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
