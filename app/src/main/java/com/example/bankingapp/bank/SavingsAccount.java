package com.example.bankingapp.bank;

public class SavingsAccount extends BankAccount {

    private static double interestRate = 6.0;
    private static double lowerLimit = 1000.0;
    public SavingsAccount(String accountName, String accountNumber, int accountType, double balance) {
         super(accountName, accountNumber, accountType, balance);
    }

    @Override
    public String withdraw(double amount) {
         if (super.getBalance() - amount > lowerLimit){
             super.setBalance(super.getBalance() - amount);
             return "Your account has been debited with amount "+amount;
         }

         return "Insufficient fund";
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public static double getLowerLimit() {
        return lowerLimit;
    }

    public static void setLowerLimit(double lowerLimit) {
        SavingsAccount.lowerLimit = lowerLimit;
    }
}
