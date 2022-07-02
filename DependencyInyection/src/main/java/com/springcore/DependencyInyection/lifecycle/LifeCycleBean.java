package com.springcore.DependencyInyection.lifecycle;

import com.springcore.DependencyInyection.DependencyInyectionApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")---recordar q predestroy no se ejecuta para beans de tipo prototype
@Lazy //si el bean es lazy no se inicializara a menos q se inyecte(que se cree una instancia)
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {
    private  static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
    /*
    * Se ejecuta durante la construccion del Bean "BeanNameAware"
    * */
    @Override
    public void setBeanName(String s) {
        log.info("Bean name aware {}", s);

    }
    /*
    * estos metodos se jecutan despues de la inyeccion de dependencia
    * */
    @PostConstruct
    public void init(){
        log.info("Post construct");
    }
    //este metodo se ejecuta antes de qel bean sea destruido
    //los metodos anotados con predestroy no se ejecutan para beans @prototipes
    //solo se ejecuta durante una terminacion de la VM de forma normal
    @PreDestroy
    public void destroyBean(){
        log.info("Pre destruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("After Property Set");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Destroy Method");
    }
}
