package U4.E1920;

import java.util.Arrays;

public class Pizzeria {

  // Atributos

  private Pedido[] pedidos;
  private int indicePedidos;

  // Constructor pizzeria por defecto

  public Pizzeria() {
    this.pedidos = new Pedido[5];
  }

  // Constructor pizzeria num Pedidos
  public Pizzeria(int num) {
    this.pedidos = new Pedido[num];
  }

  // Método añadir pedido
  public void addPedido(Pedido p) {
    if (indicePedidos >= pedidos.length) {
      pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
    }
    pedidos[indicePedidos] = p;
    indicePedidos++;
  }

  // Método mostrar todos los pedidos de la pizzeria
  public void mostrarPedidos() {

    if (indicePedidos < 1) {
      System.out.println("La pizzeria no ha recibido ningún pedido");
    } else {
      for (int i = 0; i < indicePedidos; i++) {
        System.out.println("Pedido número: " + (i + 1));
        System.out.println("Fecha: " + pedidos[i].getFecha());
        pedidos[1].getPizzaPedido().mostrarInfoPizza();
      }
    }
  }

  // Método mostrar num pedidos pizzeria
  public void mostrarNumPedidos() {
    System.out.println("La pizzeria ha recibido " + pedidos.length + " pedidos");
  }
}
