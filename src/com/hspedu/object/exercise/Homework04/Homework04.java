package com.hspedu.object.exercise.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        DeptManager deptManager = new DeptManager("肖经理",300,30,1.2);
        //设置奖金
        deptManager.setBonus(1000);
        deptManager.printSal();

        Employee employee = new Employee("刘三皮",300,30,1);
        employee.printSal();
    }
}
