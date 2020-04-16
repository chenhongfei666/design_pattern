package com.design.proxy.staticproxy;

/**
 * 代理作用：增强
*/
public class Client {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();

        Intermediary intermediary = new Intermediary(houseMaster);
        intermediary.rent();

    }
}
