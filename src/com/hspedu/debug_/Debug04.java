package com.hspedu.debug_;

import java.util.Arrays;

//演示执行到下一个断点同时支持动态的下短短
public class Debug04 {
    public static void main(String[] args) {
        int arr[] = {1,-1,10,-20,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println("Hello 100");
        System.out.println("Hello 200");
        System.out.println("Hello 300");
        System.out.println("Hello 400");
        System.out.println("Hello 500");
        System.out.println("Hello 600");
        System.out.println("Hello 700");
    }
}
