package com.test;

public class  getInfo {
    public static void main(String[] args) {

    }
}

class Music{
        public String name;
        public String times;

        public Music(String name ,String times){
            this.name=name;
            this.times=times;
        }
        public void play(){
            System.out.println(name+"正在播放。。。"+"时长为"+times);
        }
        public String getInfo(){
            return name + times;
        }
}
