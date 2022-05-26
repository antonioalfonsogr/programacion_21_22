package U9.U8U9_Examen.Ejercicio3;

import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

  // Crear una clase llamada Consultas (siempre con PreparedStatements) que implemente la siguiente
  // función:

  // List<Employee> MostrarEmpleados() que requerirá al usuario un código de oficina, y devolverá la
  // lista de empleados de esa oficina. Posteriormente, en el programa principal desde donde se
  // llame a esta función, se utilizará esta lista de empleados para mostrar toda esa información en
  // formato JSON por pantalla (no es necesario que esté formateada correctamente).

  private static List<Employee> employeeList = new ArrayList<>();

  public static List<Employee> MostrarEmpleados() {

    try {
      Scanner sc = new Scanner(System.in);

      Connection con = ConexionBD.getConnection();

      System.out.println("Introduzca código de la oficina: ");
      int codigoOficina = sc.nextInt();
      sc.nextLine();

      String sql = "SELECT * FROM employees WHERE officeCode= ?";

      PreparedStatement statement = con.prepareStatement(sql);

      statement.setInt(1, codigoOficina);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {

        Employee e =
            new Employee(
                rs.getInt("employeeNumber"),
                rs.getString("lastName"),
                rs.getString("firstName"),
                rs.getString("extension"),
                rs.getString("email"),
                rs.getString("officeCode"),
                rs.getInt("reportsTo"),
                rs.getString("jobTitle"));

        employeeList.add(e);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return employeeList;
  }
}
