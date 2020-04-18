package com.design.proxy.dynamic2;

import com.design.proxy.staticproxy2.IuserService;
import com.design.proxy.staticproxy2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {

        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);

        // 自动生成代理类
        IuserService proxy = (IuserService) handler.getProxy();
        proxy.query();
        proxy.add();
    }
}
