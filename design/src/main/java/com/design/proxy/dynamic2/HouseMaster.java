package com.design.proxy.dynamic2;

/**
 * 房东
 */
public class HouseMaster implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房屋");
    }
}
