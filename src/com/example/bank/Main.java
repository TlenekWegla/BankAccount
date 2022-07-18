package com.example.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write 'w' for withdraw");
        System.out.println("Write 'd' for deposit");
        System.out.println("Write 'f' to finish");

        BankAccountManager bankAccountManager = new BankAccountManager();

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        if (decision.equals("w")) {
            System.out.println("Put amount of money you want to take out");
            double amount = Double.parseDouble(scanner.nextLine());
            bankAccountManager.withdrawMoney(amount);
            System.out.println("On your account left: " + bankAccountManager.getBalance());
        } else if (decision.equals("d")) {
            System.out.println("Put amount of money you want to add to your account");
            double amount = Double.parseDouble(scanner.nextLine());
            bankAccountManager.depositMoney(amount);
            System.out.println("On your account is: " + bankAccountManager.getBalance());
        } else if (decision.equals("f")) {
            System.out.println("See you next time!");
        } else {
            System.out.println("Given option doesnt exist");
        }
    }

}
