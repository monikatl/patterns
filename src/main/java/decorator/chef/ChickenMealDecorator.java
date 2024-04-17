package decorator.chef;

public class ChickenMealDecorator extends MealDecorator {
  public ChickenMealDecorator(Meal meal) {
    super(meal);
  }

  @Override
  public void prepareMeal() {
    meal.prepareMeal();
    addChicken();
  }

  private void addChicken() {
    System.out.println("Dodaję kurczaczka.");
  }
}
