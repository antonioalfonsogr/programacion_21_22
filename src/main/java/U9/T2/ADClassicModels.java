package U9.T2;

import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

  public List<Employee> getEmpleados() {
    List<Employee> employeeList = new ArrayList<>();
    ConexionBD.getConnection();

    return employeeList;
  }

  public List<Office> getOffices() {
    List<Office> officeList = new ArrayList<>();

    return officeList;
  }
}
