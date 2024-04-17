package decorator.chef;

public class ShrimpMealDecorator extends MealDecorator{
  public ShrimpMealDecorator(Meal meal) {
    super(meal);
  }

  @Override
  public void prepareMeal() {
    meal.prepareMeal();
    addShrimp();
  }

  private void addShrimp() {
    System.out.println("Do dania dodaję krewetki.");
  }
}
