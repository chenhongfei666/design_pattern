package com.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 懒汉式（双重检查）
 * 缺点：多线程情况会有问题
 * 使用反射搞一下
 *
 * @author chf
 */
public class DoubleCkeckNoSafe {

    private static boolean flag = false;

    private DoubleCkeckNoSafe() {
        synchronized (DoubleCkeckNoSafe.class) {
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("不要视图使用反射创建对象");
            }
        }
    }

    /**
     * 有可能指令重排,需要加volatile关键字
     */
    private volatile static DoubleCkeckNoSafe instance;


    /**
     * 双重检查模式懒汉单例，DCL懒汉式
     */
    public static DoubleCkeckNoSafe getInstance() {
        if (instance == null) {
            synchronized (LazzyMan.class) {
                if (instance == null) {
                    // 不是原子操作
                    instance = new DoubleCkeckNoSafe();
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

    /**
     * 反射创建对象
     */
    public static void main(String[] args) throws Exception {

//        LazzyMan3 instance = LazzyMan3.getInstance();
//        System.out.println(instance.hashCode());

        Field flag = DoubleCkeckNoSafe.class.getDeclaredField("flag");
        flag.setAccessible(true);

        Constructor<DoubleCkeckNoSafe> declaredConstructor = DoubleCkeckNoSafe.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        DoubleCkeckNoSafe instance2 = declaredConstructor.newInstance();
        System.out.println(instance2.hashCode());

        // 通过反射修改标识位
        flag.set(instance2,false);

        DoubleCkeckNoSafe instance3 = declaredConstructor.newInstance();
        System.out.println(instance3.hashCode());


    }
}
