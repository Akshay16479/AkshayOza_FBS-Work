package client;

import service.WalletService;
import serviceimpl.WalletServiceImpl;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        WalletService walletService = new WalletServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Create User");
            System.out.println("2.Add Money");
            System.out.println("3.Transfer Money");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("User ID: ");
                        int userId = scanner.nextInt();
                        System.out.print("Name: ");
                        String name = scanner.next();
                        System.out.print("Mobile: ");
                        String mobile = scanner.next();
                        walletService.createUser(userId, name, mobile);
                        System.out.println("User created");
                        break;

                    case 2:
                        System.out.print("User ID: ");
                        int uid = scanner.nextInt();
                        System.out.print("Amount: ");
                        double amount = scanner.nextDouble();
                        walletService.addMoney(uid, amount);
                        System.out.println("Money added");
                        break;

                    case 3:
                        System.out.print("From User ID: ");
                        int from = scanner.nextInt();
                        System.out.print("To User ID: ");
                        int to = scanner.nextInt();
                        System.out.print("Amount: ");
                        double amt = scanner.nextDouble();
                        walletService.transferMoney(from, to, amt);
                        System.out.println("Transfer successful");
                        break;

                    case 4:
                        System.out.print("User ID: ");
                        int bid = scanner.nextInt();
                        System.out.println("Balance: " + walletService.checkBalance(bid));
                        break;

                    case 5:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
