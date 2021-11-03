package U1.Entregable_2021_Tarde;

import java.util.Scanner;

public class E_2021T_2 {
  public static void main(String[] args) {
    // Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    // hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    // primero admite números más largos.
    //
    // Ejemplo 1:
    // Por favor, introduzca un número entero positivo: 406783
    // El 406783 contiene 4 dígitos pares y 2 dígitos impares.
    //
    // Ejemplo 2:
    // Por favor, introduzca un número entero positivo: 3177840
    // El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo:");
    long num = teclado.nextLong();

    long cociente = num;
    long resto;
    int contadorPares = 0;
    int contadorImpares = 0;

    while (cociente > 0) {
      resto = cociente % 10;
      cociente = cociente / 10;
      if (resto % 2 == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }
    }
    System.out.println(
        "El "
            + num
            + " contiene "
            + contadorPares
            + " dígitos pares y "
            + contadorImpares
            + " dígitos impares");
  }
}
