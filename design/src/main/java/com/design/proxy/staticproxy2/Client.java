package com.design.proxy.staticproxy2;

/**
 * 增强方法，不改动原有逻辑，扩展功能
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyUser proxyUser = new ProxyUser();
        proxyUser.setUserService(userService);
        proxyUser.add();
    }

}
