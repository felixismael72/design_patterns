package behavioral.visitor;

public class DeliveryPersonnel implements Visitable {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
