package com.testStatic;

class B {
    public int i = 20;
    private static B bb = new B();

    private B() {

    }    

    public static B getB() {
        return bb;
    }
}

public class TestStatic_2 {
    public static void main(String[] args) {
        B bb1 = B.getB();
        B bb2 = B.getB();
        bb1.i = 99;
        System.out.println(bb2.i);

        if (bb1 == bb2) {
            System.out.println("相等");
        }

    }
}
