package com.design.factory.simple;

public class Consumer {
    public static void main(String[] args) {
//        Tesla tesla = new Tesla();
//        tesla.getName();
//        WuLing wuLing = new WuLing();
//        wuLing.getName();

        // 简单工厂模式
        Car car = CarFactory.getCar("五菱");
        car.getName();
        Car car2 = CarFactory.getCar("特斯拉");
        car2.getName();

        Car wuLing = CarFactory.getWuLing();
        wuLing.getName();
        Car tesla = CarFactory.getTesla();
        tesla.getName();

    }
}
