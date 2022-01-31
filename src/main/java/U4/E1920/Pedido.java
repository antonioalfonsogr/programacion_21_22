package U4.E1920;

import java.util.Calendar;

public class Pedido {

  // Atributos
  private Pizza pizzaPedido;
  private Calendar fecha;

  // Constructor eligiendo ingredientes

  public Pedido(Pizza pizzaPedido) {
    this.pizzaPedido = pizzaPedido;
    this.fecha = Calendar.getInstance();
  }

  // Constructor producto estrella

  public Pedido() {
    this.pizzaPedido = new Pizza();
    Ingrediente queso = new Ingrediente();
    Ingrediente jamonIberico = new Ingrediente("Jamón Ibérico", 300);
    this.pizzaPedido.addIngrediente(queso);
    this.pizzaPedido.addIngrediente(jamonIberico);
    this.fecha = Calendar.getInstance();
  }

  // Método pasa fecha a String
  private String metodoFechaString() {
    String fechaString =
        Integer.toString(fecha.get(Calendar.DATE))
            + Integer.toString(fecha.get(Calendar.MONTH))
            + Integer.toString(fecha.get(Calendar.YEAR));
    return fechaString;
  }

  // Getter
  public Pizza getPizzaPedido() {
    return pizzaPedido;
  }

  public String getFecha() {
    return metodoFechaString();
  }
}
