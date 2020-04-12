package com.design.bridge;

public class Test {

    public static void main(String[] args) {

        Desktop desktopComputer = new Desktop(new Lenovo());
        desktopComputer.computerInfo();

        Laptop laptop = new Laptop(new Apple());
        laptop.computerInfo();

    }
}
