package behavioral.visitor;

public class Guest implements Visitable {
  private String name;

  public Guest(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
