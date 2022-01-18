package com.hspedu.extend_;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "网名";
        graduate.age = 123;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
