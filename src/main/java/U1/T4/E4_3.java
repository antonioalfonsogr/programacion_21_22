package U1.T4;

import java.util.Scanner;

public class E4_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduzca primera nota");
        float nota1 = teclado.nextFloat();
        System.out.println("Intruduzca segunda nota");
        float nota2 = teclado.nextFloat();
        System.out.println("Intruduzca tercera nota");
        float nota3 = teclado.nextFloat();
        float notamFloat = (nota1 + nota2 + nota3)/3;
        byte notamByte = (byte) notamFloat;
        System.out.println("La nota media es: " + notamByte);
    }
}