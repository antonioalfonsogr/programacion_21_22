package U1.T2;

import java.util.Scanner;

public class E2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero de millas");
        int num1 = teclado.nextInt();
        int num2 = num1*1609;
        System.out.println( num1 + " millas son: " + num2 + " metros");
    }
}
