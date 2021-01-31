package com.normal.jdk.reflect;

/**
 * Created by lenovo on 2021/1/31.
 */
public class FieldBean {
    public FieldBean() {
        System.out.println("------------FieldBean-------------");
    }

    static {
        System.out.println("------------FieldBean static-------------");
    }

    {
        System.out.println("------------FieldBean {}-------------");
    }

    public  static void testStatic(){

    }
}
