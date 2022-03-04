package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择的哪个菜单
    private HouseService houseService = new HouseService(1);//设置数组的大学为10

    //编写deleteHouse（）接收输入的id 调用service的del方法
    public void delHouse(){
        System.out.println("====================删除房屋信息====================");
        System.out.println("请输入待删除房屋的编号（-1退出）");
        int delId= Utility.readInt();
        if(delId == -1){
            System.out.println("====================放弃删除房屋信息====================");
            return;
        }
        //该方法本身就有循环判断的逻辑
        char choice = Utility.readConfirmSelection();
        if(choice =='Y'){//真的删除

        }else {
            System.out.println("====================放弃删除房屋信息====================");
        }
    }

    //addHouse()接收输入 创建Hose对象 调用add方法
    public void addHouse(){
        System.out.println("====================添加房屋====================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象 注意id是系统分配的，用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("添加房屋成功");
        }else {
            System.out.println("添加房屋失败");
        }
    }

    //编写listHouses()显示房屋列表
    public void listHouse() {
        System.out.println("====================房屋列表====================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {//
            if(houses[i] == null){
                break;//如果为空 就不再显示
            }
            System.out.println(houses[i]);
        }
        System.out.println("房屋列表显示完毕");
    }

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n===================房屋出租系统===================");
            System.out.println("\t\t\t1  新 增 房 源 ");
            System.out.println("\t\t\t2  查 找 房 屋 ");
            System.out.println("\t\t\t3  删 除 房 屋 信 息 ");
            System.out.println("\t\t\t4  修 改 房 屋 信 息 ");
            System.out.println("\t\t\t5  房 屋 列 表 ");//房屋列表
            System.out.println("\t\t\t6  退      出 ");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("查 找");
                    break;
                case '3':
                    System.out.println("删 除");
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }

        } while (loop);
    }

}
