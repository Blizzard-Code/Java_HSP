package com.hspedu.object.exercise.Homework05;

public class Peasant extends Employee {
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSal() {
        System.out.print("农民 " );
        super.printAnnualSal();
    }
}
