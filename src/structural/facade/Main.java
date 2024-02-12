package structural.facade;

public class Main {
  public static void main(String[] args) {
    RestaurantFacade restaurant = new RestaurantFacade();

    restaurant.placeOrder("Burger");
    restaurant.placeOrder("Pizza");
    restaurant.placeOrder("Sushi");
  }
}
