package com.juaracoding.ujiandua;

public class Account {

    private static String display;
    int acc_no;
    String name;
    static double amount;

    public static String insert(String name) {
        return name;
    }

    public static String display(int acc_no, String name) {
        return display;
    }



    public void insert() {
        acc_no = 1;
        name = "Nana";
        amount = 7000.0;
    }

    public static double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amt;
    }

    public static double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amt;
    }

    public static double checkBalance(double amount) {
        System.out.println("Balance is: " + amount);
        return amount;
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}