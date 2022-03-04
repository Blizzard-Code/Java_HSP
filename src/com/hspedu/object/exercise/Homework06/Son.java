package com.hspedu.object.exercise.Homework06;

public class Son extends Father {
    String name = "BB";

    public void g1(){
        System.out.println(super.id);
        System.out.println(super.name);
        super.f1();
        super.g1();

        System.out.println(this.name);//本类
        System.out.println(this.id);//父类
        this.g1();//本类
        this.show();//本类
        this.f1();//父类


    }
    private void show(){
        //super和this 可访问那些成员
    }

}
