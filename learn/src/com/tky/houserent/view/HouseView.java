package com.tky.houserent.view;

import com.tky.houserent.domain.House;
import com.tky.houserent.service.HouseService;
import com.tky.houserent.utils.Utility;


public class HouseView {
    private boolean loop = true;   //控制显示菜单
    private char key;   //接收用户选择
    private HouseService houseService = new HouseService(3);   //设置房屋数组的大小为10

    //接收用户输入，新建一个房屋对象，调用HouseService中的add方法，添加一个房屋
    public void addHouse() {
        System.out.println("-------------------添加房屋-------------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("当前状态(未出租/已出租)：");
        String state = Utility.readString(3);
        //创建一个新的house对象，id由系统分配
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
            return;
        }
        System.out.println("-------------------添加完成-------------------");
    }

    //接收用户输入的id，调用deleteById方法，删除房屋
    public void delHouse() {
        System.out.println("-------------------删除房屋-------------------");
        System.out.print("请输入待删除房屋的编号(输入-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("放弃了删除...");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'N') {
            System.out.println("放弃了删除...");
            return;
        }
        if (houseService.deleteById(id)) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
            return;
        }
        System.out.println("-------------------删除完成-------------------");
    }

    //接收用户输入的id，调用findById方法，查找房屋
    public void findHouse() {
        System.out.println("-------------------查找房屋-------------------");
        System.out.print("请输入需要查看的房屋的编号(输入-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("放弃了查找...");
            return;
        }
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        if (houseService.findById(id) == null) {
            System.out.println("查找失败");
            return;
        }
        System.out.println(houseService.findById(id));
        System.out.println("-------------------查找完成-------------------");
    }

    //根据id，修改房屋信息
    public void updateHouse() {
        System.out.println("-----------------修改房屋信息------------------");
        System.out.print("请输入待修改的房屋的编号(输入-1退出)：");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("放弃了修改...");
            return;
        }
        //根据输入的id查找房屋对象
        House house = houseService.findById(id);
        if (house == null) {
            System.out.println("修改失败");
            return;
        }
        System.out.print("姓名(" + house.getName() + ")：");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话(" + house.getPhone() + ")：");
        String phone = Utility.readString(11, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + ")：");
        String address = Utility.readString(20, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getState() + ")：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("------------------修改完成-------------------");
    }

    //显示房屋列表
    public void listHouses() {
        System.out.println("-------------------房屋列表-------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();   //得到房屋数组
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {    //如果为空，就不再继续显示
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("----------------房屋列表显示完毕----------------");
    }

    //显示主菜单的方法
    public void mainMenu() {
        do {
            System.out.println("\n================房屋出租系统================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 列 表");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("------------------------------------------");
            System.out.print("请输入你的选择(1-6): ");

            key = Utility.readChar();
            switch (key) {
                case '1':
                    if (houseService.getCount() >= houseService.list().length) {
                        System.out.println("数组已满，不能再添加了...");
                        break;
                    }
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    if (houseService.getCount() == 0) {
                        System.out.println("没有房屋信息可以删除了...");
                        break;
                    }
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    char c = Utility.readConfirmSelection();
                    if (c == 'Y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择异常，请重新输入(1-6): ");
            }
        } while (loop);
        System.out.println("================退出房屋系统================");

    }
}
