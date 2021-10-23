package U1.Entregable_2021;

import java.util.Scanner;

public class E_2021_4 {
  public static void main(String[] args) {
    // Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos
    // mostrando cada vez la hora nueva.
    // Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de
    // segundos que se quiere aumentar la hora.
    // Supondremos que el usuario siempre introduce valores correctos.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca horas:");
    int horas = teclado.nextInt();

    System.out.println("Introduzca minutos:");
    int minutos = teclado.nextInt();

    System.out.println("Introduzca segundos:");
    int segundos = teclado.nextInt();

    System.out.println("Introduzca segundos a incrementar");
    int incrementoSegundos = teclado.nextInt();

    for (int i = 0; i < incrementoSegundos; i++) {

      segundos++;
      if (segundos == 60) {
        minutos++;
        segundos = 0;
      }
      if (minutos == 60) {
        horas++;
        minutos = 0;
      }
      if (horas == 24) {
        horas = 0;
      }
      if (horas < 10) {
        System.out.print("0" + horas + ":");
      } else System.out.print(horas + ":");

      if (minutos < 10) {
        System.out.print("0" + minutos + ":");
      } else System.out.print(minutos + ":");

      if (segundos < 10) {
        System.out.println("0" + segundos);
      } else System.out.println(segundos);
    }
  }
}
