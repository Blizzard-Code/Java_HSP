package com.hspedu.homework.Homework06;

import com.hspedu.object.exercise.Homework08.SavingsAccount;

public class Homework06 {
    public static void main(String[] args) {
        /*CheckAccount ck = new CheckAccount(1000);
        System.out.println(ck.getBalance());
        ck.deposit(10);
        ck.withdraw(9);
        System.out.println(ck.getBalance());*/

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);

        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlylnterest();
        System.out.println(savingsAccount.getBalance());



    }
}
