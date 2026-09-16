package com.oop;

public class Main {
    public static void main(String[] args) {

        BankAccount KalibasAccount = new BankAccount();
        BankAccount useAccount = new BankAccount();

       KalibasAccount.accountHolder = "Kaliba";
       KalibasAccount.balance = 100;
       System.out.println("Before deposit: " + KalibasAccount.balance);

       KalibasAccount.deposit(100);

       System.out.println("After deposit: " + KalibasAccount.balance);

       System.out.println(useAccount.balance);

        System.out.println(KalibasAccount == useAccount);

    }
}