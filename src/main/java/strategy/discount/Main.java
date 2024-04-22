package strategy.discount;

public class Main {
  public static void main(String[] args) {
    PriceCalculator pC = new PriceCalculator();
    pC.setPricingStrategy(new SalePrice());
    pC.calculate(245, true);
  }
}
