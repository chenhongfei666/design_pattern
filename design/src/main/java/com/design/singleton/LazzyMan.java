package com.design.singleton;

/**
 * 懒汉式
 * 缺点：多线程情况会有问题
 *
 * @author chf
 */
public class LazzyMan {

    private LazzyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private static LazzyMan instance;

    public static LazzyMan getInstance() {
        if (instance == null) {
            instance = new LazzyMan();
        }
        return instance;
    }

    public static void main(String[] args) {

        // 模拟并发
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazzyMan.getInstance();
            }).start();
        }

    }
}
