package com.test;

public class thisDe {
    public static void main(String[] args) {
        T t=new T();

    }
}

class T{
//    public void f1(){
//        System.out.println("f1()方法");
//    }
//
//    public void f2(){
//        System.out.println("f2()方法");
//        f1();
//        this.f1();
//    }s
    public T(){
        this("jack",16);
        System.out.println("T()构造器");
    }
    public T(String name ,int age){
        System.out.println("T(String name ,int age)构造器");
    }
}