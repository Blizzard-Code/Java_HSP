package com.hspedu.object.exercise.Homework08;

public class  Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(10);
//        System.out.println(checkingAccount.getBalance());
//        //测试saving

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        //月初定时器 自动调用
        savingsAccount.earnMonthlylnterest();
        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

    }

}
