package com.hspedu.homework.Homework03;

public class Homework04 {
    public static void main(String[] args) {
//        Employee e = new NormalEmployee("jakc",300,30,1);
//        e.printSalary();

        Employee dept = new DeptManager("jakc",300,30,2);
        DeptManager d = (DeptManager)dept  ;
        d.setBonus(20000);
        d.printSalary();


    }
}
