public class TestBankAccount {
    public static void main(String[] args) {
// Creating objects
        BankAccount account = new BankAccount();
// Assigning values to instance variables
        account.name = "Rashid";
        account.id = "1000500";
        account.balance = 1000;
// Print balance
        System.out.println("Balance before deposit:" + account.balance);
// Calling methods
        account.deposit(2000);
// Print balance
        System.out.println("Balance after deposit:" + account.balance);
    }
}
