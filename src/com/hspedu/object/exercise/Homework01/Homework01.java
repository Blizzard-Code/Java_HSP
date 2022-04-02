package com.hspedu.object.exercise.Homework01;

//定义一个Person类{name,job,age}初始化Person对象数组，有3个person对象 并按照ag从大到小排序使用冒泡排序
public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("小明1", 23, "JAVA架构师");
        person[1] = new Person("小明22", 24, "C架构师");
        person[2] = new Person("小明333", 22, "C#架构师");
        person[3] = new Person("小明4444", 54, "C++架构师");
        person[4] = new Person("小明55555", 12, "php架构师");

        //打印数组
        Person person1 = new Person();
        //排序前
        System.out.println("============================排序前============================");
        person1.printArr(person);
        System.out.println("============================排序后============================");
        person1.BubbleSort(person);
        person1.printArr(person);

        //打印数组

    }
}

class  Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //排序
    public void BubbleSort(Person[] person) {
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                //按年龄
//                       按名字大小
                //if (person[j].getName().length() < person[j + 1].getName().length()) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
    }

    //打印数组
    public void printArr(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}