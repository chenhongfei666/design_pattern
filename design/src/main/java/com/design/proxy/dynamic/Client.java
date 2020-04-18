package com.design.proxy.dynamic;

public class Client {
    public static void main(String[] args) {

        // 真实角色
        HouseMaster houseMaster = new HouseMaster();

        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(houseMaster);

        // 自动生成代理类
        Rent proxy = (Rent) handler.getProxy();

        proxy.rent();

    }
}
