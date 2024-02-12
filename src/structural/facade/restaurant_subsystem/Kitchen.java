package structural.facade.restaurant_subsystem;

public class Kitchen {
  public void prepareFood(MenuItem menuItem) {
    System.out.println("Preparing " + menuItem.getName() + "...");
  }
}
