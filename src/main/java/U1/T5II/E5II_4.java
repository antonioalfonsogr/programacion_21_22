package U1.T5II;

import java.util.Scanner;

public class E5II_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas;
        final int precioHoraNormal = 12;
        final int precioHoraExtra = 16;
        System.out.println("introduzca el número de horas trabajadas durante la semana:");
        horas = teclado.nextInt();
        if (horas<=40)
        {System.out.println("El sueldo semanal que le corresponde es " + (horas*precioHoraNormal) + " euros");
        }
        else {System.out.println("El sueldo semanal que le corresponde es " + (((horas-40)*precioHoraExtra)+480) + " euros");
        }
    }
}
