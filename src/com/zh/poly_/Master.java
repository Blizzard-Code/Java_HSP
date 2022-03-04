package com.zh.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态统一管理主任喂食物的问题i
    //animal编译是Animal类型是  可以指向 Animal子类对象
    //food 编译类型是Food 可以子项food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+" 给小狗 "+animal.getName()+" 吃"+food.getName());
    }


//    //主人给狗喂食骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人"+name+" 给小狗 "+dog.getName()+" 吃"+bone.getName());
//
//    }
//
//    //主人给狗喂食骨头
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人"+name+" 给小猫 "+cat.getName()+" 吃"+fish.getName());
//
//    }
}
