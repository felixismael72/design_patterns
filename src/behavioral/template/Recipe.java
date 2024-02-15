package behavioral.template;

public abstract class Recipe {
  public void cook() {
    prepareIngredients();
    cookDish();
    serveDish();
  }

  protected abstract void prepareIngredients();

  protected abstract void cookDish();

  protected abstract void serveDish();

}
