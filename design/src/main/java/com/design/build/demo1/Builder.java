package com.design.build.demo1;

/**
 * 抽象建造者
 * @author chf
 */
public abstract class Builder {

    abstract Builder buildA(String msg); //可乐
    abstract Builder buildB(String msg); //鸡翅
    abstract Builder buildC(String msg); //汉堡
    abstract Builder buildD(String msg); //甜点

    abstract Product getProduct();
}
