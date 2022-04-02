package com.hspedu.object.exercise.Homework08;

        /*(2)扩展前一个练习的BankAccount类，
        新类SavingsAccount每个月都有利息产生
        (earnMonthlylnterest方法被调用)，并且有每月三次免手续费的存款或取款。
        在earnMonthlylnterest方法中重置交易计数
        */


public class  SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;//利率

    //earnMonthlylnterest
    public void earnMonthlylnterest() {//每月初统计上个月的利息 同时count = 3
        count = 3;
        super.deposit(getBalance()*rate);
    }

    //判断是否免手续费
    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;//减去一次
    }

    //取款


    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;//减去一次
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
