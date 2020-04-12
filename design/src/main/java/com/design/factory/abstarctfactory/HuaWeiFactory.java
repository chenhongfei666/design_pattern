package com.design.factory.abstarctfactory;

public class HuaWeiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRoutProduct iRoutProduct() {
        return new HuaWeiRout();
    }

    @Override
    public IComputerProduct iComputerProduct() {
        return new HuaWeiComputer();
    }
}
