package com.design.singleton;

/**
 * 饿汉式
 * 优点：简单，在类加载时完成类得初始化，线程安全
 * 缺点：没有达到懒加载得效果，如果该类从未使用过，会造成内存浪费
 *
 * @author chf
 */
public class HungryMan {

    /**
     * 1.私有构造方法，外部不能new
     */
    private HungryMan() {
    }

    /**
     * 2.类内部创建实例（类加载时创建，因构造器私有，后期不能再创建）
     */
    private final static HungryMan INSTANCE = new HungryMan();

    /**
     * 3.对外提供获取实例对象方法
     */
    public static HungryMan getInstance() {
        return INSTANCE;
    }


    public static void main(String[] args) {
        HungryMan instance = HungryMan.getInstance();
        HungryMan instance1 = HungryMan.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());


    }

}


