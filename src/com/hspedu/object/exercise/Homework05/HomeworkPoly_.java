package com.hspedu.object.exercise.Homework05;

public class  HomeworkPoly_ {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Worker("工人", 3000);
        employee[1] = new Peasant("农民", 2000);
        employee[2] = new Waiter("服务员", 2500);
        employee[3] = new Teacher("老师", 2000);
        employee[4] = new Scientist("科学家", 10000);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof Worker ||
                    employee[i] instanceof Peasant ||
                    employee[i] instanceof Waiter) {
                employee[i].printAnnualSal();
            }else if(employee[i] instanceof Teacher){
                ((Teacher) employee[i]).setTour(100);
                ((Teacher) employee[i]).setWorkday(300);
                employee[i].printAnnualSal();
                //Teacher teacher = (Teacher)employee[i];
               // teacher.setWorkday(300);
            }else if(employee[i] instanceof Scientist){
                ((Scientist) employee[i]).setYearBonus(10000);
                employee[i].printAnnualSal();
            }

        }
    }
}
