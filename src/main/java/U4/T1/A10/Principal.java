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

    System.out.println("Introduzca el número de segundos a sumar");
    int n = sc.nextInt();

    Hora inicial = new Hora(horas, minutos, segundos);

    while (!inicial.horasBien || !inicial.minutosBien || !inicial.segundosBien) {

      System.out.println("Vuelva a introducir los datos");

      System.out.println("Introduzca las horas");
      horas = sc.nextInt();

      System.out.println("Introduzca los minutos");
      minutos = sc.nextInt();

      System.out.println("Introduzca los segundos");
      segundos = sc.nextInt();

      System.out.println("Introduzca el número de segundos a sumar");
      n = sc.nextInt();

      inicial = new Hora(horas, minutos, segundos);
    }

    System.out.println(inicial.mostrasHora());

    inicial.annadirSegundos(n);

    System.out.println(inicial.mostrasHora());
  }
}
