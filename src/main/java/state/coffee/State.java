package state.coffee;

public interface State {
  void insertTheCoin(CoffeeMachine coffeeMachine);

  void pushTheButton(CoffeeMachine coffeeMachine);

  void takeTheCup(CoffeeMachine coffeeMachine);

  void returnTheCOin(CoffeeMachine coffeeMachine);
}
