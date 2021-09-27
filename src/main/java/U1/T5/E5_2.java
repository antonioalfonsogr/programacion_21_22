package U1.T5;

import java.util.Scanner;

public class E5_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el número 12");
        byte num12 = teclado.nextByte();
        if (num12==12) {System.out.println(num12 + " intruducido correctamente");
        }
        else {System.out.println("No ha introducido el número correcto");
        }
    }
}
