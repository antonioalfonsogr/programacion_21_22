package U1.T5II;
// no terminado
import java.util.Scanner;

public class E5II_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Este programa ordena de mayor a menor 3 números");
    System.out.println("Introduzca cada número y pulse Intro");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      if (num2 > num3) {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num1 + " > " + num2 + " > " + num3);
      } else {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num1 + " > " + num3 + " > " + num2);
      }
    }
    if (num2 >= num1 && num2 >= num3) {
      if (num1 > num3) {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num2 + " > " + num1 + " > " + num3);
      } else {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num2 + " > " + num3 + " > " + num1);
      }
    }
    if (num3 >= num1 && num3 >= num2) {
      if (num1 > num2) {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num3 + " > " + num1 + " > " + num2);
      } else {
        System.out.println(
            "Los números ordenados de mayor a menos son " + num3 + " > " + num2 + " > " + num1);
      }
    }
  }
}
