import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) 
        throws ClassNotFoundException, IOException, SQLException {
        
            UtileriasHorarios crud = new UtileriasHorarios();
            crud.obtenerHorarios();

            Scanner entrada = new Scanner( System.in );
            int Opcion = 0;
            do{
                System.out.println("\u001B[33mSelecciona una Opcion:");
                System.out.println(" 1. Mostrar Horarios Almacenados");
                System.out.println(" 2. Almacenar Horario");
                System.out.println(" 3. Eliminar un horario");
                System.out.println(" 4. Mostrar un Horario");
                System.out.println(" 5. Salir\u001B[0m");

                Opcion = Integer.parseInt( entrada.nextLine() );

                switch (Opcion) {
                    case 1:
                        crud.mostrarHorarios();
                        break;
                    case 2:
                        System.out.println( "\u001B[33mProporcione el nombre de la Materia:\u001B[0m" );
                        String nombreMateria = entrada.nextLine();
                        System.out.println( "\u001B[33mProporcione los dias que se imparte [Lunes, Martes, ...]:\u001B[0m" );
                        String Dias = entrada.nextLine();
                        System.out.println( "\u001B[33mProporcione la hora de inicio [00:00]:\u001B[0m" );
                        String horaInicio = entrada.nextLine();
                        System.out.println( "\u001B[33mProporcione la hora de termino [00:00]:\u001B[0m" );
                        String horaFin = entrada.nextLine();
                        System.out.println( "\u001B[33mProporcione el nombre del profesor:\u001B[0m" );
                        String nombreProfesor = entrada.nextLine();
                        crud.agregarHorario(nombreMateria, Dias, horaInicio, horaFin, nombreProfesor);
                        break;
                    case 3:
                        System.out.println( "\u001B[33mProporcione la Clave de la materia:\u001B[0m" );
                        int Clave1 = Integer.parseInt( entrada.nextLine() );
                        crud.eliminarHorario(Clave1);
                        break;
                    case 4:
                        System.out.println( "\u001B[33mProporcione la Clave de la materia:\u001B[0m" );
                        int Clave2 = Integer.parseInt( entrada.nextLine() );
                        crud.buscarHorario(Clave2);
                        break;
                    case 5:
                        System.out.println("\u001B[33mAdios!!!\u001B[0m");
                        break;
                    default:
                        System.out.println( Opcion + " \u001B[33mNo esta contemplada!!!\u001B[0m" );
                        break;
                }

            }while( Opcion != 5 );

    }
}