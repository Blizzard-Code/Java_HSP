package com.hspedu.pkg;
//建议需要使用到那个类 就导入那个类 不建议使用*

import java.util.Arrays;

public class  Import01 {
    public static void main(String[] args) {
        //使用系统提供的 Array完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //系统提供相关的类 排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
