package com.zh.extend_;



public class extendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        //System.out.println(son.age);
    }
}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";

}
class Father extends GrandPa {
    String name = "大头爸爸";
  private   int age = 18;
}
class  Son extends Father{
    String name = "大头儿子";
}