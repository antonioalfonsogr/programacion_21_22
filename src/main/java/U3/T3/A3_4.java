package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

public class A3_4 {
  public static void main(String[] args) {
    // Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La
    // aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5 (siendo
    // n la longitud indicada anteriormente por el usuario). El jugador introduce ahora una
    // combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor
    // menor o igual que el correspondiente de la combinación secreta.

    Scanner sc = new Scanner(System.in);

    System.out.println("Número de digitos de la clave");
    int longitud = sc.nextInt();
    int[] claveSecreta = new int[longitud];

    int[] clavePrueba = new int[claveSecreta.length];

    for (int i = 0; i < claveSecreta.length; i++) {
      claveSecreta[i] = (int) (1 + Math.random() * 5);
    }

    System.out.println(Arrays.toString(claveSecreta));

    int contadorAciertos;
    do {
      contadorAciertos = 0;

      System.out.println("Introduce combinación:");
      for (int i = 0; i < claveSecreta.length; i++) {
        System.out.println("Introduzca dígito:");
        clavePrueba[i] = sc.nextInt();
      }

      for (int i = 0; i < claveSecreta.length; i++) {
        if (clavePrueba[i] < claveSecreta[i]) {
          System.out.println(clavePrueba[i] + " es menor");
        } else if (clavePrueba[i] > claveSecreta[i]) {
          System.out.println(clavePrueba[i] + " es mayor");
        } else if (clavePrueba[i] == claveSecreta[i]) {
          System.out.println(clavePrueba[i] + " es igual");
          contadorAciertos++;
        }
      }
      if (contadorAciertos < claveSecreta.length) System.out.println("Intente acertarla de nuevo");
    } while (contadorAciertos < claveSecreta.length);
    System.out.println("Felicidades has acertado");
  }
}
