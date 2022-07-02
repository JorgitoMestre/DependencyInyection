package com.springcore.DependencyInyection.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //cdo declaro alguna clase(bean) como primary, no necesito poner la anotacion qualifier, ver clase nido
public class Pajaro extends Animal implements IVolador{

    private  static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("1") int edad, @Value("Piolin") String nombre) {
        super(edad, nombre);
    }

    @Override
    public void Volar() {
        log.info("Estoy Volando");
    }
}
