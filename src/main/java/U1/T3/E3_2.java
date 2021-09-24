package U1.T3;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduce tu año de nacimiento");
        short num1 = teclado.nextShort();
        System.out.println("Intruduce el año actual");
        short num2 = teclado.nextShort();
        int num3 = num2-num1;
        System.out.println("Tienes " + num3 + " años");
    }
}
