package com.hspedu.homework.Homework03;

public class NormalEmployee extends Employee {
    public NormalEmployee(String name, double singleSalary, int day, int grade) {
        super(name, singleSalary, day, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("普通员工工资Wie");
        super.printSalary();
    }
}
