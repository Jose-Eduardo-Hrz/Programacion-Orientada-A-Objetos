import java.io.*;
import java.util.Properties;
import java.sql.*;

public class Conexion {
    
    // Atributos de la clase Conexion
    private String URL;
    private String User;
    private String Password;
    private Connection con;
    
    // Constructor de la clase Conexion (los atributos se cargan de un archivo .properties)
    public Conexion() throws FileNotFoundException, IOException{
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader("Configuracion.properties")));
        URL = properties.getProperty("URL");
        User = properties.getProperty("User");
        Password = properties.getProperty("Password");
    }
    
    // Metodo para iniciar la conexion con la base de datos
    public Connection IniciarConexion() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection( URL, User, Password);
        return con;
    }
    
    // Metodo para finalizar la conexion con la base de datos
    public void FinalizarConexion() throws SQLException{
        con.close();
    }
    
}
