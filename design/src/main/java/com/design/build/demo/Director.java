package com.design.build.demo;

/**
 * 指挥者:核心，造房子步骤在这里控制
 *
 * @author chf
 */
public class Director {

    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.buildProduct();
    }
}
