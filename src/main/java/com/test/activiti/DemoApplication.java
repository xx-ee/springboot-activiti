package com.test.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname DemoApplication
 * @Description TODO
 * @Author xiedong
 * @Date 2019/10/21 11:31
 * @Version 1.0
 **/
@SpringBootApplication
@ComponentScan({"com.test","org.activiti"})
public class DemoApplication
{
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
