package com.rumenz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Rumenz implements InitializingBean, BeanNameAware, ApplicationContextAware {

    private String name;

    public void init() {
        System.out.println("init-method is called");
    }


    public void setName(String name) {
        System.out.println("set方法 "+name);
        this.name = name;
    }

    public Rumenz() {
       System.out.println("无参数构造方法---->>>>");
    }

    public void p(){
        System.out.println("p==="+this.name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String name) {

        System.out.println("Aware setBeanName : "+name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware");
    }
}













































































