package com.hspedu.object.exercise.Homework11;

public class  Homework11 {
    public static void main(String[] args) {
        //向上转型
        Person person = new Student();
        person.run();//studentrun
        person.eat();//person eat
        //向下转型
        Student student =(Student) person;
        student.run();//student run
        student.study();//student study
        student.eat();
    }
}
