package atm;

import java.util.Scanner;

public class mainBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        bankAccount account = new bankAccount("1234567890", 100000.0, true, "1234");

        int option;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    account.withdrawCash(withdrawal);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    account.depositCash(deposit);
                    break;
                case 4:
                    account.changePIN();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 5);

        scanner.close();
    }
}
