package strategy.discount;

public class PriceCalculator {

  private PricingStrategy pricingStrategy;

  public void calculate(int price, boolean isSignedUpForNewsletter) {
    this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
  }

  public void setPricingStrategy(PricingStrategy pricingStrategy) {
    this.pricingStrategy = pricingStrategy;
  }

}
