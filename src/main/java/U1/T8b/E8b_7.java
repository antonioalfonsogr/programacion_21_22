package U1.T8b;

import java.util.Scanner;

public class E8b_7 {
  public static void main(String[] args) {
    // Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número");
    long num = teclado.nextLong();

    long resto = num;
    long numAlReves = 0;

    while (num > 0) {
      resto = num % 10;
      num = num / 10;
      numAlReves = numAlReves * 10 + resto;
    }
    System.out.println(numAlReves);
  }
}
