package U1.U1_Entregable;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    // Escribe un programa que solicite al usuario los siguientes números:
    // Un número entero positivo
    // Un número entre 0 y 2 (ambos inclusive)
    // Una vez introducidos los dos números nos debe construir un número saltando las cifras según
    // indique el segundo número.

    Scanner teclado = new Scanner(System.in);

    int numIntroducido;

    System.out.println("Introduzca un número:");
    numIntroducido = teclado.nextInt();

    System.out.println("Introduzca el salto:");
    int salto = teclado.nextInt();

    int numDigitos = 0;
    int numParaDigitos = numIntroducido;
    while (numParaDigitos > 0) {
      numParaDigitos = numParaDigitos / 10;
      numDigitos++;
    }

    int numResultado = 0;
    int cociente = numIntroducido;
    int resto;
    int contador = 0;

    for (int i = 0; cociente > 0; i++) {

      // falta las condiciones de salto

      if (i < 0) {
        resto = cociente % 10;
        cociente = cociente / 10;
        numResultado = (int) (numResultado + resto * Math.pow(10, contador));
        contador++;
      } else {
        cociente = cociente / 10;
      }
    }
    System.out.println("Resultado: " + numResultado);
  }
}
