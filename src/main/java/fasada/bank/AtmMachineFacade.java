package fasada.bank;

public class AtmMachineFacade {

  private AtmMachine atmMachine = new AtmMachine();
  private BankSystem bankSystem = new BankSystem();

  public void withdrawMoney() {
    atmMachine.enterPin();
    if(bankSystem.validatePin() && bankSystem.validateTransaction()){
      atmMachine.wirhdrawCash();
    }
  }
}
