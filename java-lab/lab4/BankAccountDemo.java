// 3. Write a program for a BankAccount class that throws
// InsufficientBalanceException when withdrawal exceeds balance.

// Custom checked exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Withdrawal of " + amount + " failed. Available balance: " + balance
            );
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Krish", 5000.0);

        try {
            account.deposit(2000.0);
            account.withdraw(3000.0);
            account.withdraw(10000.0);  // This will exceed balance and throw exception

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());

        } finally {
            System.out.println("Final Balance: " + account.getBalance());
        }

        System.out.println("Program execution completed.");
    }
}
