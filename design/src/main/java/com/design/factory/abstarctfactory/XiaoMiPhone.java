package com.design.factory.abstarctfactory;

public class XiaoMiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
}
