package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
    BB bb = new BB();

        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //aa编译类型AA 运行类型BB
        AA aa = new BB();
        //判断aa的运行类型BB()是否是 AA或者BB的子类型
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
        String str= "he";
        int in = 5;
    }
}

class AA{}
class BB extends AA{}

