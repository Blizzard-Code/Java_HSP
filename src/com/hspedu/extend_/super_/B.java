package com.hspedu.extend_.super_;

public class B extends A {
    public void hi() {
        //访问父类的属性 但不能访问父类的private属性
        System.out.println(super.n1 + super.n2 + super.n3);
    }

    //访问父类的方法 但不能访问父类的private方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

    //访问构造器只能在构造器理第一行
    public B() {
        super("das ",3);
    }

}
