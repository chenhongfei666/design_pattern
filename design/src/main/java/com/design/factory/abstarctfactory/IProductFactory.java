package com.design.factory.abstarctfactory;

/**
 * 抽象工厂
 */
public interface IProductFactory {
    /**
     * 生产手机
     */
    IPhoneProduct iPhoneProduct();

    /**
     * 生产路由器
     */
    IRoutProduct iRoutProduct();

    /**
     * 生产笔记本
     */
    IComputerProduct iComputerProduct();
}
