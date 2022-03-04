package com.hspedu.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载t体现多态 通过不同参数的sum 调佣不同方法
        A a = new A();
        //传入不同的参数  就会调用不同sum方法 就体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));
        //方法重写体现多态
        B b=new B();
        a.say();
        b.say();
    }
}

class B {//父类

    public void say() {
        System.out.println("B say()方法被调用");
    }
}

class A extends B {//子类

    public int sum(int n1, int n2) {//和下面sum构成重载
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("Asay()方法被调用");
    }
}
