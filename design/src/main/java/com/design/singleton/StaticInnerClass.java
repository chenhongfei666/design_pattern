package com.design.singleton;

/**
 * 静态内部类方式
 *
 * 同样是不安全的，可以通过反射破坏
 *
 * @author chf
 */
public class StaticInnerClass {

    private StaticInnerClass() {

    }

    public static StaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    public static class InnerClass {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }


}
