package U1.T5II;

import java.util.Scanner;

public class E5II_24 {
  public static void main(String[] args) {
    // Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego
    // el usuario 2. Si alguno de los usuarios introduce una opción incorrecta, el programa deberá
    // mostrar un mensaje de error.
    Scanner teclado = new Scanner(System.in);
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
    String jugador1 = teclado.next();
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
    String jugador2 = teclado.next();
    // jugador 1 piedra
    if (jugador1.equals("piedra")) {
      if (jugador2.equals("piedra")) {
        System.out.println("Empate");
      } else if (jugador2.equals("papel")) {
        System.out.println("Gana el jugador 2");
      } else if (jugador2.equals("tijera")) {
        System.out.println("Gana el jugador 1");
      } else {
        System.out.println("ERROR: Jugador 2 ha intrduccido su jugada incorrectamente");
      }
      // jugador 1 papel
    } else if (jugador1.equals("papel")) {
      if (jugador2.equals("piedra")) {
        System.out.println("Gana el jugador 1");
      } else if (jugador2.equals("papel")) {
        System.out.println("Empate");
      } else if (jugador2.equals("tijera")) {
        System.out.println("Gana el jugador 2");
      } else {
        System.out.println("ERROR: Jugador 2 ha intrduccido su jugada incorrectamente");
      }
      // jugador 1 tijera
    } else if (jugador1.equals("tijera")) {
      if (jugador2.equals("piedra")) {
        System.out.println("Gana el jugador 2");
      } else if (jugador2.equals("papel")) {
        System.out.println("Gana el jugador 1");
      } else if (jugador2.equals("tijera")) {
        System.out.println("Empate");
      } else {
        System.out.println("ERROR: Jugador 2 ha intrduccido su jugada incorrectamente");
      }
    } else {
      System.out.println("ERROR: Jugador 1 ha intrduccido su jugada incorrectamente");
    }
  }
}
