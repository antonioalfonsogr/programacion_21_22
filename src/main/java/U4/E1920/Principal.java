package U4.E1920;

public class Principal {
  public static void main(String[] args) {

    // Creo ingredientes
    Ingrediente queso = new Ingrediente();
    Ingrediente jamonIberico = new Ingrediente("Jamón Ibérico", 300);
    Ingrediente bacon = new Ingrediente("Bacon", 400);
    Ingrediente jamonYork = new Ingrediente("Jamón York", 150);
    Ingrediente peperoni = new Ingrediente("Peperoni", 350);

    // Creo pizzas
    Pizza p1 = new Pizza();
    p1.addIngrediente(queso);
    p1.addIngrediente(peperoni);

    Pizza p2 = new Pizza(Pizza.Sizes.mediana);
    p2.addIngrediente(queso);
    p2.addIngrediente(jamonYork);
    p2.addIngrediente(bacon);
    p2.addIngrediente(peperoni);
    System.out.println();

    Pizza p3 = new Pizza(Pizza.Sizes.familiar);
    p3.addIngrediente(queso);

    System.out.println("La pizza 1 tiene " + p1.numIngredientes());
    System.out.println("La pizza 2 tiene " + p2.numIngredientes());
    System.out.println("La pizza 3 tiene " + p3.numIngredientes());
    System.out.println();

    p1.mostrarInfoPizza();
    System.out.println();
    p2.mostrarInfoPizza();
    System.out.println();
    p3.mostrarInfoPizza();
    System.out.println();

    Pizzeria telepizza = new Pizzeria();
    Pizzeria dominoS = new Pizzeria(2);

    telepizza.addPedido(new Pedido());
    telepizza.mostrarNumPedidos();
    System.out.println();
    telepizza.mostrarPedidos();

    Pedido ped1 = new Pedido(p1);
    ped1.metodoFecha();
    ped1.getPizzaPedido().mostrarInfoPizza();
    System.out.println();
    Pedido ped2 = new Pedido(p2);
    Pedido ped3 = new Pedido(p2);

    dominoS.addPedido(ped1);
    dominoS.addPedido(ped2);
    dominoS.addPedido(ped3);

    dominoS.mostrarNumPedidos();
    dominoS.mostrarPedidos();
  }
}
