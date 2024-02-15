package behavioral.visitor;

public class Main {
  public static void main(String[] args) {
    SecurityPersonnel securityPersonnel = new SecurityPersonnel();

    Employee employee = new Employee("John Doe");
    Guest guest = new Guest("Jane Smith");
    DeliveryPersonnel deliveryPersonnel = new DeliveryPersonnel();

    employee.accept(securityPersonnel);
    guest.accept(securityPersonnel);
    deliveryPersonnel.accept(securityPersonnel);
  }
}
