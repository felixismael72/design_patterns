package behavioral.template;

public class PizzaRecipe extends Recipe {
  @Override
  protected void prepareIngredients() {
    System.out.println("Prepare pizza dough, sauce, and toppings");
  }

  @Override
  protected void cookDish() {
    System.out.println("Bake pizza in the oven");
  }

  @Override
  protected void serveDish() {
    System.out.println("Serve hot pizza slices");
  }
}
