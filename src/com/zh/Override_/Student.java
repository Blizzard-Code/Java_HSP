package com.zh.Override_;

public class Student extends Person {
    private String id;
    private double score;

    public String say(){
        return super.say()+" 我的iD为："+id+" 我的分数为："+score;
    }

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, String id, double score) {
        super(name, age);  //父类构造器
        this.id = id;
        this.score = score;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
