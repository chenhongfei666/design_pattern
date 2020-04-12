package com.design.factory.simple;

public class Tesla implements Car {
    @Override
    public void getName() {
        System.out.println("特斯拉！");
    }
}
