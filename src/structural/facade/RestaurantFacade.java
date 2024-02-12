package structural.facade;

import structural.facade.restaurant_subsystem.*;

public class RestaurantFacade {
  private Menu menu;
  private Kitchen kitchen;
  private Waiter waiter;

  public RestaurantFacade() {
    this.menu = new Menu();
    this.kitchen = new Kitchen();
    this.waiter = new Waiter();
  }

  public void placeOrder(String itemName) {
    MenuItem menuItem = menu.findItem(itemName);
    if (menuItem != null) {
      kitchen.prepareFood(menuItem);
      waiter.serveFood(menuItem);
    } else {
      System.out.println("Sorry, the item '" + itemName + "' is not available.");
    }
  }
}
