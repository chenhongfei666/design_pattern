package com.design.bridge;

/**
 * 笔记本电脑
 * @author chf
 */
public class Laptop extends AbstractComputer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void computerInfo() {
        super.computerInfo();
        System.out.println("笔记本电脑");
    }
}
