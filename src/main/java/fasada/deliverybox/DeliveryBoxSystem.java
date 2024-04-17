package fasada.deliverybox;

class DeliveryBoxSystem {

  public void sendNotification() {
    System.out.println("Text message send to the client.");
  }

  public boolean isPaymentSecured() {
    System.out.println("Payment has beeen secured.");
    return true;
  }

  public boolean isUserDataValidated() {
    System.out.println("User data has been validated.");
    return true;
  }

  public void sheduleDelivery() {
    System.out.println("Delivery has been scheduled.");
  }

}
