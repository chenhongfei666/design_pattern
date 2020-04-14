package com.design.build.demo;

/**
 * 抽象建造者
 *
 * @author chf
 */
public abstract class Builder {

    /**
     * 打地基
     */
    abstract void buildA();

    /**
     * 搭钢筋
     */
    abstract void buildB();

    /**
     * 铺电线
     */
    abstract void buildC();

    /**
     * 粉刷墙
     */
    abstract void buildD();

    /**
     * 造房子
     */
    abstract Product buildProduct();

}
