package structural.composite;

public class Main {
  public static void main(String[] args) {
    Employee dev1 = new Developer("John", "Software Engineer", 5000);
    Employee dev2 = new Developer("Alice", "Frontend Developer", 5500);
    Employee dev3 = new Developer("Bob", "Backend Developer", 6000);

    Manager manager = new Manager("Tom", "Development Manager", 8000);
    manager.addEmployee(dev1);
    manager.addEmployee(dev2);
    manager.addEmployee(dev3);

    Department developmentDept = new Department("Development Department");
    developmentDept.addEmployee(manager);

    System.out.println("Development Department Details:");
    developmentDept.showDetails();

    System.out.println("Total Salary of Development Department: $" + developmentDept.salariesSum());
  }
}
