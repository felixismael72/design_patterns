package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private List<Employee> employees = new ArrayList<>();

  public Department(String name) {
    this.name = name;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  public void showDetails() {
    System.out.println("Department: " + name);
    for (Employee employee : employees) {
      employee.showDetails();
    }
  }

  public double salariesSum() {
    double salariesSum = 0;
    for (Employee employee : employees) {
      salariesSum += employee.salariesSum();
    }
    return salariesSum;
  }

  public double getSalary() {
    double totalSalary = 0;
    for (Employee employee : employees) {
      totalSalary += employee.getSalary();
    }
    return totalSalary;
  }
}
