package com.zh.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        A a= new A();
        //方法重载体现多态
        //传入不同的参数 调用不同的sum方法就体现多态
        a.sum(1,2);
        a.sum(1,2,3);

        //方法重写
        B b = new B();
        a.say();
        b.say();

    }
}

class B {
    public void say() {
        System.out.println("B say()方法被调用");
    }
}

class A extends B {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say()方法被调用");
    }
}