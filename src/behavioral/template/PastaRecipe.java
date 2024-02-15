package behavioral.template;

public class PastaRecipe extends Recipe {
  @Override
  protected void prepareIngredients() {
    System.out.println("Boil water and cook pasta");
    System.out.println("Prepare pasta sauce and toppings");
  }

  @Override
  protected void cookDish() {
    System.out.println("Mix cooked pasta with sauce and toppings");
  }

  @Override
  protected void serveDish() {
    System.out.println("Serve hot pasta dish");
  }
}
