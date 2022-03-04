package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/**
 * 业务层
 * 定义Hose[] 保存House对象
 * 1.响应HouseView的调用
 * 2. 完成对房屋信息的CRUD
 */

public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长到那个值

    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象 指定数组大小
        //为了配合测试列表信息 这里初始化一个House对象
        houses[0] = new House(1, "jack", "112", "龙南县", 2000, "未出租");
    }

    //list方法  返回houses
    public House[] list() {
        return houses;
    }

    //删除方法 删除一个房屋信息
    public boolean del(int delId) {
        //应该先找到要删除的房屋信息对于的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {//要删除的房屋对于id, 在数组下标为i的元素
                index = i;//使用index记录i

            }
        }
        if (index == -1) {//说明delId在数组中不存在
            return false;
        }
        //如果找到，
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];

        }

        return false;
    }

    //add方法 添加新对象 返回boolean
    public boolean add(House newHouse) {
        //判断是否可以继续添加 暂时不考虑数组扩容问题
        if (houseNums == houses.length) {//不能添加
            System.out.println("数组已满 不能添加");
            return false;
        }
        //把newHouse对象 加入到
        houses[houseNums++] = newHouse;
//        或者houses[houseNums] = newHouse;
        newHouse.setId(++idCounter);
        return true;
//        houseNums++;//新增加一个房屋

        //或者
        ///设置一个id自增长的机制
    }
}
