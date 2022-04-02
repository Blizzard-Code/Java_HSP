package com.hspedu.encap;
//那么在java中如何实现这种类似的控制呢?
// 请大家看一个小程序(com.hspedu· encap:Encapsulation01.java)，
// 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，
// 否则给默认年龄，必须在1-120，年龄，工资不能直接查看，name的长度在2-6字符之间

import java.util.Scanner;

public class   Encapsulation01 {
    public static void main(String[] args) {
   //     Person person = new Person();
//        person.name = "jack";
//       // person.setName("jack大大三点到打啊阿达撒的");
//        person.setAge(0);
//        person.setSalary(3000000);
//
//        System.out.println(person.info());
//        System.out.println(person.getSalary());
        //如果我们自己使用构造器置顶属性
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("==smith===的信息");
        System.out.println(smith.info());

    }
}

class Person {
    public String name;//名字公开；
    private int age;
    private double salary;
//构造器
    public Person() { 
    }
//有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法卸载构造器中
       this.setName(name);
        this.setAge(age);
        this. setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的教研
        if (name.length() >= 2 && name.length() <= 8) {
            this.name = name;
        } else {
    //默认名字
            System.out.println("名字长度不对需要（2-8）默认名字");
            this.name = "无名小子";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {//判断年龄
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，年龄需要在1-120 给默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }

    public Double getSalary() {
        //可以增加当前对象的判断
        System.out.println("请输入密码：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("123456")) {
            return salary;
        } else {
            System.out.println("你无权查看");
            return null;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法 返回属性信息
    public String info() {
        return "信息为" + " name= " + name + " age= " + age + " salary " + salary;
    }
}