package com.testStatic;

class  A {
    private int i;
    public  static int cnt = 0;

    public A() {
        cnt++;
    }

    public A(int i) {
        this.i = i;
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }

}

public class TestStatic_1 {
    public static void main(String[] args) {
        System.out.println("当前时刻a对象的个数," + A.getCnt());
        A aa1 = new A();
        A aa2 = new A();
        System.out.println("当前时刻a对象的个数," + A.getCnt());

    }
}
