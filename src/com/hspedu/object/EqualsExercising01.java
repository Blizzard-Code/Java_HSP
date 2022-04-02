package com.hspedu.object;
//应用实例:判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都样,
//        则返回true，反之false。 EqualsExercise01.java

public class  EqualsExercising01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        System.out.println(person1.equals(person2));//

    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写 object的equals方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象 则直接返回ture
        if (this == obj) {
            return true;
        }
        //类型判断
        //方法定义的obj 编译类型是Object 运行类型是Person  instanceof比较的是运行类型
        //当运行类型person 是Person 类型时 就进行向下转型，进行判断。
        if (obj instanceof Person) {
            //是Person才比较
            //进行 向下转型  得到obj的各个属性。
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}