package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
  private String name;
  private String position;
  private double salary;
  private List<Employee> subordinates = new ArrayList<>();

  public Manager(String name, String position, double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public void addEmployee(Employee employee) {
    subordinates.add(employee);
  }

  public void removeEmployee(Employee employee) {
    subordinates.remove(employee);
  }

  @Override
  public void showDetails() {
    System.out.println("Manager: [Name: " + name + ", Position: " + position + ", Salary: $" + salary + "]");
    for (Employee employee : subordinates) {
      employee.showDetails();
    }
  }

  @Override
  public double salariesSum() {
    double salariesSum = salary;
    for (Employee subordinate : subordinates) {
      salariesSum += subordinate.salariesSum();
    }
    return salariesSum;
  }

  @Override
  public double getSalary() {
    return salary;
  }
}
