package com.tky.chapter10.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/20 13:03
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car1 = new Car(41);
        car1.new AirConditioner().flow();

        Car car2 = new Car(-1);
        car2.new AirConditioner().flow();

        Car car3 = new Car(25);
        car3.new AirConditioner().flow();
    }
}

class Car {
    private int temperature; //车内温度

    public Car(int temperature) {
        this.temperature = temperature;
    }

    //车内空调
    class AirConditioner {

        public void flow() {
            if (temperature > 40) {
                System.out.println("车内温度大于40，吹冷气...");
            } else if (temperature < 0) {
                System.out.println("车内温度小于0，吹暖气...");
            } else {
                System.out.println("车内空调未开启");
            }
        }

    }

}