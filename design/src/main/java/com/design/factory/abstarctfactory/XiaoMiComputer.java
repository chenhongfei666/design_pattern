package com.design.factory.abstarctfactory;

public class XiaoMiComputer implements IComputerProduct {
    @Override
    public void start() {
        System.out.println("小米笔记本开机");
    }

    @Override
    public void playVidao() {
        System.out.println("小米笔记本播放视频");
    }
}
