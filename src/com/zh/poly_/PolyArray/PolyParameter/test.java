package com.zh.poly_.PolyArray.PolyParameter;

public class test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",1200);
        Manager milan = new Manager("milan", 5000, 20000);
        test t = new test();
        t.showEmpAnnual(tom);
        t.showEmpAnnual(milan);
        t.testWork(tom);
        t.testWork(milan);
        Integer i = new Integer(5);
    }

    public  void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }

    public void testWork(Employee e){
        if(e instanceof Manager){
            ((Manager) e).manage();
        }else if(e instanceof Worker) {
           Worker wk = (Worker)e;
           wk.work();
        }
    }
}
