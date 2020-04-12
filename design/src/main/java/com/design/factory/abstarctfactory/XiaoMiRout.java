package com.design.factory.abstarctfactory;

public class XiaoMiRout implements IRoutProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shoutdown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void openWife() {
        System.out.println("小米路由器卡带WIFE");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
