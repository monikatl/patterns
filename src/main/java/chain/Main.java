package chain;

import chain.message.Message;
import chain.officer.*;

public class Main {
  public static void main(String[] args) {
    Message message = new Message("Atakować!", 40, OfficerRank.CAPTAIN);

    Officer sergeant = new Sergeant();
    Officer captain = new Captain();
    Officer general = new General();

    sergeant.setSuperiorOfficer(captain);
    captain.setSuperiorOfficer(general);

    sergeant.processMessage(message);


  }
}
