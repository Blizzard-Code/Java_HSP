package com.hspedu.extend_;
//大学生类--->模拟大学生的考试简单情况
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {//和pupil不一样
        System.out.println("大学生 " + name + "正在考高等数学");
    }

    public void showInfo() {
        System.out.println("大学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
