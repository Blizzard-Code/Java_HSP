package com.hspedu.object.exercise.Homework05;

public class Homework5 {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("锄禾",2000);
        peasant.printAnnualSal();

        Worker worker = new Worker("刘波",3000);
        worker.setSalMonth(13);
        worker.printAnnualSal();

        Waiter waiter = new Waiter("刘三皮",2500);
        waiter.printAnnualSal();

        Teacher zy = new Teacher("zy", 2000);
        zy.setTour(100);
        zy.setWorkday(300);
        zy.printAnnualSal();

        Scientist yzn = new Scientist("杨振宁", 10000);
        yzn.setYearBonus(300000);
        yzn.printAnnualSal();

    }
}
