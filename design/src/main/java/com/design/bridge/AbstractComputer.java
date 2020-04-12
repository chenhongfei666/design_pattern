package com.design.bridge;

/**
 * 抽象电脑类
 *
 * @author chf
 */
public abstract class AbstractComputer {

    // 组合品牌
    private Brand brand;


    public AbstractComputer(Brand brand) {
        this.brand = brand;

    }

    public void computerInfo() {
        brand.info();// 自带品牌
    }


}
