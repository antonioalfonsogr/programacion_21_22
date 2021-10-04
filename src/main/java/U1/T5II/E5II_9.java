package U1.T5II;

import java.util.Scanner;

// Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

public class E5II_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Intruduzca su día de nacimiento");
    byte dia = teclado.nextByte();
    System.out.println("Intruduzca su mes de nacimiento");
    byte mes = teclado.nextByte();
    switch (mes) {
      case 1:
        if (dia <= 20) {
          System.out.println("Su horózcopo es Capricornio");
        } else {
          System.out.println("Su horózcopo es Acuario");
        }
        break;
      case 2:
        if (dia <= 19) {
          System.out.println("Su horózcopo es Acuario");
        } else {
          System.out.println("Su horózcopo es Piscis");
        }
        break;
      case 3:
        if (dia <= 20) {
          System.out.println("Su horózcopo es Piscis");
        } else {
          System.out.println("Su horózcopo es Aries");
        }
        break;
      case 4:
        if (dia <= 20) {
          System.out.println("Su horózcopo es Aries");
        } else {
          System.out.println("Su horózcopo es Tauro");
        }
        break;
      case 5:
        if (dia <= 21) {
          System.out.println("Su horózcopo es Tauro");
        } else {
          System.out.println("Su horózcopo es Géminis");
        }
        break;
      case 6:
        if (dia <= 21) {
          System.out.println("Su horózcopo es Géminis");
        } else {
          System.out.println("Su horózcopo es Cáncer");
        }
        break;
      case 7:
        if (dia <= 22) {
          System.out.println("Su horózcopo es Cáncer");
        } else {
          System.out.println("Su horózcopo es Leo");
        }
        break;
      case 8:
        if (dia <= 22) {
          System.out.println("Su horózcopo es Leo");
        } else {
          System.out.println("Su horózcopo es Virgo");
        }
        break;
      case 9:
        if (dia <= 22) {
          System.out.println("Su horózcopo es Virgo");
        } else {
          System.out.println("Su horózcopo es Libra");
        }
        break;
      case 10:
        if (dia <= 22) {
          System.out.println("Su horózcopo es Libra");
        } else {
          System.out.println("Su horózcopo es Escorpio");
        }
        break;
      case 11:
        if (dia <= 22) {
          System.out.println("Su horózcopo es Escorpio");
        } else {
          System.out.println("Su horózcopo es Sagitario");
        }
        break;
      case 12:
        if (dia <= 21) {
          System.out.println("Su horózcopo es Sagitario");
        } else {
          System.out.println("Su horózcopo es Capricornio");
        }
        break;
    }
  }
}
