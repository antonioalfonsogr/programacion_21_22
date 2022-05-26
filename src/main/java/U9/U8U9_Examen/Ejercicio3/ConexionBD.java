package U9.U8U9_Examen.Ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  private static Connection con = null;

  public static Connection getConnection() {
    try {
      if (con == null) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:8093/classicmodels?autoReconnect=true";
        String pwd = "programacion";
        String usr = "programacion";
        Class.forName(driver);
        con = DriverManager.getConnection(url, usr, pwd);
        System.out.println("Connection Succesfull");
      }
    } catch (ClassNotFoundException | SQLException ex) {
      ex.printStackTrace();
    }
    return con;
  }

  public static void close() {
    try {
      if (con != null) {
        con.close();
        System.out.println("Connection close");
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
