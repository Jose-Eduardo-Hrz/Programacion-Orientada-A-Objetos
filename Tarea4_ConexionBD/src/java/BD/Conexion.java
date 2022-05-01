package BD;

import java.sql.*;

public class Conexion {
    
    // Atributos de la clase Conexion
    private String URL;
    private String User;
    private String Password;
    private Connection con;
    
    // Constructor de la clase Conexion (los atributos se cargan de un archivo .properties)
    public Conexion(){
        URL = "jdbc:mysql://127.0.0.1:3306/Tarea4_Alumno";
        User = "Eduardo1";
        Password = "eduardo112233";
    }
    
    // Metodo para iniciar la conexion con la base de datos
    public Connection IniciarConexion() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection( URL, User, Password);
            return con;
        } catch (Exception e) {
            throw new Exception("Ocurrio un error cuando se conecto a la Base de datos!!!!");
        }
    }
    
    // Metodo para finalizar la conexion con la base de datos
    public void FinalizarConexion() throws Exception{
        try{
            con.close();
        }catch( Exception e ){
            throw new Exception("Ocurrio un error al cerrar la conexion con a la Base de datos!!!!");
        }
    }
    
}
