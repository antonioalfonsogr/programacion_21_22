package U1.Entregable_1920;

import java.util.Scanner;

public class E_1920_2 {
  public static void main(String[] args) {
    // Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los
    // números capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números
    // de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se
    // dará por bueno. Se recomienda usar long en lugar de int ya que el primero admite números más
    // largos.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    long num = teclado.nextLong();

    long cociente = num;
    long resto = 0;
    long numAlReves = 0;

    while (cociente > 0) {

      resto = cociente % 10;
      cociente = cociente / 10;
      numAlReves = numAlReves * 10 + resto;
    }
    if (num == numAlReves) {
      System.out.println(num + " es capicúa");
    } else {
      System.out.println(num + " NO es capicúa");
    }
  }
}
