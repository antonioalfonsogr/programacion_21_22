package U4.E1920;

public class Ingrediente {

  // Atributos
  private String nombre;
  private Integer calorias;

  // Constructor por defecto "Queso" con "250" calorías
  public Ingrediente() {
    this.nombre = "Queso";
    this.calorias = 250;
  }

  // Constructor seleccionar nombre y calorías
  public Ingrediente(String nombre, Integer calorias) {
    this.nombre = nombre;
    this.calorias = calorias;
  }
}
