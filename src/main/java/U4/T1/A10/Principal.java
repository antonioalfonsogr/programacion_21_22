package U4.T1.A10;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca las horas");
    int horas = sc.nextInt();

    System.out.println("Introduzca los minutos");
    int minutos = sc.nextInt();

    System.out.println("Introduzca los segundos");
    int segundos = sc.nextInt();

    System.out.println("Introduzca un número");
    int n = sc.nextInt();

    Hora inicial = new Hora(horas, minutos, segundos);

    System.out.println(
        "La hora introducida es "
            + inicial.getHoras()
            + ":"
            + inicial.getMinutos()
            + ":"
            + inicial.getSegundos());
  }
}
