package structural.composite;

public class Developer implements Employee {
  private String name;
  private String position;
  private double salary;

  public Developer(String name, String position, double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  @Override
  public void showDetails() {
    System.out.println("Developer: [Name: " + name + ", Position: " + position + ", Salary: $" + salary + "]");
  }

  @Override
  public double salariesSum() {
    return salary;
  }

  @Override
  public double getSalary() {
    return salary;
  }
}
