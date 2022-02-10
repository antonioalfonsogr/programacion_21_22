package U5.T1.A9;

public class Lavadora extends Electrodomestico implements Comparable {

  // Atributos
  private Integer carga;

  // Constructor por defecto
  public Lavadora() {
    this.carga = 5;
  }

  // Constructor con el precio y peso. El resto por defecto
  public Lavadora(Integer precio, Integer peso) {
    super(precio, peso);
    this.carga = 5;
  }

  // Constructor con la carga y el resto de atributos heredados
  public Lavadora(
      Integer precio,
      colorEnum color,
      cunsumosEnergeticosEnum consumoEnergetico,
      Integer peso,
      Integer carga) {
    super(precio, color, consumoEnergetico, peso);
    this.carga = carga;
  }

  // get Carga
  public Integer getCarga() {
    return carga;
  }

  // Método getPrecioFinal polimórfico
  @Override
  public Integer getPrecioFinal() {
    if (carga <= 30) {
      return super.getPrecioFinal();
    } else {
      return super.getPrecioFinal() + 50;
    }
  }

  // Método toSting

  @Override
  public String toString() {

    return "Lavadora ("
        + "Precio Base: "
        + precio
        + "€, Carga: "
        + carga
        + ", Color: "
        + color
        + ", Consumo Energético: "
        + consumoEnergetico
        + ", Peso:"
        + peso
        + ", Precio Final: "
        + getPrecioFinal()
        + "€)";
  }

  // Método comparador carga
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Lavadora)) return 0;
    Lavadora that = (Lavadora) o;
    return this.carga - that.carga;
  }
}
