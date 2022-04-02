package com.hspedu.object.exercise.Homework10;

public class  Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack",20,"牙科医生","男",20000);
        Doctor doctor2 = new Doctor("jack",20,"牙科医生","男",20000);
        Doctor doctor3 = new Doctor("j1ack",20,"牙科医生","男",20000);

        System.out.println(doctor.equals(doctor2));
        System.out.println(doctor.equals(doctor3));

    }
}
