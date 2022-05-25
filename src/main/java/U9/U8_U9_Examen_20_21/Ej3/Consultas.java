package U9.U8_U9_Examen_20_21.Ej3;

import U9.T3.Employee;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

  // List<Office> MostrarOficinas() que devuelve una lista de oficina que se obtiene de la base de
  // datos  y que será utilizada para mostrar toda esa información en formato JSON por pantalla.

  private static List<Office> officeList = new ArrayList<>();

  public static List<Office> MostrarOficinas() {

    try {
      Connection con = ConexionBD.getConnection();

      String sql = "SELECT * FROM offices";

      PreparedStatement statement = con.prepareStatement(sql);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {

        Office e =
            new Office(
                rs.getString("officeCode"),
                rs.getString("city"),
                rs.getString("phone"),
                rs.getString("addressLine1"),
                rs.getString("addressLine2"),
                rs.getString("state"),
                rs.getString("country"),
                rs.getString("postalCode"),
                rs.getString("territory"));

        officeList.add(e);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return officeList;
  }

  public static void listToJson() {

    Gson gson = new Gson();

    String json_completo = gson.toJson(officeList);

    System.out.println(json_completo);
  }
}
