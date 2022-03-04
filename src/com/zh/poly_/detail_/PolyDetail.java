package com.zh.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
    //向上转型：父类引用指向了子类的对象
        Animal animal = new Cat();
        //Object obj = new Cat();
        //向上转型规则如下
        //1可以调用父类中的所有成员（需要遵守访问权限
        //2不能调动子类的特有成员
        //3因为在编译阶段，能调用那些成员 由编译类型决定
//        animal.catchMouse()；
        //4最终运行效果看子类 调用方法时从子类开始查找   要调用到eat()，此时子类必须重写父类的eat（）
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();


            //向下转形
//        1)语法:子类类型引用名=(子类类型)父类引用;
//        2)只能强转父类的引用,不能强转父类的对象
//        3)要求父类的引用必须指向的是当前目标类型的对象
//        4)当向下转型后，可以调用子类类型中所有的成员
            Cat cat =(Cat) animal;
            cat.catchMouse();


    }


}
