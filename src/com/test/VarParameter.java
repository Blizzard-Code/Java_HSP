package com.test;

//        �������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)��
//        �������������ſγɼ�(�ܷ�),
//        �������������ſγɼ�(�ܷ�)����װ��һ���ɱ�����ķ���
//        ����HspMethod������showScore

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