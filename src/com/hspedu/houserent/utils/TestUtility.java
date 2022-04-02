package com.hspedu.houserent.utils;

public class  TestUtility {
    public static void main(String[] args) {
        //测试
        //要求输入一个字符串 长度最大为3
//        String s = Utility.readString(3);
//        System.out.println("s="+s);
        //要求输入一个字符串 长度最大为10，如果用户直接回车 就赋一个默认值

        //直接调用类.方法()  未实例化对象因为当一个方法是static时，这就是一个静态方法
//        静态方法可以直接通过类名调用，
        String s2 = Utility.readString(10, "hspedu");
        System.out.println("s2"+s2);
    }
}
