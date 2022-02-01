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

  // Método mostrar fecha
  public void metodoFecha() {
    String dia, mes, annio;

    dia = Integer.toString(fecha.get(Calendar.DATE));
    mes = Integer.toString(fecha.get(Calendar.MONTH));
    annio = Integer.toString(fecha.get(Calendar.YEAR));

    System.out.println("Fecha: " + dia + "/" + mes + "/" + annio);
  }

  // Getter
  public Pizza getPizzaPedido() {
    return pizzaPedido;
  }
}
