package com.springcore.DependencyInyection.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements IVolador{
    private  static final Logger log = LoggerFactory.getLogger(Avion.class);

    @Override
    public void Volar() {
        log.info("Soy un avion");
    }
}
