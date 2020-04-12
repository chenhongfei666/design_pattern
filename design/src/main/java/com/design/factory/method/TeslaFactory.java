package com.design.factory.method;

import com.design.factory.simple.Car;
import com.design.factory.simple.Tesla;

public class TeslaFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
