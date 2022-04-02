package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class  Test {
    public static void main(String[] args) {
    //在不同包下 可以访问public 修饰的属性或方法 但是不能访问protected 默认 pirvate 修饰的属性或放魔法
        A a = new A();
        System.out.println(a.n1);

    }


}
