package structural.facade.restaurant_subsystem;

public class Waiter {
  public void serveFood(MenuItem menuItem) {
    System.out.println("Serving " + menuItem.getName() + "...");
  }
}
