package U9.U9_Entregable;

import U9.T2.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {

  // FiltroPrecio() que muestre por pantalla aquellos productos cuyos buyPrice sean mayores que un
  // precio que se solicita por pantalla al usuario.

  public static void FiltroPrecio() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Precio a partir del que desea filtrar: ");
    double precioFiltro = sc.nextDouble();
    sc.nextLine();

    try {
      Connection con = ConexionBD.getConnection();

      String sql =
          "SELECT productName, productVendor, productDescription, buyPrice \n"
              + "FROM products \n"
              + "WHERE buyPrice > ?";
      PreparedStatement statement = con.prepareStatement(sql);

      statement.setDouble(1, precioFiltro);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      System.out.println();
      System.out.println("Productos de precio superior a " + precioFiltro);
      System.out.println();

      while (rs.next()) {
        String pname = rs.getString("productName");
        String pvendor = rs.getString("productVendor");
        String pdescription = rs.getString("productDescription");
        Double pbuyprice = rs.getDouble("buyPrice");

        System.out.println("Nombre del Producto: " + pname);
        System.out.println("Proveedor: " + pvendor);
        System.out.println("Descripción: " + pdescription);
        System.out.println("Precio de Compra: " + pbuyprice);
        System.out.println();
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  // InfoPagos() que solicita al usuario el número del cliente (customerNumber) y muestra por
  // pantalla el nombre del cliente, el checkNumber, el paymentDate y la cantidad de todos los pagos
  // (payments) que ha realizado.

  public static void InfoPagos() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca el número del cliente: ");
    int numCliente = sc.nextInt();
    sc.nextLine();

    System.out.println();
    System.out.println("Informe de Pagos del cliente " + numCliente);
    System.out.println();

    try {
      Connection con = ConexionBD.getConnection();

      String sql =
          "SELECT c.customerName, p.checkNumber, p.paymentDate, p.amount\n"
              + "FROM customers c JOIN payments p on c.customerNumber = p.customerNumber\n"
              + "WHERE c.customerNumber = ?";

      PreparedStatement statement = con.prepareStatement(sql);

      statement.setDouble(1, numCliente);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {
        String cname = rs.getString("c.customerName");
        String cnumber = rs.getString("p.checkNumber");
        String pdate = rs.getString("p.paymentDate");
        Double pamount = rs.getDouble("p.amount");

        System.out.println("Nombre del Cliente: " + cname);
        System.out.println("Check Number: " + cnumber);
        System.out.println("Payment Date: " + pdate);
        System.out.println("Amount: " + pamount);
        System.out.println();
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  // informeCategoria() que solicitará al usuario el nombre de una categoría (productLine)
  // determinada y mostará el nombre de todos los productos de dicha categoría así como las unidades
  // vendidas para cada uno de esos productos y el precio de cada unidad (priceEach).

  public static void informeCategoria() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca el nombre de la categoría: ");
    String categoria = sc.nextLine();

    System.out.println();
    System.out.println("Informe de la categoría " + categoria);
    System.out.println();

    try {
      Connection con = ConexionBD.getConnection();

      String sql =
          "SELECT p.productName, o.quantityOrdered, o.priceEach\n"
              + "FROM products p JOIN orderdetails o on p.productCode = o.productCode\n"
              + "WHERE p.productLine = ?";

      PreparedStatement statement = con.prepareStatement(sql);

      statement.setString(1, categoria);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {
        String pname = rs.getString("p.productName");
        String qorder = rs.getString("o.quantityOrdered");
        Double peach = rs.getDouble("o.priceEach");

        System.out.println("Nombre del Producto: " + pname);
        System.out.println("Unidades Vendidas: " + qorder);
        System.out.println("Precio por Unidad: " + peach);
        System.out.println();
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
