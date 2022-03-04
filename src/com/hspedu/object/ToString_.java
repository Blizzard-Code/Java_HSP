package com.hspedu.object;

public class ToString_ {
    public static void main(String[] args) {
        //
        // getClass().getName()全类名 包名+类名
        // Integer.toHexString(hashCode()将对象的hashcode值转成16进制字符串
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        Monster monster = new Monster("小妖股", "巡山", 10000);
        System.out.println(monster.toString()+" hascodeCode="+monster.hashCode());
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private  String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写toString方法 输出对象的属性
    //使用快捷键

//    @Override
//    public String toString() { //重写后默认输出对象的属性
//        return "Monster{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                ", sal=" + sal +
//                '}';
//    }
}