package com.hspedu.debug_;

public class  DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //加载Person类信息
        //默认属性初始化  显示初始化 构造器初始化
        //返回对象的地址
        Person person = new Person("小明",18);
        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
