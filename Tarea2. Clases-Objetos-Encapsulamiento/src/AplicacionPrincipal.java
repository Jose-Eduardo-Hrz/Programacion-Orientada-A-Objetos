import java.util.Scanner;

public class AplicacionPrincipal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Persona[] personas = new Persona[10];

        System.out.println( "-".repeat(45) + "\nSeccion para instanciar a los profesores\n" + "-".repeat(45));
        for( int i = 0 ; i < personas.length/2 ; i++ ){
            System.out.println( "Proporcione los datos del profesor ( nombre, edad, [Hombre|Mujer] ):" );
            personas[i] = new Persona( in.next() , in.nextInt(), in.next(), "Profesor");
        }

        System.out.println( "-".repeat(45) + "\nSeccion para instanciar a los alumnos\n" + "-".repeat(45));
        for( int i = personas.length/2 ; i < personas.length ; i++ ){
            System.out.println( "Proporcione los datos del Alumno ( nombre, edad, [Hombre|Mujer] ):" );
            personas[i] = new Persona( in.next() , in.nextInt(), in.next(), "Alumno");
        }

        System.out.println( "-".repeat(45) + "\nSeccion para instanciar los utiles escolares\n" + "-".repeat(45));
        UtilEscolar[] utilEscolar = new UtilEscolar[4];
        for( int i = 0 ; i < utilEscolar.length ; i++ ){
            System.out.println( "Proporcione los datos del util escolar ( nombre ):" );
            utilEscolar[i] = new UtilEscolar( in.next() );
        }
        
        System.out.println( "-".repeat(45) + "\nSeccion para instanciar a los muebles\n" + "-".repeat(45));
        Mueble[] muebles = new Mueble[10];
        for( int i = 0 ; i < muebles.length ; i++ ){
            System.out.println( "Proporcione los datos del util escolar ( nombre , tipoMaterial ):" );
            muebles[i] = new Mueble( in.next() , in.next() );
        }

        System.out.println( "-".repeat(45) + "\nSeccion para instanciar una Escuela\n" + "-".repeat(45));
        Escuela escuela = new Escuela( 
            in.nextLine() , 
            in.nextLine() , 
            new Persona[]{ personas[0] , personas[2] , personas[4] } , 
            new Persona[]{ personas[6] , personas[7] , personas[8] }, 
            new UtilEscolar[]{ utilEscolar[0] , utilEscolar[2] }, 
            new Mueble[]{ muebles[0] , muebles[3] , muebles[5] , muebles[7] , muebles[9] }
        );

        System.out.println( escuela.toString() );

    }
}
