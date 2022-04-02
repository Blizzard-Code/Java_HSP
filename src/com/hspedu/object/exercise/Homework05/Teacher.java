package com.hspedu.object.exercise.Homework05;

public class  Teacher extends Employee {
    private double tour;
    private int workday;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSal() {
        System.out.println("教师 " + getName() + "年工资为：" +
                (getSalary() * getSalMonth() + tour * workday));
    }

    public double getTour() {
        return tour;
    }

    public void setTour(double tour) {
        this.tour = tour;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }
}
