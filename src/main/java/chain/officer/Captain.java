package chain.officer;

import chain.message.Message;

public class Captain extends Officer {
  private static final int CODE = 15;
  private static final String NAME = "Kapitan Kowalski";
  @Override
  public void processMessage(Message message) {
    if(message.getOfficerRank().equals(OfficerRank.CAPTAIN)
      && message.getCode() == CODE){
      System.out.println(NAME + " otrzymał wiadomosć: " + message.getContent());
    } else {
      getSuperiorOfficer().processMessage(message);
    }
  }
}
