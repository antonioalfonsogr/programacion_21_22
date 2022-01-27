package U4.E1920;

public class Pizza {

  // Enum Tamaños
  public enum Sizes {
    mediana,
    familiar
  }

  // Atributos
  private Sizes size;
  private Ingrediente[] ingredientes;

  // Constructor por defecto tamaño familiar
  public Pizza() {
    this.size = Sizes.familiar;
    this.ingredientes = new Ingrediente[3];
  }

  // Constructor elegir el tamaño
  public Pizza(Sizes size) {
    this.size = size;
    this.ingredientes = new Ingrediente[3];
  }
}
