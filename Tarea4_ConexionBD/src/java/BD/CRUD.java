package BD;

import Clases.Alumno;
import java.sql.*;
import java.util.ArrayList;

public class CRUD {

    private ArrayList<Alumno> alumnos;

    public CRUD() {
        alumnos = new ArrayList< Alumno>();
    }

    // Metodo que permite agregar un nuevo horario en la Base de datos
    public boolean agregarAlumnos(String Matricula, String Nombre, String Correo, String Carrera) throws Exception {
        // Se verifica si existe el Alumno
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equalsIgnoreCase(Matricula)
                    & alumno.getNombre().equalsIgnoreCase(Nombre)
                    & alumno.getCorreo().equalsIgnoreCase(Correo)) {
                return false;
            }
        }

        try {
            // Se realiza la conexion con la base de datos
            Conexion conexion = new Conexion();
            // Utilizando la conexion de la base de datos, se ingresa codigo SQL
            PreparedStatement st = conexion
                    .IniciarConexion()
                    .prepareStatement("INSERT INTO Alumno VALUES(0,?,?,?,?)");
            // Se agrega los parametros para el codigo SQL
            st.setString(1, Matricula);
            st.setString(2, Nombre);
            st.setString(3, Correo);
            st.setString(4, Carrera);
            // Se envia el codigo SQL y se espera el resultado de la Base de datos
            int insert = st.executeUpdate();
            // Si se obtiene un resultado positivo de la BD, se agrego correctamente los datos
            conexion.FinalizarConexion();
            if (insert > 0) {
                // Se obtiene los datos actuales de la BD
                obtenerAlumnos();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ocurrio un error al agregar un alumno !!!!");
            return false;
        }
    }

    public boolean modificarAlumno(String Matricula, String Nombre, String Correo, String Carrera) throws Exception {
        try {
            // Se verifica si existe el Alumno
            boolean noExiste = true;
            for (Alumno alumno : alumnos) {
                if (alumno.getMatricula().equalsIgnoreCase(Matricula)) {
                    noExiste = false;
                    break;
                }
            }
            if ( noExiste ) {
                return false;
            }
            System.out.println("Sigue");
            // Se realiza la conexion con la base de datos
            Conexion conexion = new Conexion();
            // Utilizando la conexion de la base de datos, se ingresa codigo SQL
            PreparedStatement st = conexion
                    .IniciarConexion()
                    .prepareStatement("UPDATE Alumno SET Nombre = ? , Correo = ?, Carrera = ? WHERE Matricula = ?");
            // Se agrega los parametros para el codigo SQL
            st.setString(1, Nombre);
            st.setString(2, Correo);
            st.setString(3, Carrera);
            st.setString(4, Matricula);
            // Se envia el codigo SQL y se espera el resultado de la Base de datos
            int modificar = st.executeUpdate();
            // Si se obtiene un resultado positivo de la BD, se agrego correctamente los datos
            conexion.FinalizarConexion();
            if (modificar > 0) {
                // Se obtiene los datos actuales de la BD
                obtenerAlumnos();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ocurrio un error al modificar al alumno !!!!");
            return false;
        }
    }

    public ArrayList<Alumno> mostrarAlumnos() {
        return alumnos;
    }

    public Alumno mostrarAlumno(String Matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equalsIgnoreCase(Matricula)) {
                return alumno;
            }
        }
        return null;
    }

    // Metodo que permite obtener los alumnos de la Base de datos
    public void obtenerAlumnos() throws Exception {
        try {
            // Se realiza la conexion con la base de datos
            Conexion conexion = new Conexion();
            // Se envia el codigo SQL y se espera el resultado de la Base de datos
            ResultSet result = conexion
                    .IniciarConexion().createStatement().executeQuery("SELECT * FROM Alumno");
            // Se limpia los datos anteriores almacenados
            alumnos.clear();
            // Se agregan los nuevos datos de la Base de Datos
            while (result.next()) {
                alumnos.add(new Alumno(result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ocurrio un error al obtener un alumno !!!");
        }
    }

}
