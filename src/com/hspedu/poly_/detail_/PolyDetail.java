package com.hspedu.poly_.detail_;

public class  PolyDetail {
    public static void main(String[] args) {
        //向上转型 父类引用指向了子类的对象
        // 语法 父类引用名 = new 子类类型11
        Animal animal = new Cat();
        // Object obj = new Cat();
        //可以调用父类中的所有成员
        //但是不能调用子类的特有成员
        // animal.catchmouse 因为在编译阶段能调用那些成员是由编译类型决定是animial
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类重写了父类的方法开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
      /*  编译的时候是直接看编译类型有没有这个方法，没有就报错， 不会找子类有没有，
          所以说子类特有方不能调用法
          你就想象成你编写时，按照编译类型来定义，自身类肯定不能调用子类的特有方法，
          但是运行时，它就是运行类型 然后开始调用方法*/
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        //向下转型
        //希望调用 cat的的catchMouse方法
        // (1)子类类型引用名= (子类类型)父类引用;
        Cat cat = (Cat) animal;
        //cat 的编译类型和运行类型是Cat
        cat.catchMouse();
//      (2)  要求父类的引用必须指向的是当前目标类型的对象 要求 animal原先指向的就是猫 先向上转型再乡下转型



    }
}
