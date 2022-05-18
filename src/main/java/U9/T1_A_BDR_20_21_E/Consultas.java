package U9.T1_A_BDR_20_21_E;

import U9.T2.ConexionBD;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
  public static void main(String[] args) {
    PagosCliente();

    InfoPedido();
  }

  // PagosCliente() que solicita al usuario un número de cliente (customerNumber) y muestre por
  // pantalla el nombre del cliente (contactFirstName), su apellido (contactLastName), país
  // (country) y la suma de todos los pagos realizados por dicho cliente. Esta consulta será
  // realizada con un Statement.
  public static void PagosCliente() {
    Scanner sc = new Scanner(System.in);

    try {
      Connection con = ConexionBD.getConnection();

      Statement statement = con.createStatement();
      statement.setQueryTimeout(30);

      System.out.println("Introduzca un número de cliente:");
      int numCliente = sc.nextInt();

      ResultSet rs =
          statement.executeQuery(
              "SELECT c.contactFirstName, c.contactLastName, c.country, SUM(p.amount)\n"
                  + "FROM customers c JOIN payments p on c.customerNumber = p.customerNumber\n"
                  + "WHERE c.customerNumber = "
                  + numCliente);

      while (rs.next()) {

        System.out.println("Cliente: " + numCliente);

        System.out.print("Nombre: ");
        System.out.println(rs.getString("c.contactFirstName"));

        System.out.print("Apellido: ");
        System.out.println(rs.getString("c.contactLastName"));

        System.out.print("País: ");
        System.out.println(rs.getString("c.country"));

        System.out.print("Suma Pagos: ");
        System.out.println(rs.getString("SUM(p.amount)"));
      }
      System.out.println();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  // InfoPedido() que solicita al usuario el número del pedido (orderNumber) y muestra por pantalla
  // el nombre, precio y cantidad de todos los productos incluídos en el pedido así como el coste
  // total del mismo. Está consulta será realizada con un PreparedStatement.

  public static void InfoPedido() {
    Scanner sc = new Scanner(System.in);

    try {
      Connection con = ConexionBD.getConnection();

      String sql =
          "SELECT p.productName, o.priceEach, o.quantityOrdered\n"
              + "FROM orderdetails o join products p on p.productCode = o.productCode\n"
              + "WHERE o.orderNumber= ?";
      PreparedStatement statement = con.prepareStatement(sql);

      System.out.println("Introduzca un número de cliente:");
      int numPedido = sc.nextInt();

      statement.setInt(1, numPedido);

      ResultSet rs = statement.executeQuery();

      System.out.println("Pedido: " + numPedido);
      System.out.println();
      Double precioTotalPedido = 0.0;

      while (rs.next()) {
        String nombrePedido = rs.getString("p.productName");
        Double precio = rs.getDouble("o.priceEach");
        Integer cantidad = rs.getInt("o.quantityOrdered");

        System.out.println("Nombre Producto: " + nombrePedido);

        System.out.println("Precio: " + precio + "€");

        System.out.println("Cantidad: " + cantidad);

        System.out.println();

        precioTotalPedido += (precio * cantidad);
      }
      System.out.println("Precio total: " + precioTotalPedido + "€");
      System.out.println();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  // DatosJefe() que solicita el número de un empleado (employeeNumber) y muestra por pantalla el
  // nombre(firstName) y los apellidos(lastName) de su jefe. Está consulta será realizada con un
  // PreparedStatement.

  public static void DatosJefe() {
    Scanner sc = new Scanner(System.in);

    try {

      Connection con = ConexionBD.getConnection();

      String sql =
          "SELECT firstName, lastName\n"
              + "FROM employees\n"
              + "WHERE employeeNumber = (SELECT reportsTo \n"
              + "                        FROM employees \n"
              + "                        WHERE employeeNumber = 1056)";

      PreparedStatement statement = con.prepareStatement(sql);

      System.out.println("Introduzca un número de cliente:");
      int numPedido = sc.nextInt();

      // NO ESTÁ TERMINADO

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
