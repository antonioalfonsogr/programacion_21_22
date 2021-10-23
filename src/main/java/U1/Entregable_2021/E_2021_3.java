package U1.Entregable_2021;

import java.util.Scanner;

public class E_2021_3 {
  public static void main(String[] args) {
    // Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar
    // suerte a un usuario. Solicitaremos a un usuario cuáles son sus 3 números favoritos y para
    // calcular  si un número le va a dar suerte dicho número tendrá más ocurrencias de esos números
    // que de los demás.

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca sus tres números favoritos (del 0 al 9) de uno en uno:");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();

    System.out.println("Introduzca el número de la loteria (5 digitos):");
    int numLoteria = teclado.nextInt();

    int cociente = numLoteria;
    int resto;
    int contadorOcurrencia = 0;

    while (cociente > 0) {
      resto = cociente % 10;
      cociente = cociente / 10;

      if (resto == num1 || resto == num2 || resto == num3) {
        contadorOcurrencia++;
      }
    }
    if (contadorOcurrencia >= 3) {
      System.out.println("Ese número le va a dar suerte");
    } else {
      System.out.println("Ese número NO le va a dar suerte");
    }
  }
}
