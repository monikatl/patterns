package visitor.transporter;

public interface Transportable {
  void accept(TransportVisitor transportVisitor);
}
