package com.zh.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Cat cat = new Cat("小白");
        Bone bone = new Bone("大肉棒");
        Fish fish = new Fish("秋刀鱼");

        master.feed(dog,bone);
        master.feed(cat,fish);


    }
}
