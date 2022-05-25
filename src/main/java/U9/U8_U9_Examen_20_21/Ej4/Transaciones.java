package U9.U8_U9_Examen_20_21.Ej4;

import U9.U9_Entregable.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaciones {

  public static void insertarPedido() {

    Connection con = ConexionBD.getConnection();

    try {
      con.setAutoCommit(false);

      // INSERT pedido
      String sql = "INSERT INTO orders VALUES (?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement statement = con.prepareStatement(sql);

      statement.setInt(1, 11112);
      statement.setString(2, "2022-05-20");
      statement.setString(3, "2022-05-25");
      statement.setString(4, null);
      statement.setString(5, "In Process");
      statement.setString(6, "asd");
      statement.setInt(7, 103);

      statement.executeUpdate();

      // INSERT 1 detalle de pedido

      sql = "INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setInt(1, 11112);
      statement.setString(2, "S18_2248");
      statement.setInt(3, 5);
      statement.setDouble(4, 5.5);
      statement.setInt(5, 6);

      statement.executeUpdate();

      // INSERT 2 detalle de pedido

      sql = "INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)";
      statement = con.prepareStatement(sql);

      statement.setInt(1, 11112);
      statement.setString(2, "S18_1749");
      statement.setInt(3, 7);
      statement.setDouble(4, 7.7);
      statement.setInt(5, 8);

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
