package com.hspedu.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person p[] = new Person[3];
        p[0] = new Person("小红", "job1", 213);
        p[1] = new Person("小绿", "job2", 114);
        p[2] = new Person("小蓝", "job3", 15);
//        打印数组
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        //冒泡排序
        Person temp = null;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                if (p[j].getAge() > p[j + 1].getAge()) {
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] =temp;
                }
            }
        }
        //排序后
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}

class Person {
    private String name;
    private String job;
    private int age;

    public Person() {
    }

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
