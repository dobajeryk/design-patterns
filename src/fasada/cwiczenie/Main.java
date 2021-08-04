package fasada.cwiczenie;

import fasada.cwiczenie.extralayer.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
//        new AtmMachine();
    }
}
