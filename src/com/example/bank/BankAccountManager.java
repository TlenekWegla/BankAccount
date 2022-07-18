package com.example.bank;

public class BankAccountManager {

    private double balance;

    public BankAccountManager() {
        this.balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawMoney(double requestedAmount) {
        if (isEnoughMoneyOnAccount(requestedAmount)) {
            subtractMoney(requestedAmount);
        }
    }

    private boolean isEnoughMoneyOnAccount(double requestedAmount) {
        if (requestedAmount > balance) {
            System.out.println("Not enough money on this account");
            return false;
        }

        return true;
    }

    private void subtractMoney(double amount) {
        this.balance = balance - amount;
    }

    public void depositMoney(double requestedAmount) {
        this.balance = balance + requestedAmount;
    }

}
