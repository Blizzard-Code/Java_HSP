package com.hspedu.poly_.objectpoly;

public class  PolyObject {
    public static void main(String[] args) {
        //对象多态特点

        //animal  编译类型就是 Animal，运行类型就是dog
        Animal animal = new Dog();
        animal.cry();//因为运行时 这时就执行到改行时  animal的运行类型是Dog 所以cry是dog的cry
        //animal 变异类型 Animal 运行类型就是cat
        animal = new Cat();
        animal.cry();

    }
}
