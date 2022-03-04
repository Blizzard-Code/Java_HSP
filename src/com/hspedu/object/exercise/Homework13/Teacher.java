package com.hspedu.object.exercise.Homework13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺 我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "飞行棋";
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    //输出信息
    public void printInfo() {
        System.out.println("老师信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(play());
    }
}
