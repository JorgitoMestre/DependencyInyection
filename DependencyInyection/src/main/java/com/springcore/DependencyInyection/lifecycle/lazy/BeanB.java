package com.springcore.DependencyInyection.lifecycle.lazy;

import com.springcore.DependencyInyection.lifecycle.LifeCycleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
@Lazy(false) //asi se define un bean como Eager
public class BeanB {

    /*
    * cdo un bean eager depende deuno lazy se inicializan los dos,
    * a pesar de q no se halla creado instancia del bean Lazy
    * */
    @Autowired
    private BeanA beab_obj;
    private  static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @PostConstruct
    public void init(){
        log.info("Post construct B");
    }
}
