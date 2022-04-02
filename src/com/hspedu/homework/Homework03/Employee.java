package com.hspedu.homework.Homework03;

public class Employee {
    private String name;
    private double singleSalary;
    private int day;
    private int grade;

    public Employee(String name, double singleSalary, int day, int grade) {
        this.name = name;
        this.singleSalary = singleSalary;
        this.day = day;
        this.grade = grade;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleSalary() {
        return singleSalary;
    }

    public void setSingleSalary(double singleSalary) {
        this.singleSalary = singleSalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printSalary() {
        System.out.println("name：" + name + "的工资是：" + singleSalary * day * grade);
    }

}
