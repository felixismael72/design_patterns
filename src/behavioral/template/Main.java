package behavioral.template;

public class Main {
  public static void main(String[] args) {
    System.out.println("Cooking Pizza:");
    Recipe pizzaRecipe = new PizzaRecipe();
    pizzaRecipe.cook();

    System.out.println();

    System.out.println("Cooking Pasta:");
    Recipe pastaRecipe = new PastaRecipe();
    pastaRecipe.cook();
  }
}
