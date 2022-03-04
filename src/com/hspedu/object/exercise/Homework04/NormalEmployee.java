package com.hspedu.object.exercise.Homework04;

/*4.通过继承实现员工工资核算打印功能Homework04.java
        父类:员工类(Employee)
        子类:部门经理类(Manager)、普通员工类(Worker)
        (1)部门经理工资=1000+单日工资*天数*等级(1.2)。=>奖金＋基本工资
        (2)普通员工工资=单日工资*天数*等级(1.0);=>基本工资
        (3)员工属性:姓名，单日工资,工作天数
        (4)员工方法(打印工资)
        (5)普遍员工及部门经理都是员工子类，需要重写打印工资方法。
        (5)定义并初始化普通员工对象，调用打印工资方法输出工资，定义并初始化部门经理对象
        ,调用打印工资方法输出工资*/

public class NormalEmployee extends Employee {
    public NormalEmployee() {
    }

    public NormalEmployee(String name, double singleDaySal, double workDay, double grade) {
        super(name, singleDaySal, workDay, grade);
    }

    @Override
    public void printSal() {
        System.out.println("普通员工：" + getName() + "工资：" + getSingleDaySal() * getGrade() * getWorkDay());
    }

}
