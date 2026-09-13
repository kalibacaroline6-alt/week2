package com.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount jacobsAccount = new BankAccount();
        BankAccount useAccount = new BankAccount();

        System.out.println(jacobsAccount == useAccount);

    }
}