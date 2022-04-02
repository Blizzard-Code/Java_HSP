package com.test;

import static java.lang.Math.PI;

public class Home {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject passObject = new PassObject();
        passObject.printAreas(c,5);
    }
}

class  Circle {
    double radius;
    /*public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }
*/
    public double findArea() {
        return radius * radius * PI;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("Radius \t Area");
        for (int i = 1; i <=times ; i++) {
            c.setRadius(i);
            System.out.println(i+"\t"+c.findArea());
        }
    }
}
