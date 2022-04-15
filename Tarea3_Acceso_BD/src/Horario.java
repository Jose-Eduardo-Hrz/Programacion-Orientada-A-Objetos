public class Horario {

    // Atributos de la Clase Horario
    private int ClaveHorario;
    private String Materia;
    private String Dias;
    private String HoraInicio;
    private String HoraFin;
    private String Profesor;

    // Constructor de la Clase Horario
    public Horario( int ClaveHorario, String Materia, String Dias, String HoraInicio, String HoraFin, String Profesor){
        this.ClaveHorario = ClaveHorario;
        this.Materia = Materia;
        this.Dias = Dias;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Profesor = Profesor;
    }

    // Metodos Getters
    public int getClaveHorario() { return ClaveHorario; }
    public String getMateria() { return Materia; }
    public String getDias() { return Dias; }
    public String getHoraInicio() { return HoraInicio; }
    public String getHoraFin() { return HoraFin; }
    public String getProfesor() { return Profesor; }

    // Metodos Setters
    public void setClaveHorario(int claveHorario) { ClaveHorario = claveHorario; }
    public void setMateria(String materia) { Materia = materia; }
    public void setDias(String dias) { Dias = dias; }
    public void setHoraInicio(String horaInicio) { HoraInicio = horaInicio; }
    public void setHoraFin(String horaFin) { HoraFin = horaFin; }
    public void setProfesor(String profesor) { Profesor = profesor; }

    public String toString() {
        return String.format("%-7s %-30s %-35s %-13s %-10s %-40s", 
        getClaveHorario() , getMateria() , getDias(), getHoraInicio(), getHoraFin(), getProfesor() );
    }

}
