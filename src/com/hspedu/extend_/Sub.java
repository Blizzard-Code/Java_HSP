package com.hspedu.extend_;

public class Sub extends Base {
    public Sub(String name, int age) {
        //1.调用父类的无惨构造器   super(); 或者什么都不写
//        2.调用父类的Base(String name )的构造器
//        3.调用父类的Base(String name，int age )的构造器
//        super("d ",4);//super()必须放在第一行
        this();
        System.out.println("子类Sub(String name, int age)构造器被调用 ");

    }

    public Sub() {
        // super();//默认调用父类的无惨构造器隐藏写与不写都在这
      //  super("无参构造器Sub()初始化", 100);
        System.out.println("子类构造器sub()被调用.....");
    }

    //    当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
    public Sub(String name) {
//        如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作
        super("有参构造器Sub(String name)初始化", 100);
        System.out.println("子类构造器sub(Strin name)被调用.....");
    }

    public void sayOk() {//子类
        //我们发现父类的非private数学和方法都可可以访问,可以通过父类的公共方法
        //非私有属性（默认也可以 但是在子父不同包就不可以）和方法可以在子类直接访问
        //System.out.println(n1+n2+n3+n4 );
        //通过父类提供的公共方法访问n4
        System.out.println("n4 = " + getN4());

    }
}
