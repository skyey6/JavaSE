package com.tky.houserent.service;

import com.tky.houserent.domain.House;

public class HouseService {

    private House[] houses; //保存House对象
    private int count = 1;  //记录当前储存了多少条房屋信息
    private int idCounter = 1;  //用于id自增

    public HouseService(int size) {
        houses = new House[size];   //创建HouseService对象时，指定数组大小
        //初始化一个House对象，用于测试
        houses[0] = new House(1,"jack","133","秀英区",2000,"未出租");
    }

    //添加一个房屋对象到houses中，返回true表示添加成功，false表示添加失败
    public boolean add(House newHouse) {
        //判断数组是否还能继续添加
        if (count >= houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        //添加房屋对象，房屋的id应自增长
        newHouse.setId(++idCounter);
        houses[count++] = newHouse; //数组中的房屋信息增加了
        return true;
    }

    //使用房屋id，删除一个房屋信息
    public boolean deleteById(int id) {
        //找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < count; i++) {   //遍历数组中存有房屋信息的位置
            if (houses[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {  //说明用户输入的id对应的房屋在数组中不存在
            System.out.println("此id对应的房屋在数组中不存在...");
            return false;
        }
        //如果找到对应房屋，则将对应位置置空，并将index后的元素前移
        for (int i = index; i < count - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[count-1] = null; //把最后一个房屋信息置空（不一定是数组的最后一个）
        count--;    //数组中的房屋个数减少
        return true;
    }

    //使用房屋id，查找对应房屋的信息
    public House findById(int id) {
        for (int i = 0; i < count; i++) {   //遍历数组中存有房屋信息的位置
            if (houses[i].getId() == id) {
                return houses[i];
            }
        }
        System.out.println("此id对应的房屋在数组中不存在...");
        return null;
    }

    //返回房屋数组
    public House[] list() {
        return houses;
    }

    //获取当前数组储存的房屋信息的条数
    public int getCount() {
        return count;
    }

}
