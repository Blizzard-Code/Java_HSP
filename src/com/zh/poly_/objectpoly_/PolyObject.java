package com.zh.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态的特点
        //anmial编译类型是Animal 运行类型是 Dog();
        Animal animal = new Dog();
        //运行时 这时执行到该行，animial的运行类型dog所以cry就是Dog的cry
        animal.cry();//小狗汪汪叫

        animal = new Cat();
        animal.cry();
    }

}
