package visitor.transporter;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Cat", 12);
    Person person = new Person("Monika", "Baszczyk", true);
    Shipment shipment = new Shipment("PL", "23", false);

    PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();
    List<Transportable> transportables = Arrays.asList(animal, person, shipment);

    transportables.forEach(transportable -> transportable.accept(priceTransportVisitor));


    NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();

    transportables.forEach(transportable -> transportable.accept(nameTransportVisitor));
  }
}
