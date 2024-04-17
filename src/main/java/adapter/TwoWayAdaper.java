package adapter;

public class TwoWayAdaper implements UkDevice, ContinentalDevice{

  UkDevice ukDevice;
  ContinentalDevice continentalDevice;

  public TwoWayAdaper(UkDevice ukDevice, ContinentalDevice continentalDevice) {
    this.ukDevice = ukDevice;
    this.continentalDevice = continentalDevice;
  }

  @Override
  public void on() {
    ukDevice.powerOn();
  }

  @Override
  public void powerOn() {
    continentalDevice.on();
  }
}
