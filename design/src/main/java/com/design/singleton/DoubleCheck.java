package com.design.singleton;

/**
 * 懒汉式（双重检查）
 * 缺点：多线程情况会有问题
 *
 * @author chf
 */
public class DoubleCheck {

    private DoubleCheck() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    /**
     * 有可能指令重排,需要加volatile关键字
     */
    private volatile static DoubleCheck instance;


    /**
     * 双重检查模式懒汉单例，DCL懒汉式
     */
    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazzyMan.class) {
                if (instance == null) {
                    // 不是原子操作
                    instance = new DoubleCheck();
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.将对象指向这个内存空间
                     *
                     * 因此极端情况下会发生指令重排，要加volatile
                     */
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        // 模拟并发
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DoubleCheck.getInstance();
            }).start();
        }

    }
}
