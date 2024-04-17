package adapter;

// ADAPTER - strukturalny
// cel: modyfikacja int tak aby dostosować dla potrzeb klienta
public class Main {
  public static void main(String[] args) {
    ContinentalDevice radio = () -> System.out.println("Gra muzyka");
    ContinentalSocket continentalSocket = new ContinentalSocket();
    continentalSocket.plugIn(radio);

    UkDevice angielskieRadio = () -> System.out.println("Gra angielska muzyka");
    UKSocket ukSocket = new UKSocket();
    ukSocket.plugIn(angielskieRadio);
    UKToContinentalAdapter adapter = new UKToContinentalAdapter(angielskieRadio);

    // adapter implementuje interfejs ContinentalDevice
    continentalSocket.plugIn(adapter);

    // za pomocą jednaego obiektu w dwie strony

    TwoWayAdaper twoWayAdaper = new TwoWayAdaper(angielskieRadio, radio);

    ukSocket.plugIn(twoWayAdaper);
    continentalSocket.plugIn(twoWayAdaper);

  }
}
