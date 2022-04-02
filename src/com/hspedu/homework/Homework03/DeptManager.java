package com.hspedu.homework.Homework03;

public class DeptManager extends Employee {
    private double bonus;

    public DeptManager(String name, double singleSalary, int day, int grade) {
        super(name, singleSalary, day, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("部门经理工资Wie");
        System.out.println("经理 "+getName()+"工资为"+(bonus+getDay()*getSingleSalary()*getGrade()));
    }
}
