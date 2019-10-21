package com.test.activiti.activiti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Classname Cfg_Util
 * @Description  一些工具bean
 * @Author xiedong
 * @Date 2019/10/21 11:31
 * @Version 1.0
 **/
@Configuration
public class Cfg_View extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/index.html");
    }
}
