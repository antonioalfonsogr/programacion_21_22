package U1.T5;

import java.util.Scanner;

// Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de
// "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo). Nota: si el valor del
// tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

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
