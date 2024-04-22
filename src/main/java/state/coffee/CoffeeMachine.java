package state.coffee;

public class CoffeeMachine {

  State state;

  public CoffeeMachine() {
    this.state = new NoCoinState();
  }

  public void insertTheCoin() {
   state.insertTheCoin(this);
  }

  public void pushTheButton() {
    state.pushTheButton(this);
  }

  public void takeTheCup() {
    state.takeTheCup(this);
  }
}
