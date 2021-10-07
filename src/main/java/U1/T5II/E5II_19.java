package U1.T5II;

import java.util.Scanner;

public class E5II_19 {
  public static void main(String[] args) {
    // Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
    // minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
    // semana comienza el viernes a las 15:00h. Se da
    // por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las
    // 15:00h
    Scanner teclado = new Scanner(System.in);
    System.out.println("Indique el día de la semana introduciendo un número:");
    System.out.println("1: Lunes");
    System.out.println("2: Martes");
    System.out.println("3: Miércoles");
    System.out.println("4: Jueves");
    System.out.println("5: Viernes");
    int dia = teclado.nextInt();
    System.out.println("Introduzca la hora");
    int hora = teclado.nextInt();
    System.out.println("Introduzca los minutos");
    int min = teclado.nextInt();
    int minactual;
    if (hora == 0 && min == 0) {
      minactual = 0;
    } else if (hora == 0) {
      minactual = (min);
    } else if (min == 0) {
      minactual = (hora * 60);
    } else minactual = ((hora * 60) + (min));
    switch (dia) {
      case 1:
        System.out.println(
            "Faltan "
                + ((4 * 24 * 60) + ((15 * 60) - minactual))
                + " minutos para el fin de semana");
      case 2:
        System.out.println(
            "Faltan "
                + ((3 * 24 * 60) + ((15 * 60) - minactual))
                + " minutos para el fin de semana");
      case 3:
        System.out.println(
            "Faltan "
                + ((2 * 24 * 60) + ((15 * 60) - minactual))
                + " minutos para el fin de semana");
      case 4:
        System.out.println(
            "Faltan " + ((24 * 60) + ((15 * 60) - minactual)) + " minutos para el fin de semana");
      case 5:
        System.out.println("Faltan " + ((15 * 60) - minactual) + " minutos para el fin de semana");
    }
  }
}
