package U5.T2.A3;

public abstract class PoligoRegular implements Figura {

  // Atributos
  protected Integer lado;
  public Colores color;
  protected static Integer contadorPoligonos = 0;

  // Constructor con todos los parámetros

  protected PoligoRegular(Integer lado, Colores color) {
    this.lado = lado;
    this.color = color;
    contadorPoligonos++;
  }

  // Constructor por defecto
  protected PoligoRegular() {
    this.lado = 10;
    this.color = Colores.azul;
    contadorPoligonos++;
  }

  // Método getArea
  @Override
  public abstract Double getArea();
}
