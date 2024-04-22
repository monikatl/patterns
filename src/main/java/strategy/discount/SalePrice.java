package strategy.discount;

public class SalePrice implements PricingStrategy{
  @Override
  public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
    if(isSignedUpForNewsletter){
      System.out.println("Sale: " + price/2 + " zł");
    } else {
      System.out.println("Użytkownik nie jest zapisany do newslettera. Należy wybrać inną strategię cenową!");
    }
  }
}
