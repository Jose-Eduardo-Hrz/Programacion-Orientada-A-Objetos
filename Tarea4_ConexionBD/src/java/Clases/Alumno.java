package Clases;

public class Alumno {
    
    // Atributos de la clase Alumno
    private String Matricula;
    private String Nombre;
    private String Correo;
    private String Carrera;
    
    public Alumno( String Matricula , String Nombre , String Correo , String Carrera){
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Carrera = Carrera;
    }

    // Metodos Getters de la Clase Alumno
    public String getMatricula() { return Matricula; }
    public String getNombre() { return Nombre; }
    public String getCorreo() { return Correo; }
    public String getCarrera() { return Carrera; } 
    
    // Metodos Setters de la Clase Alumno
    public void setMatricula(String Matricula) { this.Matricula = Matricula; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public void setCorreo(String Correo) { this.Correo = Correo; }
    public void setCarrera(String Carrera) { this.Carrera = Carrera; }
    
}
