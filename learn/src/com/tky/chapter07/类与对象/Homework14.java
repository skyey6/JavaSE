package com.tky.chapter07.类与对象;

import java.util.Random;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Player player = new Player();
        player.gameStart();
    }
}
// 0表示石头，1表示剪刀，2表示布
class Player {
    int playerNum;      //玩家出的拳
    int computerNum;    //电脑出的拳
    int round;          //游玩局数
    int win;            //玩家胜利次数
    Scanner scan = new Scanner(System.in);

    /**
     * 电脑生成猜拳数字的方法
     */
    public void genComputerNum() {
        Random rand = new Random();
        computerNum = rand.nextInt(3);
    }

    /**
     * 设置玩家猜拳数字
     * @param playerNum 猜拳数字
     */
    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public void gameStart() {
        System.out.print("请输入游玩局数：");
        round = scan.nextInt();
        win = 0;
        for (int i = 0; i < round; i++) {
            System.out.println("请输入数字(0表示石头，1表示剪刀，2表示布)：");
            setPlayerNum(scan.nextInt());
            genComputerNum();
            System.out.print("你出的是" + playerNum + "，电脑出的是" + computerNum + "，");
            if ((playerNum==0 && computerNum==1) || (playerNum==1 && computerNum==2) || (playerNum==2 && computerNum==0)) {
                win++;
                System.out.println("你赢了");
            } else if (playerNum == computerNum) {
                System.out.println("平局");
            } else {
                System.out.println("你输了");
            }
        }
        System.out.println("你游玩了" + round + "局，获胜了" + win + "局。");
    }


}