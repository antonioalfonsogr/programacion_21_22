package U5.T1.A9;

public class Television extends Electrodomestico {

  // Atributos
  private Integer pulgadas;
  private Boolean sintonizadorTDT;

  // Constructor por defecto
  public Television() {
    this.pulgadas = 20;
    this.sintonizadorTDT = false;
  }

  // Constructor con el precio y peso. El resto por defecto

  public Television(Integer precio, Integer peso) {
    super(precio, peso);
    this.pulgadas = 20;
    this.sintonizadorTDT = false;
  }

  // Constructor con la resolución, sintonizador TDT y el resto de atributos heredados
  public Television(
      Integer precio,
      colorEnum color,
      cunsumosEnergeticosEnum consumoEnergetico,
      Integer peso,
      Integer pulgadas,
      Boolean sintonizadorTDT) {
    super(precio, color, consumoEnergetico, peso);
    this.pulgadas = pulgadas;
    this.sintonizadorTDT = sintonizadorTDT;
  }

  // Getter resolución (pulgadas)
  public Integer getPulgadas() {
    return pulgadas;
  }

  // Getter Sintonizador TDT
  public Boolean getSintonizadorTDT() {
    return sintonizadorTDT;
  }

  // Método getPrecioFinal

  @Override
  public Integer getPrecioFinal() {
    int precioFinal = super.getPrecioFinal();
    if (pulgadas >= 40) {
      precioFinal *= 1.3;
    }
    if (sintonizadorTDT) {
      precioFinal += 50;
    }
    return precioFinal;
  }

  // Método toString

  @Override
  public String toString() {
    return "Television ("
        + "Precio Base: "
        + precio
        + "€, Pulgadas: "
        + pulgadas
        + ", Sintonizador TV: "
        + sintonizadorTDT
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
}
