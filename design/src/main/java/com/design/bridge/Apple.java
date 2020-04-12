package com.design.bridge;

/**
 * 苹果品牌
 * @author chf
 */
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.println("苹果品牌");
    }
}
