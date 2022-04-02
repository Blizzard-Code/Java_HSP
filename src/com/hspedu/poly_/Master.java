package com.hspedu.poly_;

public class  Master {
    private  String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //使用多态机制 可以统一管理主人喂食的问题
    //animal 是Animal的变异类型 ，可以指向 接收 Animal子类的对象
    // food编译类型是Food  可以指向 接收 food子类的对象
    public void feed(Animal animal,Food food){

        System.out.println("主人"+name+"给"+animal.getName()+"吃"+food.getName());
    }
/*
    //完成给狗喂食 固态
    public void feed(Dog dog,Bone bone){
        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bone.getName());
    }
    //完成给猫喂食 黄花鱼
    public void feed(Cat cat,Fish fish){
        System.out.println("主人"+name+"给"+cat.getName()+"吃"+fish  .getName());
    }*/
}
