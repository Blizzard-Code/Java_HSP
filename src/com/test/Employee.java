package com.test;

public class Employee {
    public static void main(String[] args) {

    }
}

class emp {
    String name;
    String sex;
    int age;
    String job;
    double sal;

    public emp(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public emp(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public emp(String name, String sex, int age, String job, double sal) {
        this(name, sex, age);
        this.job = job;
        this.sal = sal;

    }
}