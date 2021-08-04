package facade.exercise;

import facade.exercise.extralayer.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
//        new AtmMachine();
    }
}
