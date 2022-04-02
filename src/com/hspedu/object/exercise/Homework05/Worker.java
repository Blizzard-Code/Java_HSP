package com.hspedu.object.exercise.Homework05;

public class  Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSal() {
        System.out.print("工人 " );
        super.printAnnualSal();
    }
}
