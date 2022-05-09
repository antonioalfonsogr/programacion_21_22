package U9.T2;

public class Principal {
  public static void main(String[] args) {

    ConexionBD.getConnection();

    ConexionBD.close();
  }
}
