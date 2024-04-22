package strategy.chef;

public class Main {
  public static void main(String[] args) {
    // new order - jajka na twardo

    Chef chef = new Chef("Gordon Gessler");
    chef.setEggCooker(new HardBoiledEgCooker());
    chef.cook();

    // set strategy
    // we can set strategy during run time
    // new order - jajka na miękko!
    chef.setEggCooker(new SoftBoiledEggCooker());
    chef.cook();
  }
}
