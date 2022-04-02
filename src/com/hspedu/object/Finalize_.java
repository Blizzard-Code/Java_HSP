package com.hspedu.object;
//演示finalize使用
public class Finalize_ {
    public static void main(String[] args) {
        Car byd = new Car("BYD");
        byd = null;
        //这时car对象就是一个垃圾，垃圾回收器就会销毁对象，
        // 在销毁对象空间前会调用该对象的finalize方法
        //程序员可在finalize方法中写业务逻辑方法  比如释放资源，数据库的链接，打开文件
        //如果不重写finalize 就会调用object类的finalize
        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了");
    }
}
class  Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车"+name);
        System.out.println("释放了某些资源");
    }
}