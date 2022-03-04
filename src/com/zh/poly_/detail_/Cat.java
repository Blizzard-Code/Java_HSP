package com.zh.poly_.detail_;

public class Cat extends Animal {

    public void eat(){//方法重写 父类eat
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//cat特有方法
        System.out.println("抓老鼠");
    }
}
