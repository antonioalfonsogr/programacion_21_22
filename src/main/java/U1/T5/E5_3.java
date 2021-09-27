package U1.T5;

import java.util.Scanner;

public class E5_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num1 = teclado.nextInt();
        if ((num1 % 2) == 0) {
            System.out.println(num1 + " es par");
        } else {
            System.out.println(num1 + " es impar");
        }
    }
}
