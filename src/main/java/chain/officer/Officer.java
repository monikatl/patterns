package chain.officer;

import chain.message.Message;

public abstract class Officer {

  private Officer superiorOfficer;

  public abstract void processMessage(Message message);

  public Officer getSuperiorOfficer() {
    return superiorOfficer;
  }

  public void setSuperiorOfficer(Officer superiorOfficer) {
    this.superiorOfficer = superiorOfficer;
  }
}
