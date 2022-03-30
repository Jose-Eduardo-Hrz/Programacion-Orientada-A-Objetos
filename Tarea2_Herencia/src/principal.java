import java.util.Scanner;

public class principal{
    public static void main(String[] args) {

        Animal [] animales = new Animal[5];

        animales[0] = new Anfibio("Nombre", "tipoPiel", "tipoRespiracion", "tipoReproduccion", "habitad", "colorPiel");
        animales[1] = new Ave("Nombre", "tipoPiel", "tipoRespiracion", "tipoReproduccion", "habitad", true);
        animales[2] = new Mamifero("Nombre", "tipoPiel", "tipoRespiracion", "tipoReproduccion", "habitad", false);
        animales[3] = new Pez("Nombre", "tipoPiel", "tipoRespiracion", "tipoReproduccion", "habitad", 3);
        animales[4] = new Reptil("Nombre", "tipoPiel", "tipoRespiracion", "tipoReproduccion", "habitad", false);

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