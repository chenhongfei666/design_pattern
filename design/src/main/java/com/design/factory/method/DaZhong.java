package com.design.factory.method;

import com.design.factory.simple.Car;

public class DaZhong implements Car {
    @Override
    public void getName() {
        System.out.println("大众车！");
    }
}
