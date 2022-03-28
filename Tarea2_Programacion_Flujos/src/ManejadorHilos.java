import java.io.*;
import java.net.Socket;
import java.util.StringTokenizer;

public class ManejadorHilos implements Runnable {

  private Socket entrante;

  public ManejadorHilos(Socket cliente) {
    this.entrante = cliente;
  }

  public void run() {
    try {
      String requestMessage;
      String fileName;

      BufferedReader entradaDelCliente = new BufferedReader( new InputStreamReader(entrante.getInputStream()) );
      DataOutputStream salidaAlCliente = new DataOutputStream( entrante.getOutputStream() );

      requestMessage = entradaDelCliente.readLine();
      StringTokenizer tokenizedLine = new StringTokenizer(requestMessage);

      System.out.println( requestMessage );

      if (tokenizedLine.nextToken().equalsIgnoreCase("get")) {

        fileName = tokenizedLine.nextToken();

        if (fileName.startsWith("/") == true) 
            fileName = fileName.substring(1);

        File file = new File( "Archivos" , fileName);
        int numOfBytes = (int) file.length();
        FileInputStream archEntrada = new FileInputStream( file.getAbsolutePath() );

        byte[] fileInBytes = new byte[numOfBytes];
        archEntrada.read(fileInBytes);
        salidaAlCliente.writeBytes("HTTP/1.1 200 Document Follows\r\n");

        if (fileName.endsWith(".html")) 
            salidaAlCliente.writeBytes( "Content-Type:text/html\r\n" );

        if (fileName.endsWith(".jpeg")) 
            salidaAlCliente.writeBytes( "Content-Type:image/jpeg\r\n" );

        if (fileName.endsWith(".jpg")) 
            salidaAlCliente.writeBytes( "Content-Type:image/jpeg\r\n" );

        if (fileName.endsWith(".gif")) 
            salidaAlCliente.writeBytes( "Content-Type:image/gif\r\n" );

        if (fileName.endsWith(".mp4")) 
            salidaAlCliente.writeBytes( "Content-Type:video/mp4\r\n" );

        salidaAlCliente.writeBytes("Content-Length: " + numOfBytes + "\r\n");
        salidaAlCliente.writeBytes("\r\n");
        salidaAlCliente.write(fileInBytes, 0, numOfBytes);

        entrante.close();
        archEntrada.close();
      }
    } catch (Exception e) {
        System.out.println( e );
    }
  }
}
