package com.hspedu.smallChange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类完成零钱通的各个功能的类
 * 使用oop面向对象编程
 * 将各个功能对应一个方法
 */
public class  SmallChangeSysOOP {
    //属性
    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2. 完成零钱通明明细
    // （1）可以把收入入账和消费保存到数组
    //（2）可以用对象M
    // （3）简单的话可以用String拼接
    String details = "-------------零钱通明细-------------";

    //3. 完成受益入账  完成功能驱动程序员增加新的变化和代码
    double money = 0;
    double balance = 0;
    Date date = null; //date是java.util.Date类型。表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
    //4. 消费 定义新的变量 保存消费的原因
    String note = "";

    //先完成显示菜单 并可以选择
    public void mainMenu() {
        System.out.println("显示零钱通菜单...");  do {
            System.out.println("\n================OOP版零钱通菜单================");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收 益 入账");
            System.out.println("\t\t\t3. 消     费");
            System.out.println("\t\t\t4. 退     出");

            System.out.println("请输入（1-4）：");
            key = scanner.next();
            //使用switch分支
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //money的值范围应该校验-》 一会再完善
        //编程思想
        //找出不正确金额条件，给出提示即可就直接break
        //6. 用户输入4退出时，给出提示你确定要退出吗y/n？必须输入正确的y/n否则循环输入指令，直到输入y或n
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;//不再执行 退出方法
        }
        balance += money;
        //拼接受益入账信息到details
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        //7. 在受益入账和消费时 判断是否合理，并给出相应提示
        if (money <= 0 || money >= balance) {
            System.out.println("您的消费金额 应该 在 0~" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        //   用户输入4退出时，给出提示你确定要退出吗y/n？
        //   必须输入正确的y/n否则循环输入指令，直到输入y或n
        //(1) 定义一变量choice 接收用户的输入
        //(2) 使用while+break 来处理接收到的输入是y/n
        // (3)退出while后再兰端choice是y/n 就可以决定是否退出

        String choice = "";
        //完成必须接收的是y/n
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
                        /*if("y".equals(choice)){
                            loop=false;
                            break;
                        }else if("n".equals(choice)){
                            break;
                        }*/
        }
        //当用户退出while 进行判断是否真的退出
        if (choice.equals("y")) {
            loop = false;
        }

    }
}
