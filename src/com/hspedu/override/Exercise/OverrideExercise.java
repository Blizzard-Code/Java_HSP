package com.hspedu.override.Exercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student smith = new Student("smith", 20, 2018, 99.9);
        System.out.println(smith.say());
    }
}
