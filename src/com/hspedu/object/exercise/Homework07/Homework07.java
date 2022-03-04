package com.hspedu.object.exercise.Homework07;

public class Homework07 {
}
class Test{
    String name = "rose";
    Test(){
        System.out.println("test");
        System.out.println(name);
    }
    Test(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Demo extends Test{
    String name = "jack";
    Demo(){
        super();
        System.out.println("Demo");
        System.out.println(name);
    }

     Demo(String s) {
        super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public  static void main(String[] args) {
       // new Demo().test();
       // new Demo("john").test();
        Demo demo = new Demo();
        demo.setName("动态传参");
        demo.getName();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
