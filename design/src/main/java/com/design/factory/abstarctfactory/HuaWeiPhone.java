package com.design.factory.abstarctfactory;

public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机发短信");
    }
}
