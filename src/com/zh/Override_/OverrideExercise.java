package com.zh.Override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person p = new Person("jack",14);
        System.out.println( p.say());
        System.out.println("=============");

        Student s = new Student("tom",13,"2018",55) ;
        System.out.println( s.say());
    }
}
