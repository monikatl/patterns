package visitor.activity;

import visitor.visitor.Visitor;

public class Weights implements Activity {
  private int weigh;
  private int reps;

  public Weights(int weigh, int reps) {
    this.weigh = weigh;
    this.reps = reps;
  }

  public int getWeigh() {
    return weigh;
  }

  public int getReps() {
    return reps;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
