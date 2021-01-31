package com.normal.jdk.reflect;

/**
 * Created by lenovo on 2021/1/31.
 */
public class ReflectDemo {

    private static String staticString;
    private int num;
    public Float amount;
    private static FieldBean fieldBean = new FieldBean();

    public ReflectDemo(){

    }

    public ReflectDemo(int num) {
        this.num = num;
    }

    static {
        System.out.println("------------static-------------");
    }
}
