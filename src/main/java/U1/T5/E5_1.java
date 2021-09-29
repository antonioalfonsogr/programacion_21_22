package U1.T5;

import java.util.Scanner;

public class E5_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número entero");
        int num1 = teclado.nextInt();
        if (num1 > 0) {
            System.out.println(num1 + " es positivo");
        } else {
            System.out.println(num1 + " es negativo");
        }
    }
}
