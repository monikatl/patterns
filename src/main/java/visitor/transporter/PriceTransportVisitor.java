package visitor.transporter;

public class PriceTransportVisitor implements TransportVisitor {
  @Override
  public void visit(Animal animal) {
    double price = animal.getWeight()*0.2;
    System.out.println("Price per kilometer for an animal: "
      + price + " PLN");
  }

  @Override
  public void visit(Person person) {
    int price = 6;
    if (person.isRegularCustomer()) {
      price = price / 2;
    }
    System.out.println("Price per kilometer for a person: "
      + price + " PLN");
  }

  @Override
  public void visit(Shipment shipment) {
    int price = 2;
    if(shipment.isLarge()) {
      price = price * 3;
    }
    System.out.println("Price per kilometer for a shipment: " + price + " PLN");

  }
}
