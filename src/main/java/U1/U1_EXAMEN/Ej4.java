package U1.U1_EXAMEN;

import java.util.Scanner;

// La tienda Carbonita Volando vende figuras personalizadas mediante impresión 3D. Lo hace mediante
// un configurador online que permite calcular el precio de cada figura dependiendo del peso total,
// del tipo de material (ABS, PLA, Madera, flexible, etc.) y de si se pide un posprocesado de la
// figura o no. Las tarifas son las siguientes:
//
// 0.2 céntimos por gramo si se hace con ABS
// 0.3 céntimos por gramo si se hace con PLA
// 0.5 céntimos por gramo si se hace con Madera
// 0.7 céntimos por gramo si se hace con material flexible
// Aplicar una posprocesado, implica incrementar el coste total de la figura en 3 euros adicionales,
// independientemente del material y del tamaño de la figura.
//
// Si se pertenece al programa de fidelización Enjuto3D Premium, no se cobran los gastos de envío
// que son de 2 euros.
//
// Elabora un programa que pregunte por los datos necesarios y calcule el coste total de la figura.

public class Ej4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Bienvenido a Carbonita Volando");
    System.out.println("Introduzca el peso de su figura en gramos:");
    int peso = sc.nextInt();
    System.out.println("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible):");
    int material = sc.nextInt();
    System.out.println("¿Quiere posprocesado? (1=si, 2=no):");
    int posprocesado = sc.nextInt();
    System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no):");
    int premium = sc.nextInt();

    double precioTotal = 0;
    double pABS = 0.2;
    double pPLA = 0.3;
    double pMadera = 0.5;
    double pMaterialFlexible = 0.7;

    switch (material) {
      case 1:
        precioTotal = peso * pABS + 2;
        break;
      case 2:
        precioTotal = peso * pPLA + 2;
        break;
      case 3:
        precioTotal = peso * pMadera + 2;
        break;
      case 4:
        precioTotal = peso * pMaterialFlexible + 2;
        break;
    }
    if (posprocesado == 1) {
      precioTotal = precioTotal + 3;
    }
    if (premium == 1) {
      precioTotal = precioTotal - 2;
    }
    System.out.println("El coste total de la pieza es: " + precioTotal + " €");
  }
}
