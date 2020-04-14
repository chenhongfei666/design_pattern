package com.design.build.demo1;

public class Test {
    public static void main(String[] args) {
        // 服务员
        Worker worker = new Worker();
//        Product product = worker.getProduct();
//        System.out.println(product.toString());


        Product product = worker.buildA("辣条").buildB("臭豆腐").getProduct();
        System.out.println(product.toString());
    }
}
