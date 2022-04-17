import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    // Arreglo para almacenar los transportes
    Transporte[] transportes = new Transporte[4];

    // Crear transportes que se van a gestionar y rentar
    transportes[0] = new Veiculo(4, "523-WDF", "Audi A4");
    transportes[1] = new Camioneta(5, "569-WER", "Chevrolet Pick Up Silverado");
    transportes[2] = new Camion(15, "987-6GH", "Ford F350");
    transportes[3] = new Microbus(15, "BB-25P", "Chevrolet Alfa 30");

    Scanner entrada = new Scanner(System.in);
    int opcion = 0;

    Herramientas.mostrarTransportes(transportes);
    do {
      System.out.println("\n\u001B[33mProporcione el numero de trasporte que decea rentar o -1 para salir:\u001B[0m");
      opcion = Integer.parseInt(entrada.nextLine());

      if (opcion >= 0 & opcion < transportes.length)
        Herramientas.mostrarCostosTransporte(transportes[opcion]);
      else if (opcion == -1)
        System.out.println("\u001B[33mAdios !!!\u001B[0m");
      else
        System.out.println("\u001B[33mEl trasnporte no se encuntra registrado !!!\u001B[0m");
    } while (opcion != -1);

  }

}