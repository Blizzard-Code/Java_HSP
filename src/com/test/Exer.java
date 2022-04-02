package com.test;

public class Exer {
    public static void main(String[] args) {
//        NumMax numMax = new NumMax();
//        double[] arr = null;
//        Double res = numMax.max(arr);
//        if (res != null) {
//            System.out.println("最大值为" + res);
//        } else {
//            System.out.println("数组为空");
//        }
      /*  A02 a02 = new A02();
        String arr[] = null;
        System.out.println(a02.find("hsp", arr));*/

       /* A03 a03 = new A03();
        int[] arr2 = {10, 20, 30};
        a03.traverArr(a03.copyArr(arr2));*/

        A04 a04 = new A04(2, 2);
        Double res = a04.div();
        if(res==null){
            System.out.println("不能为空");
        }else {
            System.out.println(res);
        }

    }
}

class NumMax {
    public Double max(double arr[]) {
        //保障数组不为空
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else
            return null;
    }
}

class  A02 {
    public int find(String fingStr, String[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(fingStr)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

class A03 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }

    public void traverArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class A04 {
    double num1;
    double num2;

    public A04(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double div() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return null;
        }
    }
}