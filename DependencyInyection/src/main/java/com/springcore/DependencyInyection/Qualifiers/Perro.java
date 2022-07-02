package com.springcore.DependencyInyection.Qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal{
    public Perro(@Value("5") int edad, @Value("Yunior") String nombre) {
        super(edad, nombre);
    }
}
