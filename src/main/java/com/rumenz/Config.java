package com.rumenz;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    public Config() {
        System.out.println("Config : 无参数构造方法");
    }

    @Bean(initMethod = "init")
    public Rumenz rumenz(){
        Rumenz r=new Rumenz();
        r.setName("99999");
        return r;
    }
}
