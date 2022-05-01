package InterfacesWeb;

import BD.CRUD;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registrar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {

            CRUD crud = new CRUD();
            crud.obtenerAlumnos();

            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");

                out.println("<html lang=\"en\">");

                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.println("<title>Registro</title>");
                out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"");
                out.println("integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
                out.println("</head>");

                out.println("<body class=\"bg-light\">");
                out.println("<div class=\"container mt-4\">");
                out.println("<h1> Registro </h1>");

                boolean resultado = crud.agregarAlumnos(
                        request.getParameter("RegistrarMatricula"),
                        request.getParameter("RegistrarNombre"),
                        request.getParameter("RegistrarCorreo"),
                        request.getParameter("RegistrarCarrera")
                );

                if (resultado) {
                    out.println("<div class=\"alert alert-success\" role=\"alert\">Se agrego un nuevo Alumno!!!</div>");
                } else {
                    out.println("<div class=\"alert alert-danger\" role=\"alert\">El alumno ya existe!!!</div>");
                }

                out.println("<a href=\"http://localhost:8080/Tarea4_ConexionBD/\"> Regresar al Inicio </a>");

                out.println("</div>");
                out.println("</body>");

                out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"");
                out.println("integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"");
                out.println("crossorigin=\"anonymous\"></script>");
                out.println("</html>");

            }
        } catch (Exception e) {
            try (PrintWriter out = response.getWriter()) {
                out.println("<h1>¡O no!, Ocurrio un error al mostrar a todos los alumnos en " + e + "</h1>");
                out.println("<a href=\"http://localhost:8080/Tarea4_ConexionBD/\"> Regresar al Inicio </a>");
            }   
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            System.err.println( "Ocurrio un error al registrar al alumno !!!" );
        }
    }

}
