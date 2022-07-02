package com.springcore.DependencyInyection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure{
   // @Value("2.5")
    @Value("${square.side}")
    private double side;
    @Override
    public double calcularArea() {
        return Math.pow(this.side,2);
    }
}
