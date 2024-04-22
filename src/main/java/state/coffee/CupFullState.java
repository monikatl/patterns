package state.coffee;

public class CupFullState implements State {
  @Override
  public void insertTheCoin(CoffeeMachine coffeeMachine) {
    System.out.println("Zabierz kubek");
  }

  @Override
  public void pushTheButton(CoffeeMachine coffeeMachine) {
    System.out.println("Zabierz najpierw kubek");
  }

  @Override
  public void takeTheCup(CoffeeMachine coffeeMachine) {
    System.out.println("Zabrano kubek");
    coffeeMachine.state = new NoCoinState();
  }

  @Override
  public void returnTheCOin(CoffeeMachine coffeeMachine) {
    System.out.println("Za późno");
  }
}
