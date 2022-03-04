package com.zh.poly_.PolyArray;

public class Student extends Person {
    private double score;

    public Student(String name ,int age,double score){
        super(name,age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        return super.say()+"我的分数为"+score;
    }

    public void study(){
        System.out.println("学生："+getName()+" 正在学习java");
    }

}
