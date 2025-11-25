package Projects.Bank;

public class SavingsAccount extends Account {
    private SavingsAccount(int id, double balance, double annualInterestRate, String dateCreated) {
        super(id, balance, annualInterestRate, dateCreated);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 0) {
        } else {
            balance -= amount;
        }
    }
}
