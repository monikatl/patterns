package visitor.transporter;

public class NameTransportVisitor implements TransportVisitor {
  @Override
  public void visit(Animal animal) {
    System.out.println("Animal: " + animal.getKind());
  }

  @Override
  public void visit(Person person) {
    System.out.println("Person: " + person.getFristName() + " " + person.getLastName());
  }

  @Override
  public void visit(Shipment shipment) {
    System.out.println("Shipment: " + shipment.getPrefix() + " " + shipment.getSerialNumber());
  }
}
