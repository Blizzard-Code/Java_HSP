package com.hspedu.homework.homework13;

public class Student extends Person {
   private String stu_id;

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }
    public void printfInfo(){
        System.out.println("学生的信息");
        System.out.println(basicInfo());
        System.out.println("工龄："+getStu_id());
        study();
        play();
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
