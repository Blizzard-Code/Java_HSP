package com.zh.poly_.PolyArray.PolyParameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通工人：" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() { //因为普通工人的年薪就是employee里的年薪
        return  super.getAnnual();
    }
}
