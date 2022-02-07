package U5.T1.A4;

public class PrincipalHoraExacta4 {
  public static void main(String[] args) {
    HoraExacta4 he41 = new HoraExacta4(10, 10, 10);
    HoraExacta4 he42 = new HoraExacta4(20, 20, 20);
    HoraExacta4 he43 = new HoraExacta4(10, 10, 10);

    System.out.println("Hora número 1: " + he41);
    System.out.println("Hora número 2: " + he42);
    System.out.println("Hora número 1: " + he43);

    System.out.println();

    if (he41.equals(he42)) {
      System.out.println("La hora número 1 y 2 son iguales");
    } else System.out.println("La hora número 1 y 2 son distintas");

    System.out.println();

    if (he41.equals(he43)) {
      System.out.println("La hora número 1 y 3 son iguales");
    } else System.out.println("La hora número 1 y 3 son distintas");
  }
}
