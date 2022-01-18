package com.hspedu.modifier;

public class B {
    public  void say()
    {
        A a = new A();
        //在同一个包下 可以访问public protected和默认  不能访问private
        System.out.println("B下n1="+a.n1+"n2="+a.n2+"n3="+a.n3+"n4=");

    }

}
