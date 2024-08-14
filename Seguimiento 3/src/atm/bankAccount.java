package atm;

import java.util.Scanner;

public class bankAccount {
    private String accountNumber;
    private double balance;
    private boolean status;
    private String securityPIN;

    public bankAccount(String accountNumber, double balance, boolean status, String securityPIN) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
        this.securityPIN = securityPIN;
    }

    public void checkBalance() {
        System.out.println("Your account balance is: $" + balance);
    }

    public void withdrawCash(double amount) {
        if (status && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else if (!status) {
            System.out.println("The account is inactive. Withdrawals cannot be made.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not completed.");
        }
    }

    public void depositCash(double amount) {
        if (status) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("The account is inactive. Deposits cannot be made.");
        }
    }

    public void changePIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current PIN: ");
        String currentPIN = scanner.nextLine();

        if (currentPIN.equals(securityPIN)) {
            System.out.print("Enter the new PIN: ");
            String newPIN = scanner.nextLine();
            securityPIN = newPIN;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect PIN. Unable to change PIN.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSecurityPIN() {
        return securityPIN;
    }

    public void setSecurityPIN(String securityPIN) {
        this.securityPIN = securityPIN;
    }
}
