package strategy.chef;

public class HardBoiledEgCooker implements EggCooker {
  @Override
  public void cookEgg() {
    System.out.println("Gotuję jajka na twardo.");
  }
}
