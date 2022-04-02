package com.hspedu.smallChange.exerciseByYourSelf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class  SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String details = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in);
        String note = "";

        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t\t1. 零 钱 通 明 细");
            System.out.println("\t\t\t2. 收 益 入 账");
            System.out.println("\t\t\t3. 消     费");
            System.out.println("\t\t\t4. 退     出");
            System.out.println("请输入（1~4）");
            String key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("请输入收益入账金额");
                    money = scanner.nextDouble();
                    //校验输入的钱合理
                    if (money <= 0) {
                        System.out.println("收益入账的金额 需 大于 0 ");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    break;
                case "3":
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    //校验输入的钱合理
                    if (money <= 0 || money >= balance) {
                        System.out.println("消费的金额 需 大于 0 ");
                        break;
                    }
                    balance -= money;
                    System.out.println("请输入用途");
                    note = scanner.next();
                    date = new Date();
                    details += "\n" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    break;
                case "4":
                    String choice = "";
                    //确保输入的是y/n
                    while (true) {
                        System.out.println("是否确定退出，请输入y/n~~~");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if("y".equals(choice)){
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("输入有误，请重新输入");

            }
        } while (loop);

    }
}
