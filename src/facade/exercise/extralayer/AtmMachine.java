package facade.exercise.extralayer;

class AtmMachine {
    double balance = 10.2d;

    void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

    void enterPin() {
        System.out.println("You entered PIN");
    }

    void withdrawCash() {
        System.out.println("Withdrawal Successful!");
    }

}
