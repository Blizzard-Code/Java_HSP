package com.hspedu.object.exercise.Homework04;

public class Employee {
    private String name;
    private double singleDaySal;
    private double workDay;
    private double grade;

    public Employee() {
    }

    public Employee(String name, double singleDaySal, double workDay, double grade) {
        this.name = name;
        this.singleDaySal = singleDaySal;
        this.workDay = workDay;
        this.grade = grade;
    }

    /*public double totalSal(){
       // System.out.println("您的工资为："+this.singleDaySal*workDay);
        return singleDaySal*workDay;
    }*/
    public void printSal() {
        System.out.println(name + " 总工资为 " + singleDaySal * workDay * grade);
    }

    //重写tostringf方法
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", singleDaySal=" + singleDaySal +
                ", workDay=" + workDay +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleDaySal() {
        return singleDaySal;
    }

    public void setSingleDaySal(double singleDaySal) {
        this.singleDaySal = singleDaySal;
    }

    public double getWorkDay() {
        return workDay;
    }

    public void setWorkDay(double workDay) {
        this.workDay = workDay;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
