package src.assignments.cat_2.multithreading;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        boolean success = account.withdraw(amount);
        if (!success) {
            System.out.println("Insufficient funds");
        }
    }
}

class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        int numDeposits = 100;
        int numWithdrawals = 100;

        // Create multiple DepositThread and WithdrawThread instances
        DepositThread[] depositThreads = new DepositThread[numDeposits];
        WithdrawThread[] withdrawThreads = new WithdrawThread[numWithdrawals];

        for (int i = 0; i < numDeposits; i++) {
            depositThreads[i] = new DepositThread(account, 10);
            depositThreads[i].start();
        }

        for (int i = 0; i < numWithdrawals; i++) {
            withdrawThreads[i] = new WithdrawThread(account, 10);
            withdrawThreads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < numDeposits; i++) {
                depositThreads[i].join();
            }

            for (int i = 0; i < numWithdrawals; i++) {
                withdrawThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}