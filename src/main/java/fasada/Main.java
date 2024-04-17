package fasada;
// izolacja systemu
// względy bezpieczeństwa

import fasada.bank.AtmMachineFacade;
import fasada.deliverybox.DeliveryBoxFacade;

public class Main {
  public static void main(String[] args) {
    DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
    deliveryBoxFacade.pickupPackage();

    AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
    atmMachineFacade.withdrawMoney();
  }
}
