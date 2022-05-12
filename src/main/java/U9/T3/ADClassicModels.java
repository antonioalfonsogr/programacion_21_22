package U9.T3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

  Connection con = ConexionBD.getConnection();

  public List<Employee> getEmpleados() {
    List<Employee> employeeList = new ArrayList<>();

    try {

      PreparedStatement statement = con.prepareStatement("select * from employees");

      // statement.setString(1, "Murphy");

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {

        Employee e =
            new Employee(
                rs.getInt("employeeNumber"),
                rs.getString("lastName"),
                rs.getString("firstName"),
                rs.getString("firstName"),
                rs.getString("email"),
                rs.getString("officeCode"),
                rs.getInt("reportsTo"),
                rs.getString("reportsTo"));

        employeeList.add(e);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return employeeList;
  }

  public List<Office> getOffices() {
    List<Office> officeList = new ArrayList<>();

    try {
      Statement statement = con.createStatement();
      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery("select * from offices");

      while (rs.next()) {

        Office o =
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

        officeList.add(o);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return officeList;
  }
}
