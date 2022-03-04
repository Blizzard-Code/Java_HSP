package com.hspedu.object.doagain;

//应用实例:判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都样,
//        则返回true，反之false。 EqualsExercise01.java
public class EqualsExercising01_write {
    public static void main(String[] args) {
        Person p1 = new Person("JACK1", 18, "男");
        Person p2 = new Person("JACK", 18, "男");
        System.out.println(p1.equals(p2));
    }
}

class Person {
    private String name;
    private int age;
    private String sex;

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Person) {
            Person p =(Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.sex.equals(p.sex);
        }
        return false;
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

