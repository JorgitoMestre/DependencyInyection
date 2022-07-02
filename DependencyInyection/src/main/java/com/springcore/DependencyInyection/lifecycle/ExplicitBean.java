package com.springcore.DependencyInyection.lifecycle;

import com.springcore.DependencyInyection.DependencyInyectionApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExplicitBean {
    private  static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    public void init(){
       log.info("Init metthod");
    }

    public void destroy(){
        log.info("Destroy metthod");
    }
}
