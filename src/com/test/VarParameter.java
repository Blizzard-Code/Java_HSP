package com.test;

//        有三个方法，分别实现返回姓名和两门课成绩(总分)，
//        返回姓名和三门课成绩(总分),
//        返回姓名和五门课成绩(总分)。封装成一个可变参数的方法
//        类名HspMethod方法名showScore

public class VarParameter {
    public static void main(String[] args) {
        person p = new person();
        B t = new B();
        t.test01();
        t.test02(p);

    }

}

class hspmethod {
    public String varPara(String name, double... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return name + sum;
    }
}

class B {
    public void test01() {
        person p = new person();
        System.out.println(p.name);
    }

    public void test02(person p) {
        System.out.println(p.name);
    }

}

class person {
    String name = "jack";
}