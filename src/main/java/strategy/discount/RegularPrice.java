package strategy.discount;

public class RegularPrice implements PricingStrategy {
  @Override
  public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
    if(!isSignedUpForNewsletter){
      System.out.println("Cena: " + price + " zł");
    } else {
      System.out.println("Użytkownik zapisany do newslettera. Należy wybrać inną strategię cenową!");
    }
  }
}
