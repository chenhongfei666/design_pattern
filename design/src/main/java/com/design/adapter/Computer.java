package com.design.adapter;

/**
 * 客户端类  想上网，但是插不上网线
 *
 * @author chf
 */
public class Computer {

    /**
     * 电脑需要使用转换器才能上网，需要转换器
     */
    public void net(NetToUsb netToUsb) {
        // 上网的具体实现，需要一个转接头
        netToUsb.handleRequest();
    }


    public static void main(String[] args) {
        // 电脑，适配器，网线

//        // 电脑
//        Computer computer = new Computer();
//        // 网线，要被适配的类
//        Adaptee adaptee = new Adaptee();
//        // 适配器，转换器
//        Adapter adapter = new Adapter();
//
//        computer.net(adapter);

        Computer computer = new Computer(); //电脑
        Adaptee adaptee = new Adaptee();  //网线
        Adapter2 adapter2 = new Adapter2(adaptee); //转换器，网线插在转换器上
        computer.net(adapter2);

    }
}

