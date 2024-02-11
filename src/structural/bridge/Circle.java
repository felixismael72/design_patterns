package structural.bridge;

public class Circle extends Shape {
  public Circle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Drawing circle...");
    color.fill();
  }
}
