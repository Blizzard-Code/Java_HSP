package com.hspedu.homework.homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void printfInfo(){
        System.out.println("老师的信息");
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("性别："+getSex());
        System.out.println("工龄："+getWork_age());
        teach();
        play();
    }
    public void teach(){
        System.out.println("我承诺我会好好教书");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
