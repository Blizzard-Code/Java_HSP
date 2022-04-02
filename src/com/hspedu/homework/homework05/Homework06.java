package com.hspedu.homework.homework05;

public class Homework06 {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Worker("工人",1000);
        e[1] = new Peasant("农民",2000);
        e[2] = new Waiter("服务员",3000);
        e[3] = new Teacher("教师",1000);
        e[4] = new Scientist("科学家",1000);

        for (int i = 0; i < e.length; i++) {
            if(e[i] instanceof Teacher){
                Teacher teacher = (Teacher)e[i];
                teacher.setDay(30);
                teacher.setDayOfMoney(100);
                e[i].printSalary();
            }else if(e[i] instanceof Scientist){
                Scientist scientist = (Scientist)e[i];
                scientist.setBonus(10000);
                e[i].printSalary();
            }else {
                e[i].printSalary();

            }
        }


    }
}
