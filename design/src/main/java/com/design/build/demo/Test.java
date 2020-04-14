package com.design.build.demo;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Product product = director.build(worker);
        System.out.println(product.toString());

    }
}
