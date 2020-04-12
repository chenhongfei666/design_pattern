package com.design.factory.method;

import com.design.factory.simple.Car;

public class DaZhongFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new DaZhong();
    }
}
