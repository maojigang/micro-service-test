package com.normal.jdk.reflect.test;

import com.normal.jdk.reflect.FieldBean;
import com.normal.jdk.reflect.ReflectDemo;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2021/1/31.
 */
public class ReflectTest {



    @Test
    public void testConstructor() throws Exception{
        Class<ReflectDemo> reflectDemoClass = ReflectDemo.class;
        Constructor<?>[] constructors = reflectDemoClass.getDeclaredConstructors();
        Constructor<ReflectDemo> constructor = reflectDemoClass.getDeclaredConstructor(int.class);
        ReflectDemo reflectDemo = constructor.newInstance(1);
        System.out.println();
    }

    @Test
    public void testStatic() throws Exception{
//        Class<ReflectDemo> reflectDemoClass = ReflectDemo.class;
//        new ReflectDemo(1);


        //1. 代码块每次new时执行，静态代码块第一次加载类时执行，而且只执行一次
//        FieldBean.testStatic();

        // 2 class.forName 会加载static ，ReflectDemo.class不会
        Class<?> aClass = Class.forName("com.normal.jdk.reflect.FieldBean");

        System.out.println();

    }


    @Test
    public void testMethod() throws Exception{
        Class<?> fieldBeanClass = Class.forName("com.normal.jdk.reflect.FieldBean");
        Method[] methods = fieldBeanClass.getMethods();

        Method testStatic = fieldBeanClass.getMethod("testStatic");

        // 前者是否可从后者转让过来
        boolean assignableFrom = fieldBeanClass.isAssignableFrom(Object.class);

        boolean assignableFrom1 = Object.class.isAssignableFrom(fieldBeanClass);

        Class<?> componentType = fieldBeanClass.getComponentType();

        System.out.println();

    }

}
