package com.design.factory.method;

import com.design.factory.simple.Car;
import com.design.factory.simple.WuLing;

public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
