package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    // Desarrolla un programa que genere una clave criptográfica mediante números aleatorios para
    // cifrar otro número introducido por el usuario. Se generará una clave distinta para cada una
    // de las cifras del número introducido por el usuario. Las diferentes claves criptográficas
    // generadas se comprenderán entre 1000 y 10000 (siendo este último no incluido). Por cada cifra
    // del número, se sumará al total de cifras sumadas de su clave criptográfica. El número final
    // se obtendrá de sumar todos los resultados parciales. Abajo se detalla un ejemplo para su
    // mejor comprensión.

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número");
    int num = sc.nextInt();

    long cociente = num;
    int resto;
    long resultado = 0;

    while (cociente != 0) {
      resto = (int) cociente % 10;
      cociente = cociente / 10;
      int aleatorio = (int) (1000 + Math.random() * 9000);
      int d1 = aleatorio / 1000;
      int d2 = (aleatorio % 1000) / 100;
      int d3 = (aleatorio % 100) / 10;
      int d4 = aleatorio % 10;
      int sumad = d1 + d2 + d3 + d4 + resto;
      resultado = resultado + sumad;
      System.out.println("La clave criptográfica generada para " + resto + " es: " + aleatorio);
      System.out.println(
          "La suma de las cifras totales para "
              + resto
              + " es: "
              + resto
              + " (cifra) + "
              + d1
              + " + "
              + d2
              + " + "
              + d3
              + " + "
              + d4
              + " (clave) = "
              + sumad);
    }
    System.out.println("El número resultante es: " + resultado);
  }
}
