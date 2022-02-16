package U5.T2.A3;

public class Circulo implements Figura {

  // Atributos
  private Integer radio;
  public Colores color;

  // Constructor con todos los parámetros

  public Circulo(Integer radio, Colores color) {
    this.radio = radio;
    this.color = color;
  }
  // Constructor por defecto
  public Circulo() {
    this.radio = 10;
    this.color = Colores.azul;
  }

  // Método getArea
  @Override
  public Double getArea() {
    return this.radio * this.radio * Math.PI;
  }

  // Método toString

  @Override
  public String toString() {
    return "Circulo{" + "radio=" + radio + "cm, color=" + color + ", area=" + getArea() + "cm2}";
  }
}
