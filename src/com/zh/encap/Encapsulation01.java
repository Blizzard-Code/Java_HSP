package com.zh.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
       /* person.setName("jack11111111");
        person.setAge(13);
        person.setSalary(3000);
        person.setJob("总计你");*/
        Person p = new Person("sj",2222222,300,"总结了");

        System.out.println(p.getInfo());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    public String job;
//无惨构造器
    public Person() {
    }

    public Person(String name, int age, double salary, String job) {
        setName(name);
        setAge(age);
        setJob(job);
        setSalary(salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度请在2-6默认为无名人");
            this.setName("无名人");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("输入的年龄错误默认值为18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getInfo() {
        return "名字为：" + name + "年龄为" + age + "薪水为：" + salary + "工作为：" + job;
    }
}