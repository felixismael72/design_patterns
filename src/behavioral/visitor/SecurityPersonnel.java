package behavioral.visitor;

public class SecurityPersonnel implements Visitor {
  @Override
  public void visit(Employee employee) {
    System.out.println("Performing security check on employee: " + employee.getName());
  }

  @Override
  public void visit(Guest guest) {
    System.out.println("Performing security check on guest: " + guest.getName());
  }

  @Override
  public void visit(DeliveryPersonnel deliveryPersonnel) {
    System.out.println("Inspecting package carried by delivery personnel");
  }
}
