package U1.T6;

import java.util.Scanner;

public class E6_5 {
  public static void main(String[] args) {
    // Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y
    // a continuación muestre un pequeño menú con 3 opciones:
    // 1.Calcular diámetro
    // 2.Calcular perímetro
    // 3.Calcular área
    // Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
    // (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el valor del radio");
    int radio = teclado.nextInt();
    System.out.println("1.Calcular diámetro");
    System.out.println("2.Calcular perímetro");
    System.out.println("3.Calcular área");
    int menu = teclado.nextInt();
    switch (menu) {
      case 1:
        System.out.println("El diametro de la circunferencia es " + (2 * radio));
        break;
      case 2:
        System.out.println("El perimetro de la circunferencia es " + (2 * radio * Math.PI));
        break;
      case 3:
        System.out.println("El área de la circunferencia es " + (radio * radio * Math.PI));
        break;
      default:
        System.out.println("No ha introducido 1, 2 o 3.");
        break;
    }
  }
}
