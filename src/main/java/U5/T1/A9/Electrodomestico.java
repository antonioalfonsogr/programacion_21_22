package U5.T1.A9;

public class Electrodomestico {

  // Enum Consumo Energético
  protected enum cunsumosEnergeticosEnum {
    A,
    B,
    C,
    D,
    E,
    F
  }

  // Enum Consumo Energético
  protected enum colorEnum {
    blanco,
    negro,
    rojo,
    azul,
    gris
  }

  // Atributos
  protected Integer precio;
  protected colorEnum color;
  protected cunsumosEnergeticosEnum consumoEnergetico;
  protected Integer peso;

  // Constructor por defecto
  public Electrodomestico() {
    this.precio = 100;
    this.color = colorEnum.blanco;
    this.consumoEnergetico = cunsumosEnergeticosEnum.F;
    this.peso = 5;
  }

  // Constructor con el precio y peso. El resto por defecto
  public Electrodomestico(Integer precio, Integer peso) {
    this.precio = precio;
    this.peso = peso;
    this.color = colorEnum.blanco;
    this.consumoEnergetico = cunsumosEnergeticosEnum.F;
  }

  // Constructor con todos los atributos
  public Electrodomestico(
      Integer precio, colorEnum color, cunsumosEnergeticosEnum consumoEnergetico, Integer peso) {
    this.precio = precio;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
  }

  // Getter de todos los atributos
  public Integer getPrecio() {
    return precio;
  }

  public colorEnum getColor() {
    return color;
  }

  public cunsumosEnergeticosEnum getConsumoEnergetico() {
    return consumoEnergetico;
  }

  public Integer getPeso() {
    return peso;
  }

  // Método getPrecioFinal
  public Integer getPrecioFinal() {
    switch (consumoEnergetico) {
      case A:
        precio += 100;
        break;
      case B:
        precio += 80;
        break;
      case C:
        precio += 60;
        break;
      case D:
        precio += 50;
        break;
      case E:
        precio += 30;
        break;
      case F:
        precio += 10;
        break;
    }
    if (peso <= 29) {
      precio += 10;
    } else if (peso <= 49) {
      precio += 60;
    } else if (peso <= 79) {
      precio += 80;
    } else {
      precio += 100;
    }
    return precio;
  }

  // Método toString
  @Override
  public String toString() {
    return "Electrodomestico ("
        + "Precio Base: "
        + precio
        + "€, Color: "
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
