package U9.U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaciones {

  // Insertar un nuevo empleado (employee) y dos clientes que estén asociados a este nuevo empleado.

  public static void insertarUnEmpledoYDosClientes() {
    Connection con = ConexionBD.getConnection();

    try {
      con.setAutoCommit(false);

      // INSERT empleado
      String sql = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement statement = con.prepareStatement(sql);

      statement.setInt(1, 2000);
      statement.setString(2, "Gonzalez");
      statement.setString(3, "Antonio");
      statement.setString(4, "x1234");
      statement.setString(5, "antoniogonzalez@gmail.com");
      statement.setString(6, "4");
      statement.setInt(7, 1102);
      statement.setString(8, "Developer");

      statement.executeUpdate();

      // INSERT cliente 1
      sql = "INSERT INTO customers VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setInt(1, 601);
      statement.setString(2, "La Barraca");
      statement.setString(3, "Peperoni");
      statement.setString(4, "Pepe");
      statement.setString(5, "666999123");
      statement.setString(6, "Caye Mayor 23");
      statement.setString(7, null);
      statement.setString(8, "Cadiz");
      statement.setString(9, null);
      statement.setString(10, "11011");
      statement.setString(11, "Spain");
      statement.setInt(12, 2000);
      statement.setDouble(13, 1234.12);

      statement.executeUpdate();

      // INSERT cliente 2
      sql = "INSERT INTO customers VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setInt(1, 602);
      statement.setString(2, "Michico");
      statement.setString(3, "Peperoni");
      statement.setString(4, "Tony");
      statement.setString(5, "666123999");
      statement.setString(6, "Caye Ancha 32");
      statement.setString(7, null);
      statement.setString(8, "Cadiz");
      statement.setString(9, null);
      statement.setString(10, "11011");
      statement.setString(11, "Spain");
      statement.setInt(12, 2000);
      statement.setDouble(13, 4321.21);

      statement.executeUpdate();

      con.commit();
      System.out.println("Inserciones realizadas correctamente");

    } catch (SQLException e) {
      System.out.println("error: " + e.getMessage());
      try {
        if (con != null) {
          System.out.println("ERROR al insertar. Se realiza rollback");
          con.rollback();
        }
      } catch (SQLException throwables) {
        System.out.println("Error en el rollback");
        throwables.printStackTrace();
      }
    }
  }

  // Insertar una nueva oficina en Tokyo y trasladar todos los empleados de Tokyo a la nueva
  // oficina.

  public static void insertarOficinaTokyoYTrasladarEmpleados() {

    Connection con = ConexionBD.getConnection();

    try {
      con.setAutoCommit(false);

      // INSERT Oficina
      String sql = "INSERT INTO offices VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement statement = con.prepareStatement(sql);

      statement.setString(1, "8");
      statement.setString(2, "Tokyo");
      statement.setString(3, "+81 12 123 1234");
      statement.setString(4, "1-4 IchoKio");
      statement.setString(5, null);
      statement.setString(6, "Chiyoda-Ku");
      statement.setString(7, "Japan");
      statement.setString(8, "123-1234");
      statement.setString(9, "Japan");

      statement.executeUpdate();

      // UPDATE traslado empleados.

      sql = "UPDATE employees SET officeCode = 8 WHERE officeCode = 5";
      statement = con.prepareStatement(sql);

      statement.executeUpdate();

      con.commit();
      System.out.println("Inserción y traslado realizados correctamente");

    } catch (SQLException e) {
      System.out.println(e.getMessage());
      try {
        if (con != null) {
          System.out.println("ERROR al insertar. Se realiza rollback");
          con.rollback();
        }
      } catch (SQLException throwables) {
        System.out.println("Error en el rollback");
        throwables.printStackTrace();
      }
    }
  }
}
