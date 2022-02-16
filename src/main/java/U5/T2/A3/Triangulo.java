package U5.T2.A3;

public class Triangulo extends PoligoRegular implements Comparable {

  // Atributos
  private Integer altura;

  // Constructor con todos los parámetros

  public Triangulo(Integer lado, Colores color, Integer altura) {
    super(lado, color);
    this.altura = altura;
  }

  // Constructor por defecto
  public Triangulo() {
    this.altura = 10;
  }

  // Método getArea
  @Override
  public Double getArea() {
    return (double) ((this.lado * this.altura) / 2);
  }

  // Método compareTo. Compara por lado.
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Triangulo)) return 0;
    Triangulo that = (Triangulo) o;
    return this.lado - that.lado;
  }

  // Método toString

  @Override
  public String toString() {
    return "Triangulo{"
        + "lado="
        + lado
        + "cm, altura="
        + altura
        + ", color="
        + color
        + ", area="
        + getArea()
        + "cm2";
  }
}
