package structural.bridge;

public class Main {
  public static void main(String[] args) {
    Shape redCircle = new Circle(new Red());
    Shape blueSquare = new Square(new Blue());

    redCircle.draw();
    blueSquare.draw();
  }
}
