package com.zh.poly_.PolyArray;

public class test {
    public static void main(String[] args) {

        Person[] p = new Person[5];
        p[0] = new Person("JACK", 45);
        p[1] = new Student("smith", 20, 100);
        p[2] = new Student("ja", 21, 99);
        p[3] = new Teacher("ja", 30, 10000);
        p[4] = new Teacher("ja", 35, 20000);
        //循环遍历多态数组调用say方法
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].say());//动态绑定机制

            if (p[i] instanceof Student) {
                //判断person【i]是不是student
                Student student = (Student) p[i];
                student.study();
            }else if(p[i] instanceof Teacher){
                Teacher teacher = (Teacher)p[i];
                teacher.teach();
            }


        }
    }
}
