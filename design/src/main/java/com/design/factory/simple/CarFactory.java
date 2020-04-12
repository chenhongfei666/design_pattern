package com.design.factory.simple;

/**
 * 简单工厂模式、静态工厂模式
 */
public class CarFactory {

    // 方法一
    public static Car getCar(String carName) {
        if ("五菱".equals(carName)) {
            return new WuLing();
        } else if ("特斯拉".equals(carName)) {
            return new Tesla();
        } else {
            return null;
        }
    }


    // 方法二--------------------------------
    public static Car getWuLing() {
        return new WuLing();
    }

    public static Car getTesla() {
        return new Tesla();
    }

}
