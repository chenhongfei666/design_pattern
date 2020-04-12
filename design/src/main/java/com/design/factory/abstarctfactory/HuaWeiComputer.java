package com.design.factory.abstarctfactory;

public class HuaWeiComputer implements IComputerProduct {
    @Override
    public void start() {
        System.out.println("华为笔记本开机");
    }

    @Override
    public void playVidao() {
        System.out.println("华为笔记本播放视频");
    }
}
