package com.hspedu.poly_.polyarr_;

//应用实例:现有一个继承结构如下:要求创建1个Person对象、2个Student对象和2个Teacher对象
// ,统一放在数组中,并调用每个对象 say方法.


public class PolyArray {
    public static void main(String[] args) {
        //父类引用可以指向子类对象
        Person[] persons = new Person[5];//person和person的子类的可以放进去
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("JACK", 18, 100);
        persons[2] = new Student("smith", 30, 30.1);
        persons[3] = new Teacher("scott", 30, 200000);
        persons[4] = new Teacher("KING", 50, 250000);

        //**循环遍历数组调用say
        for (int i = 0; i < persons.length; i++) {
            //person[i];编译类型是Perosn  运行类型是根据实际情况有JVM判断
            System.out.println(persons[i].say());//动态绑定机制
            //类型判断+向下转型
            if (persons[i] instanceof Student) {//判断persons[i]的运行类型是不是student
                Student student = (Student) persons[i];//向下转型
                student.study();
                // ((Student)persons[i]).study(); 合成一步
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("类型有误");
            }
        }
    }
}
