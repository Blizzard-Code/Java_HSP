package com.hspedu.poly_.polyparameter_;

public class  Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "is working");
    }
//重写
    @Override
    public double getAnnual() {//普通员工没有其他收入 直接调用父类
        return super.getAnnual();
    }
}
