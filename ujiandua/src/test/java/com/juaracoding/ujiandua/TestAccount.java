package com.juaracoding.ujiandua;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.juaracoding.ujiandua.Account.amount;
import static org.testng.Assert.*;

public class TestAccount {


    @Test
    @Parameters("text")
    public void TestInsert(String text) {
        Account account = new Account();
        int acc_no = 1;
        String name = "Nana";
        double amt = 7000.0;
        String actual = Account.insert(name);

        String expected = "Nana";
        System.out.println(text);
        assertEquals(actual, "Nana");


    }

    @Test
    public void TestDeposit() {
        Account account = new Account();
        double amt = 1000;
        double actual = Account.deposit(amt);
        double expected = 1000.0;
        assertEquals(actual, 1000.0);
    }


    @Test
    public void TestWithDrawInsufficientBalance() {
        Account account = new Account();
        double amt = 3000;
        double amount = 4000 - amt;

        double actual = Account.withdraw(amount);
        double expected = 1000.0;
        assertEquals(actual, 1000.0);

    }

    @Test
    public void TestWithDrawn() {
        Account account = new Account();
        double amt = 9000;
        double amount = 7000 - amt;
        double actual = Account.withdraw(amount);
        double expected = -2000.0;
        assertEquals(actual, -2000.0);

    }


    @Test
    public void TestcheckBalance() {
        Account account = new Account();
        double amount = 8000.0;
        double actual = Account.checkBalance(amount);
        double expected = 8000.0;
        assertEquals(actual, 8000.0);

    }
    @Test
    public void Testdisplay() {
        int acc_no = 1;
        String name = "Nana";
        double amount = 8000.0;
        System.out.println(acc_no + " " + name + " " + amount);
    }

}