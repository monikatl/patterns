package visitor.activity;

import visitor.visitor.Visitor;
import visitor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Treadmill treadmill = new Treadmill(200);
    Squash squash = new Squash(45);
    Weights weights = new Weights(50, 10);

    VisitorImpl visitor = new VisitorImpl();

    List<Activity> activities = Arrays.asList(treadmill, squash, weights);
    activities.forEach(activity -> activity.accept(visitor));
  }
}
