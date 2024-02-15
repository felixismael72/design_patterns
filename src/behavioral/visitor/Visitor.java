package behavioral.visitor;

public interface Visitor {
  void visit(Employee employee);

  void visit(Guest guest);

  void visit(DeliveryPersonnel deliveryPersonnel);
}
