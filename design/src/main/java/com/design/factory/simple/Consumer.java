package com.design.factory.simple;

/**
 * 客户端
 * @author chf
 */
public class Consumer {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.getName();
        WuLing wuLing = new WuLing();
        wuLing.getName();

        // 简单工厂模式
        Car car = CarFactory.getCar("五菱");
        car.getName();
        Car car2 = CarFactory.getCar("特斯拉");
        car2.getName();

        Car wuLing2 = CarFactory.getWuLing();
        wuLing2.getName();
        Car tesla2 = CarFactory.getTesla();
        tesla2.getName();

    }
}
