package U9.U8U9_Examen.Ejercicio4;

import U9.U9_Entregable.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaciones {

  public static void insertarLineaProducto() {

    Connection con = ConexionBD.getConnection();

    try {
      con.setAutoCommit(false);

      // INSERT productLine
      String sql = "INSERT INTO productlines VALUES (?, ?, ?, ?)";
      PreparedStatement statement = con.prepareStatement(sql);

      statement.setString(1, "Cosas");
      statement.setString(2, "Descripción");
      statement.setString(3, null);
      statement.setString(4, null);

      statement.executeUpdate();

      // INSERT product 1
      sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setString(1, "S11_1111");
      statement.setString(2, "Producto Uno");
      statement.setString(3, "Cosas");
      statement.setString(4, "1:11");
      statement.setString(5, "La tienda");
      statement.setString(6, "Descripción producto uno");
      statement.setInt(7, 1111);
      statement.setDouble(8, 11.11);
      statement.setDouble(9, 111.11);

      statement.executeUpdate();

      // INSERT product 2
      sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setString(1, "S22_2222");
      statement.setString(2, "Producto dos");
      statement.setString(3, "Cosas");
      statement.setString(4, "1:12");
      statement.setString(5, "Otra tienda ");
      statement.setString(6, "Descripción producto dos");
      statement.setInt(7, 2222);
      statement.setDouble(8, 22.22);
      statement.setDouble(9, 222.22);

      statement.executeUpdate();

      con.commit();
      System.out.println("Inserción correcta");
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
