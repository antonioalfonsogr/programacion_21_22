package U1.T8;

import java.util.Scanner;

public class E8_3 {
  public static void main(String[] args) {
    // Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir
    // probando números tratando de acertarlo. El programa debe indicar "mayor" o "menor" según el
    // número secreto sea mayor o menor que el introducido por el usuario. El proceso finaliza
    // cuando el usuario acierta o cuando se rinde (introduciendo un -1).

    Scanner teclado = new Scanner(System.in);
    int numSecreto;
    numSecreto = (int) (1 + (Math.random() * 100));
    System.out.println(
        "Intenta acertar el numero secreto entre 1 y 100 (para rendirte introduce -1)");
    int numJugador = 0;
    do {
      numJugador = teclado.nextInt();
      if (numJugador == (-1)) {
        break;
      }
      if (numJugador == numSecreto) {
        System.out.println("Has acertado, el numero secreto es " + numSecreto);
      } else if (numSecreto > numJugador) {
        System.out.println("mayor");
      } else {
        System.out.println("menor");
      }
    } while (numJugador != numSecreto);
  }
}
