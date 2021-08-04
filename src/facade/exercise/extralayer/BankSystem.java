package facade.exercise.extralayer;

class BankSystem {
    void transferMoney() {
        System.out.println("Transfer successful!");
    }

    boolean validatePin() {
        System.out.println("Entered PIN is correct");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transaction validated!");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("Transaction history ...");
    }
}
