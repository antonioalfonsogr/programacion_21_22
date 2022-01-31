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
  }
}
