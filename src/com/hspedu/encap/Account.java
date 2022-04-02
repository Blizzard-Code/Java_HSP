package com.hspedu.encap;
//com.hspedu.encapT:AccountTest.java和Account.java
//  创建程序，在其中定义两个类:Account和AccountTest类体会Java的封装性。
//1. Account类要求具有属性:姓名（长度为2位3位或4位)、余额(必须>20).密码(必须是六位)，如果不满足，
// 则给出提示信息,并给默认值
//2.通过setXxx的方法给Account的属性赋值。
// 3.在AccountTest中测试

public class  Account {
    private  String name;
    private double balance;
    private String password;
    //无参构造器
    public Account() {
    }
    //有参构造器
    public Account(String name, double balance, String password) {
        setName(name);
        setPassword(password);
        setBalance(balance);

    }
    //get set方法
    public void setName(String name) {
        if (name != null && name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("输入的姓名长度不符合规则");
            this.name = null;
        }

    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("输入的余额不符合规则");
            this.balance = 0.00;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("输入的密码长度不符合规则默认密码为000000");
            this.password = "000000";
        }
    }

    public String getPassword() {
        return password;
    }

    public String info() {
        return "信息为" + " name=" + name + " balance=" + balance + " password=" + password;
    }


}
