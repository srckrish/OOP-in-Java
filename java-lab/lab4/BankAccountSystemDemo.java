// 9. Design a multithreaded bank account system with multiple threads
// performing simultaneous transactions using following instructions.
// ○ Create a BankAccount class with balance and synchronized
// deposit() and withdraw() methods.
// ○ Create Customer threads (at least 5) that randomly deposit or
// withdraw amounts.
// ○ Ensure that balance never goes negative using proper
// synchronization.
// ○ Use wait() and notify() if a withdrawal tries to withdraw more
// than available (wait for deposit).
// ○ Also create an Auditor thread that periodically prints the current
// balance.

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit: increases balance and wakes up any threads waiting to withdraw
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount
                + " | Balance: " + balance);
        notifyAll(); // wake up any withdraw() calls waiting for funds
    }

    // Withdraw: waits if balance is insufficient, with a bounded number of retries
    public synchronized void withdraw(double amount) {
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        while (balance < amount) {
            attempts++;
            System.out.println(Thread.currentThread().getName() + " wants to withdraw: " + amount
                    + " but balance is only " + balance + ". Waiting for deposit...");

            if (attempts >= MAX_ATTEMPTS) {
                System.out.println(Thread.currentThread().getName()
                        + " giving up on withdrawing " + amount + " after " + MAX_ATTEMPTS + " attempts.");
                return; // avoid waiting forever if no more deposits are coming
            }

            try {
                wait(1500); // wait up to 1.5s to be notified of a deposit, then re-check
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount
                + " | Balance: " + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class Customer extends Thread {

    private BankAccount account;
    private Random random = new Random();

    public Customer(String name, BankAccount account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) { // each customer does 4 transactions
            boolean doDeposit = random.nextBoolean();
            double amount = 100 + random.nextInt(400); // amount between 100 and 499

            if (doDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }

            try {
                Thread.sleep(300 + random.nextInt(400)); // simulate time between transactions
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Auditor extends Thread {

    private BankAccount account;
    private AtomicBoolean running;

    public Auditor(BankAccount account, AtomicBoolean running) {
        super("Auditor");
        this.account = account;
        this.running = running;
    }

    @Override
    public void run() {
        while (running.get()) {
            System.out.println(">>> [AUDITOR] Current Balance: " + account.getBalance());
            try {
                Thread.sleep(1000); // audit every 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(">>> [AUDITOR] Final Balance: " + account.getBalance());
    }
}

public class BankAccountSystemDemo {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000.0); // starting balance
        AtomicBoolean auditorRunning = new AtomicBoolean(true);

        Auditor auditor = new Auditor(account, auditorRunning);
        auditor.start();

        Customer[] customers = new Customer[5];
        for (int i = 0; i < 5; i++) {
            customers[i] = new Customer("Customer-" + (i + 1), account);
            customers[i].start();
        }

        // Wait for all customer threads to finish their transactions
        for (Customer customer : customers) {
            customer.join();
        }

        // Stop the auditor thread now that transactions are done
        auditorRunning.set(false);
        auditor.join();

        System.out.println("\nAll transactions complete. Final Balance: " + account.getBalance());
    }
}
