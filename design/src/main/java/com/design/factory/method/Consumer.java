package com.design.factory.method;

import com.design.factory.simple.Car;

/**
 * 工厂方法模式
 *
 * @author chf
 */
public class Consumer {
    public static void main(String[] args) {
        TeslaFactory teslaFactory = new TeslaFactory();
        Car car = teslaFactory.getCar();
        car.getName();

        WuLingFactory wuLingFactory = new WuLingFactory();
        Car car1 = wuLingFactory.getCar();
        car1.getName();

        DaZhongFactory daZhongFactory = new DaZhongFactory();
        Car car2 = daZhongFactory.getCar();
        car2.getName();


    }
}
