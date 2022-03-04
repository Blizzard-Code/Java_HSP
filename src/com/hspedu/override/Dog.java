package com.hspedu.override;

public class Dog extends Animal {
    //因为dog是animal子类
//    2.dog的cry方法和Animal的cry定义的形式一样（名称 返回类型 参数）
    //3.这时我们就是 dog的cry方法 重写了animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫");
    }

    public String m1() {
        return null;
    }

    //object不是string 的子类 报错
//    public Object m2() {
//        return null;
//    }
//    public AAA m3() {
//        return null;
//    }

    public BBB m3() {
        return null;
    }

    public void eat() {

    }
}

class AAA {

}

class BBB extends AAA {

}