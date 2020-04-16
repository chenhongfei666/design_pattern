package com.design.proxy.staticproxy;

/**
 * 房屋中介
 */
public class Intermediary implements Rent{

    // 组合房东
    private HouseMaster houseMaster;

    public Intermediary(HouseMaster houseMaster) {
        this.houseMaster = houseMaster;
    }

    @Override
    public void rent() {
        lookHouse();
        houseMaster.rent();
        pay();
    }

    public void lookHouse(){
        System.out.println("中介带看房子");
    }

    public void pay(){
        System.out.println("付中介费");
    }
}
