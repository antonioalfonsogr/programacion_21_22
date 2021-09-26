package U1.T2;

import java.util.Scanner;

public class E2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce temperatura en ªC");
        int num1 = teclado.nextInt();
        int num2 = ((9*num1)/5)+32;
        System.out.println( num1 + "ªC son: " + num2 + "ºF");
    }
}
