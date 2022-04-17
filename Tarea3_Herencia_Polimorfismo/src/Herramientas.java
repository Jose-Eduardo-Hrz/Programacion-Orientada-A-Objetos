public class Herramientas {

  public static void mostrarTransportes(Transporte[] transportes) {
    System.out.println("\n--------------------------------------------------------------------------------");
    System.out.println(
        String.format(
            "%-10s%-10s%-30s%-15s%-15s",
            "Numero", "Placa", "Nombre", "Carga [ton]", "No. Asientos"));
    System.out.println("--------------------------------------------------------------------------------");
    for (int i = 0; i < transportes.length; i++) {
      System.out.println(String.format("%-10s", i) + transportes[i].toString());
      System.out.println("--------------------------------------------------------------------------------");
    }
  }

  public static void mostrarCostosTransporte(Transporte transporte) {
    System.out.println("\u001B[32m----------------------------------------------------------------------");
    System.out.println(
        String.format( "%-10s%-30s%-15s%-15s","Placa", "Nombre", "Carga [ton]", "No. Asientos" )
    );
    System.out.println("----------------------------------------------------------------------");
    System.out.println(transporte.toString());
    System.out.println("----------------------------------------------------------------------\u001B[0m\n");

    System.out.println("\u001B[32mPrecio base: \u001B[0m" + transporte.calculaPrecioBase());
    System.out.println("\u001B[32mPrecion Renta \u001B[0m" + transporte.calculaPrecioRenta());
  }

}
