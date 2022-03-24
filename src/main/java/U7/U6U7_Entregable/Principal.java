package U7.U6U7_Entregable;

public class Principal {
  public static void main(String[] args) {

    Exchange exchangeEmpresa = new Exchange();

    Criptomoneda c1 = new Criptomoneda("BitCoins", "BTC", 1, 40000.00, 100000.0, "10/10/2010", 1);
    Criptomoneda c2 = new Criptomoneda("DogCoins", "DTC", 2, 3000.00, 20000.0, "20/11/2015", 2);
    Criptomoneda c3 = new Criptomoneda("CatCoins", "CTC", 3, 2000.00, 3000.0, "30/01/2020", 3);

    Fiat f1 = new Fiat("Euro", "EUR", 1, "España");
    Fiat f2 = new Fiat("Dolar", "USD", 2, "USA");
    Fiat f3 = new Fiat("Yuan", "YUA", 3, "China");

    ParCotizacion p1 = new ParCotizacion(f1, f2, 1.1, 0.11);
    ParCotizacion p2 = new ParCotizacion(f3, c1, 0.8, 0.12);
    ParCotizacion p3 = new ParCotizacion(c2, c3, 1.8, -0.13);
  }
}
