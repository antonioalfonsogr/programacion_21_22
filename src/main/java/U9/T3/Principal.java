package U9.T3;

public class Principal {
  public static void main(String[] args) {

    ADClassicModels adClassicModels = new ADClassicModels();

    System.out.println(adClassicModels.getEmpleados());

    System.out.println(adClassicModels.getOffices());

    ConexionBD.close();
  }
}
