package com.design.factory.abstarctfactory;

public class XiaoMiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRoutProduct iRoutProduct() {
        return new XiaoMiRout();
    }

    @Override
    public IComputerProduct iComputerProduct() {
        return new HuaWeiComputer();
    }
}
