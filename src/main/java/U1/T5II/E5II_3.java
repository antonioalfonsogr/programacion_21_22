package U1.T5II;

import java.util.Scanner;

public class E5II_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número del 1 al 7 para saber el día de la semana");
        byte dia = teclado.nextByte();
        switch (dia) {
            case 1: System.out.println("Es lunes,"); break;
            case 2: System.out.println("Es martes,"); break;
            case 3: System.out.println("Es mieroles"); break;
            case 4: System.out.println("Es jueves"); break;
            case 5: System.out.println("Es viernes"); break;
            case 6: System.out.println("Es sábado"); break;
            case 7: System.out.println("Es domingo"); break;
            default: System.out.println("No ha intoducido un número del 1 al 7");
        }
    }
}
