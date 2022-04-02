package com.hspedu.homework.homework05;

public class Teacher extends Employee {
    private int day;
    private int DayOfMoney;
    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDayOfMoney() {
        return DayOfMoney;
    }

    public void setDayOfMoney(int dayOfMoney) {
        DayOfMoney = dayOfMoney;
    }

    public Teacher() {
    }

    @Override
    public void printSalary() {
        System.out.print("教师:");
        System.out.println(getName()+(getSalary()+day*DayOfMoney));
    }
}
