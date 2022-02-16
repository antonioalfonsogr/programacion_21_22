package U5.T2.A3;

public class Cuadrado extends PoligoRegular {

  // Constructor con todos los parámetros
  public Cuadrado(Integer lado, Colores color) {
    super(lado, color);
  }

  // Constructor por defecto
  public Cuadrado() {}

  // Método getArea
  @Override
  public Double getArea() {
    return (double) (this.lado * this.lado);
  }

  // Método toString
  @Override
  public String toString() {
    return "Cuadrado{" + "lado=" + lado + "cm, color=" + color + ", area=" + getArea() + "cm2}";
  }
}
