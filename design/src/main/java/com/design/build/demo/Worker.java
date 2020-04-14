package com.design.build.demo;

public class Worker extends Builder {

    private Product product;

    /**
     * 这一步很关键，房子是工人创建的,不是传进来的
     */
    public Worker() {
        this.product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("打地基");
        System.out.println("打地基");
    }

    @Override
    void buildB() {
        product.setBuildB("搭钢筋");
        System.out.println("搭钢筋");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷墙");
        System.out.println("粉刷墙");
    }

    @Override
    Product buildProduct() {
        return product;
    }
}
