package U1.T4;

import java.util.Scanner;

public class E4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número decimal a redondear");
        double decimal = teclado.nextDouble();
        double enteroDouble = Math.round(decimal);
        int enteroInt = (int) enteroDouble;
        System.out.println(decimal + " redondeado es: " + enteroInt);
    }
}
