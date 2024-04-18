package chain.officer;

import chain.message.Message;

public class General extends Officer {

  private static final int CODE = 20;
  private static final String NAME = "Generał Kowalski";
  @Override
  public void processMessage(Message message) {
    if(message.getOfficerRank().equals(OfficerRank.GENERAL)
      && message.getCode() == CODE){
      System.out.println(NAME + " otrzymał wiadomosć: " + message.getContent());
    } else {
      System.out.println("Zły adresat lub zły kod szyfrujący!");
    }
  }
}
