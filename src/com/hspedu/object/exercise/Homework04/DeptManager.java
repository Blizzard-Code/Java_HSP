package com.hspedu.object.exercise.Homework04;

public class DeptManager extends Employee {
    private double bonus;

    public DeptManager(String name, double singleDaySal, double workDay, double grade) {
        super(name, singleDaySal, workDay, grade);
    }
/*
    @Override
    public double totalSal() {
        System.out.println("部门经理工资如下");
        System.out.println(super.totalSal() * super.getGrade() + bonus);
        return super.totalSal() * super.getGrade() + 1000;
    }*/

    @Override
    public void printSal() {
        System.out.println("经理：" + getName() + "工资：" + (bonus
                + getSingleDaySal() * getGrade() * getWorkDay()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
