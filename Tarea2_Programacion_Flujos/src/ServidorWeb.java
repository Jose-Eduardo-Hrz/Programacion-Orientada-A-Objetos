import java.io.*;
import java.net.*;

public class ServidorWeb{
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(8000);
            System.out.println("Servidor Corriendo en el puerto 8000");
            int hilo = 0;
            while(true){
                Socket cliente = servidor.accept();
                System.out.println("Generando nuevo hilo " + hilo);
                Runnable r = new ManejadorHilos(cliente);
                Thread t = new Thread(r);
                t.start();
                hilo++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}