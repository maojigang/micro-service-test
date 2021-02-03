package com.springboot;

import com.springboot.config.BootConfig;
import com.springboot.config.test.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lenovo on 2020/12/18.
 */
@SpringBootApplication
public class SpringBootServiceApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootServiceApplication.class, args);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BootConfig.class);
        applicationContext.refresh();

        TestDemo bean = applicationContext.getBean(TestDemo.class);

        System.out.println(0);

    }
}
