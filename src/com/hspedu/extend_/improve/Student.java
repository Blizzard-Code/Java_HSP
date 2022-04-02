package com.hspedu.extend_.improve;
//父类 pupil和graduate的父类
public class  Student {
    //共有属性
    public String name;
    public int age;
    private double score;
//工业方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("小学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
