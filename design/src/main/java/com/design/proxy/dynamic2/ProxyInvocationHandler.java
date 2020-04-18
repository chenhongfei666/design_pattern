package com.design.proxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 可以当成一个公共类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     */
    public Object getProxy() {


        /**
         *  public static Object newProxyInstance
         *  (ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         *
         *  1.ClassLoader loader: 指定当前目标对象使用的类加载器，获取加载器的方法固定
         *  2.interfaces:目标对象实现的接口类型，使用泛型的方式确认类型
         *  3.InvocationHandler: 事件处理，执行目标对象的方法时，会去触发事件处理器的方法，
         *      会把当前执行的目标对象方法作为参数传递(method)
         *
         *  最终返回一个代理对象，然后invoke中对代理对象进行加强（反射机制）
         *
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                // this 代表  InvocationHandler
                target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }


    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }

}

