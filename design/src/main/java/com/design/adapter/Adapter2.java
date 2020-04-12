package com.design.adapter;

/**
 * 真正的适配器，转换器，需要连接电脑和网线
 * <p>
 * Adaptee  要被适配的类  网线
 * 2.组合（对象适配器，常用）
 *
 * @author chf
 */
public class Adapter2 implements NetToUsb {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();  // 这样可以上网了

    }


}
