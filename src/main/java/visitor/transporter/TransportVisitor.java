package visitor.transporter;

public interface TransportVisitor {
  void visit(Animal animal);
  void visit(Person person);
  void visit(Shipment shipment);
}
