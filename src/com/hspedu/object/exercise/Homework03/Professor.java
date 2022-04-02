package com.hspedu.object.exercise.Homework03;

public class  Professor extends Teacher {
    public Professor(String name, int age, String post, double salary,double grade) {
        super(name, age, post, salary*1.3,grade );
    }

    @Override
    public void introduce() {
        System.out.println("这时教授的信息");
        System.out.println(super.getSalary());
        super.introduce();
    }
}
