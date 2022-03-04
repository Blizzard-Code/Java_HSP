package com.hspedu.houserent;

import com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象 显示主菜单 程序的整个入口
        new HouseView().mainMenu();
        System.out.println("==========退出了房屋出租系统==========");
    }
}
