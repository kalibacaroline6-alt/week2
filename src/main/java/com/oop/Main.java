package com.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount KalibasAccount = new BankAccount();
        BankAccount useAccount = new BankAccount();

        System.out.println(KalibasAccount == useAccount);

    }
}