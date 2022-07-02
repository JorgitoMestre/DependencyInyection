package com.springcore.DependencyInyection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure{
   // @Value("2.5")
    @Value("${circle.radius}") //asi se pone cuando los valores los cargo de un
    // fichero de configuracion ej: area.properties
    private double radius;
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
}
