import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );

        System.out.println("\u001B[36mCuantos Circulos vas a agregar? \u001B[0m");
        int numCirculos = Integer.parseInt( entrada.nextLine() );

        System.out.println("\u001B[36mCuantos Cuadrados vas a agregar? \u001B[0m");
        int numCuadrados = Integer.parseInt( entrada.nextLine() );

        System.out.println("\u001B[36mCuantos Triangulos vas a agregar? \u001B[0m");
        int numTriangulos = Integer.parseInt( entrada.nextLine() );

        Figura [] figurasGeometricas = new Figura[ numCirculos + numCuadrados + numTriangulos ];

        int pos = 0;

        System.out.println( "\u001B[36mAgrega los " + numCirculos + " Circulos colocando en cada lina [tam del radio]:\u001B[0m" );
        for( int i = 0 ; i < numCirculos ; i++ ){
            figurasGeometricas[pos] = new Circulo( Integer.parseInt( entrada.nextLine() ) );
            pos++;
        }

        System.out.println( "\u001B[36mAgrega los " + numCuadrados+ " Cuadrados colocando en cada lina [tam lado]:\u001B[0m" );
        for( int i = 0 ; i < numCirculos ; i++ ){
            figurasGeometricas[pos] = new Cuadrado( Integer.parseInt( entrada.nextLine() ) );
            pos++;
        }

        System.out.println( "\u001B[36mAgrega los " + numTriangulos+ " Tringulos colocando en cada lina [tam base] [tam altura]:\u001B[0m" );
        for( int i = 0 ; i < numCirculos ; i++ ){
            figurasGeometricas[pos] = new Triangulo( 
                Integer.parseInt( entrada.next()), 
                Integer.parseInt( entrada.next()) 
            );
            pos++;
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.format("%-20s %-15s %-15s\n" , "Figura", "Area" , "Perimetro" );
        System.out.println("-----------------------------------------------------");
        for( Figura f : figurasGeometricas ){
            System.out.println( f.mostrarInformacion() );
            System.out.println("-----------------------------------------------------");
        }
        System.out.println();
    }
}