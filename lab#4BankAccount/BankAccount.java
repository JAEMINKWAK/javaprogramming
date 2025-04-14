package org.example;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance);  // Use setter to validate balance
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 0.0);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0.0) {
            this.balance = balance;
        } else {
            System.out.println("Error");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error");
        }
    }

    public void deposit(double amount, double bonus) {
        if (amount > 0 && bonus >= 0) {
            balance += amount + bonus;
            System.out.println("Deposited: " + amount + " with bonus: " + bonus);
        } else {
            System.out.println("Error: Amount and bonus must be non-negative.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else {
            System.out.println("Error: Insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Using constructor with initial balance
        BankAccount account1 = new BankAccount("123456", "Jaemin", 500.0);
        account1.displayAccountInfo();
        account1.deposit(200.0);
        account1.deposit(100.0, 20.0);
        account1.displayAccountInfo();

        System.out.println();

        BankAccount account2 = new BankAccount("654321", "Jihwan");
        account2.displayAccountInfo();
        account2.setBalance(-500.0);
        account2.deposit(300.0);
        account2.deposit(50.0);
        account2.withdraw(100.0);  // 정상 출금
//        account2.withdraw(999.0);  // 잔액 부족 에러
        account2.displayAccountInfo();
    }
}

