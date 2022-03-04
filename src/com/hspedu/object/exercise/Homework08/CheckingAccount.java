package com.hspedu.object.exercise.Homework08;

public class CheckingAccount extends BankAccount {//新的账号
    //属性
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款方法
        super.deposit(amount - 1);//重写父类的deposit方法
        //1块钱入银行账号
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount +1);
        //1块钱入银行账号
    }
}
