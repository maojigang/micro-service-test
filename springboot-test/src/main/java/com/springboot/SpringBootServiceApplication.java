package com.springboot;

import com.springboot.config.BootConfig;
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

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        System.out.println(0);

    }
}
