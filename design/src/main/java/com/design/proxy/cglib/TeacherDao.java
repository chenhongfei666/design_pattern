package com.design.proxy.cglib;

//目标对象
public class TeacherDao {
    public String teach() {
        System.out.println("老师正在上课");
        return "hello";
    }
}
