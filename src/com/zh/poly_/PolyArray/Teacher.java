package com.zh.poly_.PolyArray;

public class Teacher extends Person{
    public double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void teach(){
        System.out.println("老师："+getName()+" 正在教书");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say(){
        return super.say()+"我的薪水为"+salary;
    }
}
