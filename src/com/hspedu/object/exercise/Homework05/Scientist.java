package com.hspedu.object.exercise.Homework05;

public class  Scientist extends Employee {
    private double yearBonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSal() {
        System.out.println("科学家 " + getName() + "年工资为：" + (getSalary() * getSalMonth() + yearBonus));
    }

    public double getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(double yearBonus) {
        this.yearBonus = yearBonus;
    }
}
