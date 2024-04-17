package adapter;

public class UKToContinentalAdapter implements ContinentalDevice {

  UkDevice device;

  public UKToContinentalAdapter(UkDevice device) {
    this.device = device;
  }

  public void on() {
    device.powerOn();
  }




}
