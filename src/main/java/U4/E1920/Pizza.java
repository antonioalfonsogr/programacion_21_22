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
  private int indiceIngrediente;

  // Constructor por defecto tamaño familiar
  public Pizza() {
    this.size = Sizes.familiar;
    this.ingredientes = new Ingrediente[3];
    indiceIngrediente = 0;
  }

  // Constructor elegir el tamaño
  public Pizza(Sizes size) {
    this.size = size;
    this.ingredientes = new Ingrediente[3];
    indiceIngrediente = 0;
  }

  // Método número de ingredientes

  public int numIngredientes() {
    return this.indiceIngrediente;
  }

  // Método añadir ingrediente

  public boolean addIngrediente(Ingrediente ingrediente) {

    if (indiceIngrediente < ingredientes.length) {
      ingredientes[indiceIngrediente] = ingrediente;
      indiceIngrediente++;
      return true;
    } else {
      System.out.println(
          "No se ha podido añadir "
              + ingrediente.getNombre()
              + ", La pizza ya tiene el máximo de ingredientes.");
      return false;
    }
  }

  // Método mostrar información de la pizza

  public void mostrarInfoPizza() {
    System.out.println("Pizza tamaño: " + getSize());

    if (indiceIngrediente < 1) {
      System.out.println("Sin ingredientes añadidos");
    } else {
      for (int i = 0; i < indiceIngrediente; i++) {
        System.out.println("Ingrediente " + (i + 1) + ": " + ingredientes[i].getNombre());
      }
    }
  }

  // Getter

  public Sizes getSize() {
    return size;
  }
}
