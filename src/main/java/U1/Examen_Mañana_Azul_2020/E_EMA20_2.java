package U1.Examen_Mañana_Azul_2020;

import java.util.Scanner;

public class E_EMA20_2 {
  public static void main(String[] args) {
    // Realizar un programa que solicite al usuario un número entero y que lo siga solicitando
    // mientras ese número no sea positivo.
    // Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y
    // mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
    // (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera
    // posición es la posición 0.)

    Scanner teclado = new Scanner(System.in);

    int numIntroducido;

    do {
      System.out.println("Introduce el número:");
      numIntroducido = teclado.nextInt();
    } while (numIntroducido <= 0);

    System.out.println("Posición inicial:");
    int posicionInicial = teclado.nextInt();

    System.out.println("Posición final:");
    int posicionFinal = teclado.nextInt();

    int numDigitos = 0;
    int numParaDigitos = numIntroducido;
    while (numParaDigitos > 0) {
      numParaDigitos = numParaDigitos / 10;
      numDigitos++;
    }

    int numResultado = 0;
    int cociente = numIntroducido;
    int resto = 0;
    int contador = 0;

    for (int i = 0; cociente > 0; i++) {

      if (i < ((numDigitos - posicionFinal) - 1) || i > ((numDigitos - posicionInicial) - 1)) {
        resto = cociente % 10;
        cociente = cociente / 10;
        numResultado = (int) (numResultado + resto * Math.pow(10, contador));
        contador++;
      } else {
        cociente = cociente / 10;
      }
    }
    System.out.println("El número resultante es: " + numResultado);
  }
}
