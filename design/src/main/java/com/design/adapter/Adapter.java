package com.design.adapter;

/**
 * 真正的适配器，转换器，需要连接电脑和网线
 *
 * Adaptee  要被适配的类  网线
 * 1.继承（类适配器，单继承）
 * 2.组合（对象适配器，常用）
 *
 * @author chf
 */
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        super.request();  // 这样可以上网了

    }


}
