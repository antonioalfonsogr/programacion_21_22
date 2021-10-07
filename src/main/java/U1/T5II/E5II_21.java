package U1.T5II;

import java.util.Scanner;

public class E5II_21 {
  public static void main(String[] args) {
    // Escribe un programa que genere la nómina (bien desglosada) de un empleado según las
    // siguientes condiciones:
    //
    // • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de
    // proyecto), los días que ha estado de viaje visitando clientes durante el mes y su estado
    // civil (1 - Soltero, 2 - Casado).
    // • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog.
    // junior, un prog. senior o un jefe de proyecto respectivamente.
    // • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al
    // sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en
    // caso de estar casado.
    Scanner teclado = new Scanner(System.in);
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.println("Introduzca el cargo del empleado (1 - 3):");
    byte cargo = teclado.nextByte();
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    int dias_visitas = teclado.nextInt();
    final double importe_dietas = 30.00;
    double dietas;
    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
    byte estado_civil = teclado.nextByte();
    double sueldo_base;
    switch (cargo) {
      case 1:
        sueldo_base = 950.00;
        System.out.println("-------------------------------");
        System.out.println("| Sueldo base " + sueldo_base + " |");
        System.out.print("| Dietas (" + dias_visitas + " viajes) ");
        dietas = dias_visitas * importe_dietas;
        System.out.println(dietas + " |");
        System.out.println("|-----------------------------|");
        System.out.println("| Sueldo bruto " + (sueldo_base + dietas) + " |");
        if (estado_civil == 1) {
          System.out.println("| Retención IRPF (25%) " + ((sueldo_base + dietas) * 0.25) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.75) + " |");
          System.out.println("-------------------------------");
        } else if (estado_civil == 2) {
          System.out.println("| Retención IRPF (20%) " + (sueldo_base * 0.20) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.80) + " |");
          System.out.println("-------------------------------");
        } else {
          System.out.println("Estado civil introducido incorrectamente");
        }
        break;
      case 2:
        sueldo_base = 1200.00;
        System.out.println("-------------------------------");
        System.out.println("| Sueldo base " + sueldo_base + " |");
        System.out.print("| Dietas (" + dias_visitas + " viajes) ");
        dietas = dias_visitas * importe_dietas;
        System.out.println(dietas + " |");
        System.out.println("|-----------------------------|");
        System.out.println("| Sueldo bruto " + (sueldo_base + dietas) + " |");
        if (estado_civil == 1) {
          System.out.println("| Retención IRPF (25%) " + ((sueldo_base + dietas) * 0.25) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.75) + " |");
          System.out.println("-------------------------------");
        } else if (estado_civil == 2) {
          System.out.println("| Retención IRPF (20%) " + (sueldo_base * 0.20) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.80) + " |");
          System.out.println("-------------------------------");
        } else {
          System.out.println("Estado civil introducido incorrectamente");
        }
        break;
      case 3:
        sueldo_base = 1600.00;
        System.out.println("-------------------------------");
        System.out.println("| Sueldo base " + sueldo_base + " |");
        System.out.print("| Dietas (" + dias_visitas + " viajes) ");
        dietas = dias_visitas * importe_dietas;
        System.out.println(dietas + " |");
        System.out.println("|-----------------------------|");
        System.out.println("| Sueldo bruto " + (sueldo_base + dietas) + " |");
        if (estado_civil == 1) {
          System.out.println("| Retención IRPF (25%) " + ((sueldo_base + dietas) * 0.25) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.75) + " |");
          System.out.println("-------------------------------");
        } else if (estado_civil == 2) {
          System.out.println("| Retención IRPF (20%) " + (sueldo_base * 0.20) + " |");
          System.out.println("|-----------------------------|");
          System.out.println("| Sueldo neto " + ((sueldo_base + dietas) * 0.80) + " |");
          System.out.println("-------------------------------");
        } else {
          System.out.println("Estado civil introducido incorrectamente");
        }
        break;
    }
    System.out.println("Cargo introducido incorrectamente");
  }
}
