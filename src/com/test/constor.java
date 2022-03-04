package com.test;

public class constor {
    public static void main(String[] args) {
        Person p1 = new Person("大壮，",15);
        System.out.println("p1hascode   "+p1.hashCode());
        Person p2 = new Person("大壮，",15);
        System.out.println("p1hascode   "+p2.hashCode());
      //  p1.info();

    }
}

class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }
    public  void info(){
        System.out.println(name + " "+age);
    }
}
