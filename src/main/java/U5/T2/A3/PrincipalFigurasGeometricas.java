package U5.T2.A3;

import java.util.Arrays;

import static U5.T2.A3.PoligoRegular.getContadorPoligonos;

public class PrincipalFigurasGeometricas {
  public static void main(String[] args) {

    System.out.println();

    Figura[] arrayFigurasGeometricas = new Figura[5];

    Cuadrado cua1 = new Cuadrado();
    Cuadrado cua2 = new Cuadrado(7, Colores.amarillo);
    Triangulo tri1 = new Triangulo();
    Triangulo tri2 = new Triangulo(8, Colores.rojo, 6);
    Triangulo tri3 = new Triangulo(6, Colores.verde, 10);
    Triangulo tri4 = new Triangulo();
    Triangulo tri5 = new Triangulo(9, Colores.amarillo, 9);
    Circulo cir1 = new Circulo();
    Circulo cir2 = new Circulo(5, Colores.rojo);

    arrayFigurasGeometricas[0] = cua1;
    arrayFigurasGeometricas[1] = tri1;
    arrayFigurasGeometricas[2] = cir1;
    arrayFigurasGeometricas[3] = cua2;
    arrayFigurasGeometricas[4] = tri2;

    for (int i = 0; i < 5; i++) {
      System.out.println(arrayFigurasGeometricas[i]);
    }
    System.out.println();

    System.out.println("Contador polígonos: " + getContadorPoligonos());
    System.out.println();

    Figura[] arrayTriangulos = new Figura[5];
    arrayTriangulos[0] = tri1;
    arrayTriangulos[1] = tri2;
    arrayTriangulos[2] = tri3;
    arrayTriangulos[3] = tri4;
    arrayTriangulos[4] = tri5;

    System.out.println("Triángulos sin ordenar:");
    for (int i = 0; i < 5; i++) {
      System.out.println(arrayTriangulos[i]);
    }
    System.out.println();

    Arrays.sort(arrayTriangulos);

    System.out.println("Triángulos ordenados por defecto:");
    for (int i = 0; i < 5; i++) {
      System.out.println(arrayTriangulos[i]);
    }
    System.out.println();

    ComparaTrianguloColor comparaTrianguloColor = new ComparaTrianguloColor();

    Arrays.sort(arrayTriangulos, comparaTrianguloColor);
    System.out.println("Triángulos ordenados por color:");
    for (int i = 0; i < 5; i++) {
      System.out.println(arrayTriangulos[i]);
    }
    System.out.println();
  }
}
