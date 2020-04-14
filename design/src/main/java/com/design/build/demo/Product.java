package com.design.build.demo;

/**
 * 产品
 *
 * @author chf
 */
public class Product {

    /**
     * 打地基
     */
    private String buildA;

    /**
     * 搭钢筋
     */
    private String buildB;

    /**
     * 铺电线
     */
    private String buildC;

    /**
     * 粉刷墙
     */
    private String buildD;

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }
}
