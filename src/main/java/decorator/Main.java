package decorator;

public class Main {
  public static void main(String[] args) {
    generateMap();
  }

  private static void generateMap() {
    Terrain terrain = new Plain();
    Terrain terrain1 = new Hill();
    Terrain terrain2 = new SwampDecorator(new Hill());
    Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));
  }

}
