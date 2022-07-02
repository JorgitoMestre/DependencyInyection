package com.springcore.DependencyInyection.Qualifiers;

import com.springcore.DependencyInyection.DependencyInyectionApplication;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Nido {
    @Autowired
    //@Qualifier("pajaro")
    private Animal animal;

   // private static final Logger log = (Logger) LoggerFactory.getLogger(Nido.class);
    private  static final org.slf4j.Logger log = LoggerFactory.getLogger(Nido.class);

    public void imprimir(){
        log.info("Mi nido tiene animal {}", animal.getNombre());

    }
}
