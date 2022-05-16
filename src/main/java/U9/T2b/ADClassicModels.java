package U9.T2b;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADClassicModels {

  Scanner teclado = new Scanner(System.in);

  Connection con = ConexionBD.getConnection();

  private List<Employee> empleados = new ArrayList<>();
  private List<Office> oficinas = new ArrayList<>();

  public ADClassicModels() {}

  public List getEmpleados() {
    try {
      Statement statement = con.createStatement();
      statement.setQueryTimeout(30);
      ResultSet rs = statement.executeQuery("select * from employees");
      while (rs.next()) {
        Employee e =
            new Employee(
                rs.getInt("employeeNumber"),
                rs.getString("lastName"),
                rs.getString("firstName"),
                rs.getString("extension"),
                rs.getString("email"),
                rs.getInt("officeCode"),
                rs.getInt("reportsTo"),
                rs.getString("jobTitle"));
        empleados.add(e);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return empleados;
  }

  public List getOffices() {
    try {
      Statement statement = con.createStatement();
      statement.setQueryTimeout(30);
      ResultSet rs = statement.executeQuery("select * from offices");
      while (rs.next()) {
        Office o =
            new Office(
                rs.getInt("officeCode"),
                rs.getString("city"),
                rs.getString("phone"),
                rs.getString("addressLine1"),
                rs.getString("addressLine2"),
                rs.getString("state"),
                rs.getString("country"),
                rs.getString("postalCode"),
                rs.getString("territory"));
        oficinas.add(o);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return oficinas;
  }

  public void insertarCliente() {

    System.out.println("\n  - Introduzca los datos del cliente:");
    System.out.println("customerNumber: ");
    Integer customerNumber = teclado.nextInt();
    System.out.println("customerName: ");
    String customerName = teclado.next();
    System.out.println("contactLastName: ");
    String contactLastName = teclado.next();
    System.out.println("contactFirstName: ");
    String contactFirstName = teclado.next();
    System.out.println("phone: ");
    String phone = teclado.next();
    System.out.println("addressLine1: ");
    String addressLine1 = teclado.next();
    System.out.println("addressLine2: ");
    String addressLine2 = teclado.next();
    System.out.println("postalCode: ");
    String postalCode = teclado.next();
    System.out.println("city: ");
    String city = teclado.next();
    System.out.println("state: ");
    String state = teclado.next();
    System.out.println("country: ");
    String country = teclado.next();
    System.out.println("salesRepEmployeeNumber: ");
    Integer salesRepEmployeeNumber = teclado.nextInt();
    System.out.println("creditLimit: ");
    String creditLimit = teclado.next();

    try {

      String sql =
          "INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
              + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
      PreparedStatement prepstatement = con.prepareStatement(sql);
      prepstatement.setQueryTimeout(30);

      prepstatement.setInt(1, customerNumber);
      prepstatement.setString(2, customerName);
      prepstatement.setString(3, contactLastName);
      prepstatement.setString(4, contactFirstName);
      prepstatement.setString(5, phone);
      prepstatement.setString(6, addressLine1);
      prepstatement.setString(7, postalCode);
      prepstatement.setString(8, city);
      prepstatement.setString(9, state);
      prepstatement.setString(10, addressLine2);
      prepstatement.setString(11, country);
      prepstatement.setInt(12, salesRepEmployeeNumber);
      prepstatement.setString(13, creditLimit);

      prepstatement.executeUpdate();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  public void AsignarEmpleadoCliente() {

    System.out.println("Introduzca el ID del EMPLEADO: ");
    Integer idemp = teclado.nextInt();
    System.out.println("Introduzca el ID del CLIENTE: ");
    Integer idcli = teclado.nextInt();

    Boolean existeemp = false;

    for (Employee e : empleados) {
      if (idemp.equals(e.getEmployeeNumber())) {
        existeemp = true;
      }
    }

    Boolean existecli = false;

    try {
      Statement statement = con.createStatement();
      statement.setQueryTimeout(30);
      ResultSet rs =
          statement.executeQuery(
              "select customerNumber from customers where customerNumber = " + idcli + "");
      while (rs.next()) {

        rs.getInt("customerNumber");

        if (rs.getInt("customerNumber") == idcli) {
          existecli = true;
        }
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

    if (existecli && existeemp) {

      try {

        String sql =
            "UPDATE customers SET salesRepEmployeeNumber = "
                + idemp
                + " WHERE customerNumber = "
                + idcli
                + "";
        PreparedStatement prepstatement = con.prepareStatement(sql);
        prepstatement.setQueryTimeout(30);

        prepstatement.executeUpdate();

      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }

    } else {
      System.out.println("ERROR: ALGUNO DE LOS CAMPOS NO EXISTE");
    }
  }
}
