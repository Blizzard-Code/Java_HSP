package com.use;

import com.xiaoming.Dog;//只能导入一个

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1);
    }
}
