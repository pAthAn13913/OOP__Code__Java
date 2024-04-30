public class BankAccount {
    // Instance variables
    public String name;
    public String id;
    public double balance;

    // Methods
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount < balance)
            balance -= amount;
    }
}
