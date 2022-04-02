package com.hspedu.smallChange.doagain.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysApp {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String choice = "";
    double balance = 0;
    double money;
    String detail = "--------------零钱通明细--------------";
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
    String note = "";

    public void mainMenu() {
        do {
            System.out.println("===============零钱通菜单===============");
            System.out.println("1\t\t\t 零钱通明细");
            System.out.println("2\t\t\t 收益入账");
            System.out.println("3\t\t\t 消费");
            System.out.println("4\t\t\t 退出");
            System.out.println("请选择（1~4）");
            choice = scanner.next();

            switch (choice) {
                case "1":
                    Details();
                    break;
                case "2":
                    inCome();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入有误请重新输入");
            }

        } while (loop);
    }


    //打
    public void Details() {
        System.out.println(detail);
    }

    //
    public void inCome() {
        System.out.println("请输入入账金额");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("输入的金额应该＞0");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    //
    public void pay() {
        System.out.println("请输入消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("输入的金额应该在0~" + balance + "之间");
            return;
        }
        balance -= money;
        System.out.println("请输入用途");
        note = scanner.next();
        date = new Date();
        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        String key = "";
        while (true) {
            System.out.println("你确定要退出吗 输入y/n");
            key = scanner.next();
            if ("y".equals(key) || "n".equals(key)) {
                break;
            }
        }
        if (key.equals("y")) {
            loop = false;
        }
    }
}
