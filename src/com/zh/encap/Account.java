package com.zh.encap;

public class Account {
    public static void main(String[] args) {
//        acc acc = new acc();
//        acc.setBalance(3);
//        acc.setName(null);
//        acc.setPassword(null);
//        System.out.println(acc.getInfo());
        acc ac = new acc("ja","1",2);
        System.out.println(ac.getInfo());
    }
}

class acc {
    private String name;
    private String password;
    private double balance;

    public acc(String name, String password, double balance) {
        setName(name);
        setPassword(password);
        setBalance(balance);
    }

    public acc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && (name.length() == 2 || name.length() == 3 || name.length() == 4)) {
            this.name = name;
        } else {
            System.out.println("输入的长度有误默认为无名人");
            this.name = "无名人";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度错误默认为：123456");
            this.password = "123456";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不大于20,默认为0");
            this.balance = 0;
        }
    }

    public String getInfo() {
        return "姓名为：" + name + "余额为：" + balance + "密码为：" + password;
    }
}