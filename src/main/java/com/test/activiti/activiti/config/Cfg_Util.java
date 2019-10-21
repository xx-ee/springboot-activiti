package com.test.activiti.activiti.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname Cfg_Util
 * @Description  一些工具bean
 * @Author xiedong
 * @Date 2019/10/21 11:31
 * @Version 1.0
 **/
@Configuration
public class Cfg_Util {


    //jackson xml util
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
