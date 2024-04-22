package strategy.discount;

public interface PricingStrategy {
  void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
