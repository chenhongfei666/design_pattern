package com.design.factory.abstarctfactory;

public class HuaWeiRout implements IRoutProduct {
    @Override
    public void start() {
        System.out.println("华为路由器打开");
    }

    @Override
    public void shoutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWife() {
        System.out.println("华为路由器打开WIFE");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
