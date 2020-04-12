package com.design.factory.abstarctfactory;

public class Consumer {
    public static void main(String[] args) {

        System.out.println("===========小米系列产品==========");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhoneProduct iPhoneProduct = xiaoMiFactory.iPhoneProduct();
        iPhoneProduct.call();
        iPhoneProduct.sendMsg();
        IComputerProduct iComputerProduct = xiaoMiFactory.iComputerProduct();
        iComputerProduct.playVidao();

        System.out.println("==============华为系列产品=================");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IRoutProduct iRoutProduct = huaWeiFactory.iRoutProduct();
        iRoutProduct.openWife();
        iRoutProduct.setting();
    }
}
