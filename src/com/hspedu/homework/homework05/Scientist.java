package com.hspedu.homework.homework05;

public class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void printSalary() {
        System.out.print("科学家:");
        System.out.println(getName()+(getSalary()+bonus));
    }
}
