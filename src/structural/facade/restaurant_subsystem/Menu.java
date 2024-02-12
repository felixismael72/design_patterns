package structural.facade.restaurant_subsystem;

import java.util.HashMap;
import java.util.Map;

public class Menu {
  private Map<String, MenuItem> items;

  public Menu() {
    items = new HashMap<>();
    items.put("Burger", new MenuItem("Burger", 5.99));
    items.put("Pizza", new MenuItem("Pizza", 8.99));
    items.put("Salad", new MenuItem("Salad", 4.99));
  }

  public MenuItem findItem(String itemName) {
    return items.get(itemName);
  }
}
