package com.hspedu.object.exercise.Homework05;

public class  Waiter extends Employee {
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSal() {
        System.out.print("服务员 " );
        super.printAnnualSal();
    }
}
