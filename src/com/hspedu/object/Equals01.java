package com.hspedu.object;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bobj = a;
        System.out.println(bobj == c);//true
        "hello".equals("abc");




    }
}

class B {
}

class A extends B {
}