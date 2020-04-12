package com.design.bridge;

/**
 * 台式电脑
 * @author chf
 */
public class Desktop extends AbstractComputer{
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void computerInfo() {
        super.computerInfo();
        System.out.println("台式机");
    }
}
