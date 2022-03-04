package com.hspedu.object.exercise.Homework06;

public class Father extends Grand {
    String id = "001";
    private double score;
    public void f1(){
        //super和this可以访问那些成员方法
        //super.name;
        super.g1();
        this.f1();
        System.out.println(this.name);
        System.out.println(this.id);

        //
    }

}
