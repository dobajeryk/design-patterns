package facade.exercise.extralayer;

public class AtmMachineFacade {
    private final AtmMachine atmMachine = new AtmMachine();
    private final BankSystem bankSystem = new BankSystem();

    public void withdrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
            atmMachine.withdrawCash();
        }
    }
}
