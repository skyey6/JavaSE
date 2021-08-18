package com.tky.chapter07.类与对象;

public class Method02 {
    public static void main(String[] args) {
        int[][] map = {{0,0,1},
                       {1,1,1},
                       {1,1,3}};
        MyTools tool = new MyTools();
        tool.printArr(map);

    }
}

class MyTools{

    //方法，打印一个二维数组
    public void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
