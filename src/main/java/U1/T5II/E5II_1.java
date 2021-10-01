package U1.T5II;

import java.util.Scanner;

public class E5II_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escriba numero del día de la semana (1 para Lunes, 2 para Martes...");
    byte dia = teclado.nextByte();
    switch (dia) {
      case 1:
        System.out.println("El lunes, la primera clase es Programación");
        break;
      case 2:
        System.out.println("El martes, la primera clase es Sistemas Informaticos");
        break;
      case 3:
        System.out.println("El mieroles, la primera clase es Programación");
        break;
      case 4:
        System.out.println("El jueves, la primera clase es Entorno de Desarrollo");
        break;
      case 5:
        System.out.println("El viernes, la primera clase es Bases de Datos");
        break;
      default:
        System.out.println("No ha intoducido un número del 1 al 5");
    }
  }
}
