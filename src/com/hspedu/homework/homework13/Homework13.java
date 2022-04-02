package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("学生1号", "男", 22, "2019");
        person[1] = new Student("学生2号", "女", 24, "2020");
        person[2] = new Teacher("教师3号", "男", 13, 23);
        person[3] = new Teacher("教师4号", "女", 53, 44);

        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].getAge() > person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后");
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Teacher) {
                ((Teacher) person[i]).printfInfo();
            } else if (person[i] instanceof Student) {
                ((Student) person[i]).printfInfo();
            }
        }

    }
}
