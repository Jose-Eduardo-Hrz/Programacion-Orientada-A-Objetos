import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class UtileriasHorarios {

    private ArrayList<Horario> horarios;

    public UtileriasHorarios() {
        horarios = new ArrayList<>();
    }

    // Metodo que permite agregar un nuevo horario en la Base de datos
    public void agregarHorario( String Materia, String Dias, String HoraInicio, String HoraFin, String Profesor)
            throws IOException, ClassNotFoundException, SQLException {
        // Se verifica si existe el Horario
        for( Horario horario : horarios ){
            if( horario.getMateria().equalsIgnoreCase( Materia ) & 
                horario.getProfesor().equalsIgnoreCase( Profesor ) & 
                horario.getDias().equalsIgnoreCase( Dias )){
                    System.out.println( "\n\u001B[33mEl Horario ya existe!!\u001B[0m\n" );
                    return;
            }
        }
        // Se realiza la conexion con la base de datos
        Conexion conexion = new Conexion();
        // Utilizando la conexion de la base de datos, se ingresa codigo SQL
        PreparedStatement st = conexion
                .IniciarConexion()
                .prepareStatement("INSERT INTO Horario VALUES(0,?,?,?,?,?)");
        // Se agrega los parametros para el codigo SQL
        st.setString(1, Materia);
        st.setString(2, Dias);
        st.setString(3, HoraInicio);
        st.setString(4, HoraFin);
        st.setString(5, Profesor);
        // Se envia el codigo SQL y se espera el resultado de la Base de datos
        int insert = st.executeUpdate();
        // Si se obtiene un resultado positivo de la BD, se agrego correctamente los datos
        if (insert > 0) {
            System.out.println("\n\u001B[33mSe agrego un nuevo horario!!!\u001B[0m\n");
        }
        // Al finalizar las senencias SQL, se cierra la conexion por seguridad
        conexion.FinalizarConexion();
        // Se obtiene los datos actuales de la BD
        obtenerHorarios();
    }

    // Metodo que permite eliminar un horario en la Base de datos
    public void eliminarHorario(int ClaveHorario)
            throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        boolean noExiste = true;
        // Se verifica si existe el Horario
        for( Horario horario : horarios ){
            if( horario.getClaveHorario() == ClaveHorario){
                noExiste = false;
                break;
            }
        }
        if( noExiste ){
            System.out.println("\u001B[33mEl Horario con la Clave " + ClaveHorario + " no existe!!!\u001B[0m");
            return;
        }
        // Se realiza la conexion con la base de datos
        Conexion conexion = new Conexion();
        // Utilizando la conexion de la base de datos, se ingresa codigo SQL
        PreparedStatement st = conexion
                .IniciarConexion()
                .prepareStatement("DELETE FROM Horario WHERE ClaveHorario=?");
        // Se agrega los parametros para el codigo SQL
        st.setLong(1, ClaveHorario);
        // Se envia el codigo SQL y se espera el resultado de la Base de datos
        int insert = st.executeUpdate();
        // Si se obtiene un resultado positivo de la BD, se elimino correctamente los datos
        if (insert > 0)
            System.out.println("\n\u001B[33mSe elimino el horario!!!\u001B[0m\n");
        // Al finalizar las senencias SQL, se cierra la conexion por seguridad
        conexion.FinalizarConexion();
        // Se obtiene los datos actuales de la BD
        obtenerHorarios();
    }

    // Metodo que permite mostrar los horarios de la Base de datos
    public void mostrarHorarios(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.format( "%-7s %-30s %-35s %-13s %-10s %-40s", 
        "Clave" , "Materia" , "Dias" , "Hora Inicio" , "Hora Fin" , "Profesor" );
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------");
        for( Horario horario : horarios ){
            System.out.println( horario.toString() );
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------\n");
        }
        System.out.println("");
    }

    // Metodo que permite mostrar los horarios de la Base de datos
    public void obtenerHorarios()
            throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        // Se realiza la conexion con la base de datos
        Conexion conexion = new Conexion();
        // Se envia el codigo SQL y se espera el resultado de la Base de datos
        ResultSet result = conexion
                .IniciarConexion() .createStatement() .executeQuery("SELECT * FROM Horario");
        // Se limpia los datos anteriores almacenados
        horarios.clear();
        // Se agregan los nuevos datos de la Base de Datos
        while (result.next()) {
            horarios.add(
                new Horario( 
                    result.getInt(1),
                    result.getString(2), 
                    result.getString(3), 
                    result.getString(4), 
                    result.getString(5), 
                    result.getString(6)
                )
            );
        }
    }

    // Metodo que permite mostrar un horario en la Base de datos
    public void buscarHorario(int ClaveHorario)
        throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
            for( Horario horario : horarios ){
                if( horario.getClaveHorario() == ClaveHorario ){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.format( "%-7s %-30s %-35s %-13s %-10s %-40s", 
                    "Clave" , "Materia" , "Dias" , "Hora Inicio" , "Hora Fin" , "Profesor" );
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println( horario.toString() );
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------\n");
                    return;
                }
            }
            System.out.println( "\n\u001B[33mEl horario no esta registrado!!!\u001B[0m\n" );
    }

}
