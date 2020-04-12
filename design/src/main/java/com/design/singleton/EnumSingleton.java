package com.design.singleton;

import java.lang.reflect.Constructor;

/**
 * 枚举单例
 * 优点：线程最安全，反射也破坏不了
 * @author chf
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }


}

class Test {
    public static void main(String[] args) throws Exception {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println(enumSingleton.hashCode());

        // 试图通过反射破坏   java.lang.NoSuchMethodException: com.design.singleton.EnumSingleton.<init>()
//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(null);
//        declaredConstructor.setAccessible(true);
//        EnumSingleton enumSingleton1 = declaredConstructor.newInstance();
//        System.out.println(enumSingleton1.hashCode());


        // 期望报错结果  java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        Constructor<EnumSingleton> declaredConstructor1 = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor1.setAccessible(true);
        EnumSingleton enumSingleton2 = declaredConstructor1.newInstance();
        EnumSingleton enumSingleton3 = declaredConstructor1.newInstance();
        System.out.println(enumSingleton2.hashCode());
        System.out.println(enumSingleton3.hashCode());


    }
}