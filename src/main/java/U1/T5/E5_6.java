package U1.T5;

import java.util.Scanner;

public class E5_6 {
  public static void main(String[] args) {
    final float gravedad = 9.8f;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intoduzca un tiempo");
    double tiempo = teclado.nextDouble();
    if (tiempo <= 0) {
      System.out.println("Tiempo incorrecto");
    } else {
      double velocidad = gravedad * tiempo;
      System.out.println("La velocidad es " + velocidad);
    }
  }
}
