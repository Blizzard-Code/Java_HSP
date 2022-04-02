package com.hspedu.object.exercise.Homework13;

public class  Homework13 {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Student("学生小红","女",14,"20180039");
        p[1] = new Student("学生小蓝","男",15,"20180040");
        p[2] = new Teacher("老师小黄","女",26,3000);
        p[3] = new Teacher("老师小嘿","女",28,5000);

        Method method = new Method();
        method.sort(p);
        method.printArr(p);



    }
}
class  Method{
    //排序
    public void sort(Person[] p ){
        Person temp = null;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1- i; j++) {
                if(p[j].getAge() < p[j+1].getAge()){
                    temp = p[j+1];
                    p[j+1] = p[j];
                    p[j] = temp;
                }
            }
        }
    }

    //打印数组
    public void printArr(Person[] p ){
        /*for (int i = 0; i <p.length ; i++) {
           if(p[i] instanceof Student){
              Student stt = (Student)p[i];
               System.out.println(stt.getName()+"\t"+stt.getAge()+"\t"+stt.getSex()+"\t"+stt.getStu_id());
               System.out.println(stt.play());
           }else if(p[i] instanceof Teacher){
               Teacher teacher = (Teacher)p[i];
               System.out.println(teacher.getName()+"\t"+teacher.getAge()+"\t"+teacher.getSex()+"\t"+teacher.getWork_age());
               System.out.println(teacher.play());
           }
        }*/
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }

    public void useMethod(Person []person){
        for (int i = 0; i < person.length; i++) {
            if(person[i] instanceof Student){
               Student st = (Student)person[i];
               st.study();
            }else if(person[i] instanceof Teacher)
            {
                ((Teacher) person[i]).teach();
            }
        }

    }
}