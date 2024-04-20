package visitor.visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmill;
import visitor.activity.Weights;

public class VisitorImpl implements Visitor{
  @Override
  public void visit(Treadmill treadmill) {
    System.out.println("Calories burned running on treadmill: " + treadmill.getDistance()*10);
  }

  @Override
  public void visit(Squash squash) {
    System.out.println("Calories burned running on squash: " + squash.getMinutesPlayed()*20);
  }

  @Override
  public void visit(Weights weights) {
    System.out.println("Calories burned running on weights: " + weights.getReps()*weights.getWeigh());
  }
}
